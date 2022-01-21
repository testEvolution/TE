#https://github.com/c2nes/javalang

import editdistance
import javalang
from xlwt import Workbook

# Workbook is created
wb = Workbook()

# add_sheet is used to create sheet.
sheet1 = wb.add_sheet('Sheet 1', cell_overwrite_ok=True)

tokenGenerated = list()
tokenOracle = list()
'''
fileOracle = open(r"H:\Research\TestEvolution\ASTPattern1Paper\result\gson2.8.9\oracle.java","r")
fileGenerated = open(r"H:\Research\TestEvolution\ASTPattern1Paper\result\gson2.8.9\generated.java","r")
'''
fileOracle = open(r"H:\Research\TestEvolution\ASTPattern1Paper\result\jabRef5.2\oracle.java","r")
fileGenerated = open(r"H:\Research\TestEvolution\ASTPattern1Paper\result\jabRef5.2\generated.java","r")


for line1 in fileGenerated:
    tokens = list(javalang.tokenizer.tokenize(line1))
    tokenOneMethod = list()
    for element in tokens:
        tokenOneMethod.append(element.value)
    tokenGenerated.append(tokenOneMethod)

for line1 in fileOracle:
    tokens = list(javalang.tokenizer.tokenize(line1))
    tokenOneMethod = list()
    for element in tokens:
        tokenOneMethod.append(element.value)
    tokenOracle.append(tokenOneMethod)

lenOracleAll = 0
valOracleAll = 0

for j in range(0,len(tokenOracle)):
    print(tokenOracle[j])
    print(tokenGenerated[j])
    lenOracleAll += len(tokenOracle[j])

for i in range(0, len(tokenGenerated)):
    average = lenOracleAll/len(tokenOracle)
    print(average)
    print("len oracle")
    print(len(tokenOracle[i]))
    print("len generated")
    print(len(tokenGenerated[i]))
    distance = editdistance.eval(tokenOracle[i], tokenGenerated[i])
    print("distance")
    print(distance)

    sheet1.write(i, 0, len(tokenOracle[i]).__str__())
    sheet1.write(i, 1, len(tokenGenerated[i]).__str__())
    sheet1.write(i, 2, distance.__str__())
    sheet1.write(i, 3, average.__str__())


wb.save('output.xls')