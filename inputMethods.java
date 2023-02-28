import java.io.*;
import java.util.Scanner;

public class InputMethodsDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream dis = new DataInputStream(System.in);
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        while (true) {
            System.out.println("Choose an input method:");
            System.out.println("1. Command line arguments");
            System.out.println("2. Scanner");
            System.out.println("3. BufferedReader");
            System.out.println("4. DataInputStream");
            System.out.println("5. Console");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    if (args.length > 0) {
                        System.out.println("Command line arguments:");
                        for (String arg : args) {
                            System.out.println(arg);
                        }
                    } else {
                        System.out.println("No command line arguments provided.");
                    }
                }
                case 2 -> {
                    System.out.println("Scanner input:");
                    System.out.print("Enter a string: ");
                    String input1 = scanner.next();
                    System.out.print("Enter an integer: ");
                    int input2 = scanner.nextInt();
                    System.out.println("String input: " + input1);
                    System.out.println("Integer input: " + input2);
                }
                case 3 -> {
                    System.out.println("BufferedReader input:");
                    System.out.print("Enter a string: ");
                    String input3 = br.readLine();
                    System.out.print("Enter an integer: ");
                    int input4 = Integer.parseInt(br.readLine());
                    System.out.println("String input: " + input3);
                    System.out.println("Integer input: " + input4);
                }
                case 4 -> {
                    System.out.println("DataInputStream input:");
                    System.out.print("Enter a string: ");
                    String input5 = dis.readLine();
                    System.out.print("Enter an integer: ");
                    int input6 = Integer.parseInt(dis.readLine());
                    System.out.println("String input: " + input5);
                    System.out.println("Integer input: " + input6);
                }
                case 5 -> {
                    System.out.println("Console input:");
                    String input7 = console.readLine("Enter a string: ");
                    char[] input8 = console.readPassword("Enter a password: ");
                    int input9 = Integer.parseInt(console.readLine("Enter an integer: "));
                    System.out.println("String input: " + input7);
                    System.out.println("Password input: " + new String(input8));
                    System.out.println("Integer input: " + input9);
                }
                case 6 -> {
                    System.out.println("Exiting program.");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}

