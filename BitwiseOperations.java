package sample_concept_programs;
import java.util.Scanner;
public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second integer (b): ");
        int b = sc.nextInt();
        int and = a & b;
        int or = a | b;
        int xor= a ^ b;
        int leftShift = a << b;
        int rightShift = a >> b;
        System.out.printf("a & b  = %d -> %s\n", and, Integer.toBinaryString(and));
        System.out.printf("a | b  = %d -> %s\n", or, Integer.toBinaryString(or));
        System.out.printf("a ^ b  = %d -> %s\n", xor, Integer.toBinaryString(xor));
        System.out.printf("a << b = %d -> %s\n", leftShift, Integer.toBinaryString(leftShift));
        System.out.printf("a >> b = %d -> %s\n", rightShift, Integer.toBinaryString(rightShift));
        sc.close();
    }
}
