package sample_concept_programs;

import java.util.Scanner;
public class NarrowingConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();       
        int intValue = (int) doubleValue;       
        System.out.println("Double value: " + doubleValue);
        System.out.println("Converted int value: " + intValue);
        scanner.close();
    }
}
