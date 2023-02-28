import java.util.Scanner;

public class UserInput{
  public int[] getTwoNumbers(Scanner sc) {
    int[] numbers = new int[2];

    for (int i = 0; i < 2; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      numbers[i] = sc.nextInt();
    }

    return numbers;
  }

  public int[] getArray(Scanner sc, int size) {
    int[] array = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.print("Enter element " + (i + 1) + ": ");
      array[i] = sc.nextInt();
    }

    return array;
  }
}