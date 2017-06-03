# Coursework for Software Engineering 
Welcome to the cinema system for general cinema transactions.
## 1. Brief introduction for basic functions
1. Set the films and schedules using the XML-format file.
2. Present the films & schedules and provide the user the user-friendly UI to complete the whole process to get the tickets they want.
3. The system has been designed to provide the cinema managers a well-designed solution on purchase information storage and info-reviewing using a XML file with a predefined format.
4. The system can generate a report on the one day's sale.
## 2. How to launch the system?
Please follow the steps below to configure and start the application!

1. Extract the zip file and you will get the directory named "Coursework By Myself".
2. Open the terminal, then locate to the directory "Coursework By Myself".
3. Compile the application using the command below(**You need to make sure that your computer has already had JAVA!**)
```
mkdir bin
javac -d ./bin ./src/Controller/*.java ./src/Model/*.java ./src/Service/*.java ./src/AppEntrance/*.java ./src/View/*.java ./src/test/Service/*.java -cp ./lib/dom4j-1.6.1.jar:./lib/junit-4.12.jar
```
4. Then launch the application using the command below:
```
java -cp bin/:lib/dom4j-1.6.1.jar AppEntrance.App
```
5. **Then you can follow the user-manual to enjoy your experience**
# Thank you for your support, contact us:
- Github Page: https://github.com/FounderG/CourseworkByMyself
- Email: yiming.gao@se14.qmul.ac.uk

## **PS: If you want to run the JUnit Test, You can use the command below**:
```
java -cp ./bin:./lib/junit-4.12.jar junit.textui.TestRunner test.Service.CharacterParserTest
```
```
java -cp ./bin:./lib/junit-4.12.jar junit.textui.TestRunner test.Service.XMLManagerTest
```
 
