package sample_concept_programs;

import java.util.Scanner;
public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int number = scanner.nextInt();
        System.out.print("Enter a float: ");
        float decimal = scanner.nextFloat();
        System.out.print("Enter a double: ");
        double bigDecimal = scanner.nextDouble();
        System.out.print("Enter a char: ");
        char letter = scanner.next().charAt(0);
        System.out.print("Enter a boolean (true/false): ");
        boolean isTrue = scanner.nextBoolean();
        System.out.println("int: " + number);
        System.out.println("float: " + decimal);
        System.out.println("double: " + bigDecimal);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isTrue);
        scanner.close();
    }
}
