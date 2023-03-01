# Java_Lab_Assignment_1

Part1: Input Methods Java Program
This Java program provides a menu-driven interface to demonstrate various ways of taking user input in Java. Here's a brief overview of each input method:

Command Line Arguments: Command line arguments are the arguments passed to the main method of a Java program when it is run. These arguments can be accessed using the args parameter of the main method.
Scanner Class: The Scanner class can be used to read input from the console. It provides various methods for reading different types of input, such as nextInt(), nextDouble(), nextLine(), etc.
BufferedReader Class: The BufferedReader class can also be used to read input from the console. It provides a readLine() method that reads a line of text from the console.
DataInputStream Class: The DataInputStream class can be used to read input from the console in binary format. It provides various methods for reading different types of binary data, such as readInt(), readDouble(), readUTF(), etc.
Console Class: The Console class can be used to read input from the console without using a Scanner or BufferedReader. It provides various methods for reading different types of input, such as readLine(), readPassword(), etc.




Part2: Calculator Java Program

This Java program provides a menu-driven interface to perform basic arithmetic operations such as addition, subtraction, multiplication, division, square root, power, mean, and variance. The program uses a separate Calculator class that includes all related functions.

Sure, here are more detailed instructions for each program:

Part1: Input Methods Java Program
This Java program provides a menu-driven interface to demonstrate various ways of taking user input in Java. Here's a brief overview of each input method:

Command Line Arguments: Command line arguments are the arguments passed to the main method of a Java program when it is run. These arguments can be accessed using the args parameter of the main method.
Scanner Class: The Scanner class can be used to read input from the console. It provides various methods for reading different types of input, such as nextInt(), nextDouble(), nextLine(), etc.
BufferedReader Class: The BufferedReader class can also be used to read input from the console. It provides a readLine() method that reads a line of text from the console.
DataInputStream Class: The DataInputStream class can be used to read input from the console in binary format. It provides various methods for reading different types of binary data, such as readInt(), readDouble(), readUTF(), etc.
Console Class: The Console class can be used to read input from the console without using a Scanner or BufferedReader. It provides various methods for reading different types of input, such as readLine(), readPassword(), etc.
To run the program, compile the Java file InputMethods.java using the following command:

bash
Copy code
javac InputMethods.java
Then run the compiled Java program using the following command:

bash
Copy code
java InputMethods
The program will display a menu with the above input methods. You can select any of the options to try out the corresponding input method. The program will then prompt you to enter some input using the selected input method.

Part2: Calculator Java Program
This Java program provides a menu-driven interface to perform basic arithmetic operations such as addition, subtraction, multiplication, division, square root, power, mean, and variance. The program uses a separate Calculator class that includes all related functions.

The program will display a menu with the arithmetic operations. You can select any of the options to perform the corresponding operation. For the mean calculation option, the program reads numbers from the keyboard, summing them in the process until the user enters the string “end”. It then stops input and displays the average of the numbers.

Here's a brief overview of each arithmetic operation:

Addition: Adds two numbers and returns the result.
Subtraction: Subtracts two numbers and returns the result.
Multiplication: Multiplies two numbers and returns the result.
Division: Divides two numbers and returns the result.
Square Root: Calculates the square root of a number and returns the result.
Power: Calculates the power of a number and returns the result.
Mean: Calculates the mean of a list of numbers entered by the user.
Variance: Calculates the variance of a list of numbers entered by the user.
