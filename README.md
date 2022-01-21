# TSE
#To run TSE, TSE.py needs to be executed with source code v1, source code v2 and test code path in the code. The output will be generated inside "TE\XMLHolders\Output" folder. The file name is tmp.txt. 

#For the evalution, test case is generated for the test cases having ground truth. TSEEvaluation.Py file needs to be executed to get the output. The evaluation output will also be availabe under "TE\XMLHolders\Output" folder. The name for the generated test cases file is "generated.txt". The oracle will be available in "oracle.txt" file.

#Tokenbased evolution is done using "evaluationTokenByTokenEditDistance.py". Only the generated file and oracle file location need to be provided.

#Code2Vec evaluation is available in "EvaluationTSECode2Vec.ipynb" file that we ran on Google Colab. The instructions to run are provided in the file.


Dependency:
The following dependencies need to be installed.
SrcML : https://www.srcml.org/
Trang : https://relaxng.org/jclark/trang.html
