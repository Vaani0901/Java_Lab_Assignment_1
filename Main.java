import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    UserInput userInput = new UserInput();

    System.out.println("Enter two numbers for basic operations: ");
    int[] numbers = userInput.getTwoNumbers(sc);

    Calculator calculator = new Calculator();
    double resultAdd = calculator.performAdditionOperation(numbers);
    double resultSubtract = calculator.performSubstractionOperation(numbers);
    double resultMultiply = calculator.performMultiplicationOperation(numbers);
    double resultDivide = calculator.performDivisionOperation(numbers);

    System.out.println("Addition: " + resultAdd);
    System.out.println("Subtraction: " + resultSubtract);
    System.out.println("Multiplication: " + resultMultiply);
    System.out.println("Division: " + resultDivide);

    System.out.println("Enter size of array: ");
    int size = sc.nextInt();
    int[] array = userInput.getArray(sc, size);

    double[] result = calculator.performArrayOperation(array);

  

    System.out.println("Sum of array: " + result[0]);
    System.out.println("Variance of array: " + result[2]);
    System.out.println("Standard deviation of array: " + result[1]);
  }
}