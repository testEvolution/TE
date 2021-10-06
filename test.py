from xml.etree import ElementTree



def parseFunctionName(xmlFileName):
    root = ElementTree.parse(xmlFileName).getroot()
    name = root.find("name").text
    return name


#print(parseFunctionName("fruits.xml"))

def testCodeParser2():
    root = ElementTree.parse("fruits.xml").getroot()
    for name in root.iter("type"):
        print("shim start")
        print(ElementTree.tostring(name, encoding='unicode', method='xml'))
        print("shim end")
        for item in name.findall("name"):
            #print(ElementTree.tostring(item, encoding='unicode', method='xml'))
            print(item.text)

def testCodeParser(xmlFileName):

    root = ElementTree.parse(xmlFileName).getroot()
    for name in root.iter("function"):
        '''
        for item in name.findall("import"):
            if item.text == "tuk":

                return ElementTree.tostring(name, encoding='unicode', method='xml')
        '''
        print( ElementTree.tostring(name, encoding='unicode', method='xml'))

'''
with open("H:\Research\IndStudyDrxyz\TE\XMLHolders\DateRange\\tuk.xml", "rt") as fin:
    with open("H:\Research\IndStudyDrxyz\TE\XMLHolders\DateRange\\tuk_.xml", "wt") as fout:
        for line in fin:
            fout.write(line.replace('http://www.srcML.org/srcML/src', ''))
'''

#testCodeParser(r"H:\Research\IndStudyDrxyz\TE\XMLHolders\DateRange\\tuk_.xml")

def XMLParseWithoutLinebyLine():
    l = 0
    replacedLine =""
    replacedLineTmp =""
    difference = [['>remove<','>notsure<'],['>s1<','>s2<']]
    with open("H:\Research\IndStudyDrxyz\TE\XMLHolders\Output\\Test.xml", "rt") as fin:
        with open("H:\Research\IndStudyDrxyz\TE\XMLHolders\Output\\Output.xml", "wt") as fout:
            for line in fin:
                replacedLineTmp = line
                replacedLine = line
                for row in difference:
                    if row[0] in replacedLineTmp:
                        replacedLine = replacedLineTmp.replace(row[0],row[1])
                        replacedLineTmp = replacedLine

                fout.write(replacedLine)

#XMLParseWithoutLinebyLine()

juk = ['30v2', 41]
for j in juk:
    print(type(j))