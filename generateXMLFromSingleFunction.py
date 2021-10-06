import os

fileName = "next.java"

#cmd = 'srcml ' + "'" + fileName + "'"
cmd = r'srcml H:\Research\IndStudyDrxyz\ExistingToolsDatasets\scrML\srcML\r.java -o r.xml'
so = os.popen(cmd).read()

'''
fileName = "Year.java"
cmd = r'srcml H:\Research\IndStudyDrxyz\ExistingToolsDatasets\scrML\srcML\Year.java -o Year.xml'
so = os.popen(cmd).read()

'''

fileName = "CommitData.java"
cmd = r'srcml CommitData.java -o CommitData.xml'
so = os.popen(cmd).read()

cmd = r'java -jar trang.jar r.xml r.xsd'
cmd = r'java -jar trang.jar H:\Research\IndStudyDrxyz\TE\XMLHolders\8.xml 8.xsd'
so = os.popen(cmd).read()