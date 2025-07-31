package sample_concept_programs;
import java.util.Scanner;

public class ArithemeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();        
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        if (b != 0) {
            System.out.println("Division (a / b): " + (a / b));
            System.out.println("Remainder (a % b): " + (a % b));
        } else {
            System.out.println("Division and modulo not possible (division by zero)");
        }
    }
}

