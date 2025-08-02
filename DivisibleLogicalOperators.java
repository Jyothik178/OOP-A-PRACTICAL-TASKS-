package sample_concept_programs;

import java.util.Scanner;

public class DivisibleLogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible");
        } else {
            System.out.println(num + " is NOT divisible");
        }
        sc.close();
    }
}

