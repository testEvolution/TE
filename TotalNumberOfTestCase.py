import os
import filecmp
from datetime import time

import generateXMLLinebyLine
from xml.etree import ElementTree

totalNumberOfTCFound = 0
totalNumberOfMethodsFound = 0

parentRootMain = r"H:\Research\TestEvolution\TE\XMLHolders\P2"
parentRootV2 = r"H:\Research\TestEvolution\TE\XMLHolders\P2\\v2"
# sourceCodePathv2="H:\Research\TestEvolution\DataAnalysis\joda-time-2.10.9\src\main\java\org\joda\time"
parentRootV1 = r"H:\Research\TestEvolution\TE\XMLHolders\P2\\v1"
testCodePathV1 = r"H:\Research\TestEvolution\DataAnalysis\jfreechart-1.5.2\jfreechart-1.5.2\src\test\java\org\jfree"
parentRootTestV1 = r"H:\Research\TestEvolution\TE\XMLHolders\P2\\v1Test"
totalNumberOfTCFoundV1 = 0
totalNumberOfTCFoundV2 = 0

# sourceCodePathv1="H:\Research\TestEvolution\DataAnalysis\joda-time-2.8.2\src\main\java\org\joda\time"
deprecatedMethodListV1 = list()
deprecatedMethodListV2 = list()


def XMLToJava(fileName, outFileName):
    cmd = "srcml " + fileName + " -o " + outFileName
    # print(cmd)
    os.popen(cmd).read()


def parseFunctionName(xmlFileName):
    try:
        root = ElementTree.parse(xmlFileName).getroot()
        name = root.find("name").text
        return name
    except Exception as e:
        print("error occured here")
        return "none"


def javaToXML(nameWithoutPath, fileNameFull, outPath):
    cmd = "srcml " + fileNameFull + " -o " + outPath + nameWithoutPath
    os.popen(cmd).read()


def fileNames(path, extensionSent):
    listOfFilesTemp = list()
    listOfFiles = list()
    for (dirpath, dirnames, filenames) in os.walk(path):
        listOfFilesTemp += [os.path.join(dirpath, file) for file in filenames]
    for item in listOfFilesTemp:
        extension = os.path.splitext(item)[1]

        if extension == extensionSent:
            listOfFiles.append((item))
    return listOfFiles


def javaToXMLPreprocessing(fileNameList, parentRoot, sourceCodePath):
    for name in fileNameList:
        nameParsed = name.rpartition(".java")
        parseName = nameParsed[0].rpartition("\\")
        tuk = name.rpartition(sourceCodePath)
        outFolder = (tuk[2].rpartition(".java"))
        if not os.path.exists(parentRoot + outFolder[0]):
            os.makedirs(parentRoot + outFolder[0], 0o777)
        javaToXML(parseName[2] + ".xml", name, parentRoot + outFolder[0] + r"\\")


def removeExtraBracket(xmlFile):
    try:
        with open(xmlFile, 'rb+') as f:
            f.seek(f.tell() - 1, 2)  # f.seek(0,2) is legal for last char in both python 2 and 3 though
            chu = f.read()
            my_str_as_bytes1 = str.encode("}")
            my_str_as_bytes2 = str.encode(")")
            if my_str_as_bytes1 == chu or my_str_as_bytes2 == chu:
                f.seek(-1, os.SEEK_END)
                f.truncate()
    except Exception as e:
        print("print error ")
        print(e)



def parseFunctionTest(xmlFile, elementName, functionStorePath):
    # print("location")

    # print(functionStorePath)
    try:
        root = ElementTree.parse(xmlFile).getroot()
    except Exception as e:
        print(e)
    elements = list()
    elementCount = 0
    try:
        for item in root.iter(elementName):
            # print(ElementTree.tostring(item, encoding='unicode', method='xml'))
            file = open(functionStorePath + r"\\" + elementCount.__str__() + ".xml", "wt")
            file.write("<unit>")
            file.write(ElementTree.tostring(item, encoding='unicode', method='xml'))
            file.write("</unit>")
            file.close()

            outPath = functionStorePath + r"\\" + elementCount.__str__() + ".java"
            XMLToJava(functionStorePath + r"\\" + elementCount.__str__() + ".xml", outPath)

            elementCount += 1
            elements.append(ElementTree.tostring(item, encoding='unicode', method='xml'))
    except Exception as e:
        print("error occured ")
        print(e)
    return elements

def XMLParserTestCode(XMLfileNameList, parentRoot):
    count = 0
    for item in XMLfileNameList:
        # itemTemp = r"H:\Research\TestEvolution\TE\XMLHolders\P2\v2\xmlTemp\temp.xml"
        itemTemp = parentRoot + r"\xmlTemp\temp.xml"

        with open(item, "rt") as fin:
            with open(itemTemp, "wt") as fout:
                for line in fin:
                    fout.write(line.replace('http://www.srcML.org/srcML/src', ''))
            # print("-----------------------------")
            # print(item)
            functionStorePath = item.rpartition("\\")[0]
            elementsFetched = parseFunctionTest(itemTemp, "function", functionStorePath)
            # print("elements fetched")
            # print(elementsFetched)


def findDeprecatedMethodsInTestCase(functionsTestAll):
    global totalNumberOfTCFound
    global totalNumberOfMethodsFound
    toCheck = "@Test"
    for item in functionsTestAll:
        file = open(item, "rt")
        for line in file:
            if toCheck in line:
                totalNumberOfTCFound += 1
                totalNumberOfMethodsFound += 1

                break



def do():

    testfileNameListV1 = fileNames(testCodePathV1, ".java")

    javaToXMLPreprocessing(testfileNameListV1, parentRootTestV1, testCodePathV1)
    XMLfileNameListTestV1 = fileNames(parentRootTestV1, ".xml")
    XMLParserTestCode(XMLfileNameListTestV1, parentRootTestV1)

    functionsTestAll = fileNames(parentRootTestV1, ".java")
    print("Total Methods in Test Suite")
    print(len(functionsTestAll))
    findDeprecatedMethodsInTestCase(functionsTestAll)
    print("Total TC")
    print(totalNumberOfTCFound)




do()
