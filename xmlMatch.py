import generateXMLLinebyLine

fileName = r"H:\Research\IndStudyDrxyz\TE\XMLHolders\ASTFieldDeclarationTest\\1.xml"

generateXMLLinebyLine.processXML(fileName)
print(generateXMLLinebyLine.lineCount("t3.xml"))