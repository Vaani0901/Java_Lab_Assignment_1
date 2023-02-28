import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) throws IOException {
        int choice = 0;
        do {
            System.out.println("Please choose an input method:");
            System.out.println("1. Command line args");
            System.out.println("2. Scanner");
            System.out.println("3. BufferedReader");
            System.out.println("4. DataInputStream");
            System.out.println("5. Console");
            System.out.println("6. Exit");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(reader.readLine());

            int number;
            switch (choice) {
                case 1:
                    number = Integer.parseInt(args[0]);
                    break;
                case 2:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Please enter a number:");
                    number = scanner.nextInt();
                    break;
                case 3:
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Please enter a number:");
                    number = Integer.parseInt(reader.readLine());
                    break;
                case 4:
                    DataInputStream dis = new DataInputStream(System.in);
                    System.out.println("Please enter a number:");
                    number = Integer.parseInt(dis.readLine());
                    break;
                case 5:
                    Console console = System.console();
                    if (console == null) {
                        System.out.println("Console not available");
                        continue;
                    }
                    System.out.println("Please enter a number:");
                    number = Integer.parseInt(console.readLine());
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + number + " is " + factorial);

        } while (choice != 6);
    }
}
