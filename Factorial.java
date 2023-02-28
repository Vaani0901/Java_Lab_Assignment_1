import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) throws IOException {
        int number = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream dis = new DataInputStream(System.in);
        Console console = System.console();
        
        if(args.length > 0) {
            number = Integer.parseInt(args[0]);
        } 
        else {
            System.out.println("Enter a number: ");
            System.out.println("1. Using Scanner");
            System.out.println("2. Using BufferedReader");
            System.out.println("3. Using DataInputStream");
            System.out.println("4. Using Console");
            System.out.println("5. Using Command Line Args");
            System.out.print("Enter your choice: ");
            
            int choice = Integer.parseInt(br.readLine());
            
            switch(choice) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter a number: ");
                    number = scanner.nextInt();
                    break;
                    
                case 2:
                    System.out.print("Enter a number: ");
                    number = Integer.parseInt(br.readLine());
                    break;
                    
                case 3:
                    System.out.print("Enter a number: ");
                    number = Integer.parseInt(dis.readLine());
                    break;
                    
                case 4:
                    System.out.print("Enter a number: ");
                    number = Integer.parseInt(console.readLine());
                    break;
                    
                case 5:
                    if(args.length > 0) {
                        number = Integer.parseInt(args[0]);
                    } 
                    else {
                        System.out.println("No command line arguments found.");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        if(number < 0) {
            System.out.println("Factorial of negative number is not possible.");
        } 
        else {
            int result = 1;
            
            for(int i = 1; i <= number; i++) {
                result *= i;
            }
            
            System.out.println("Factorial of " + number + " is " + result);
        }
    }
}

