package sample_concept_programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StudentDetails {
    public static void main(String[] args) throws IOException {
    	InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter student's name: ");
        String name = br.readLine();
        System.out.print("Enter roll number: ");
        String rollNumber = br.readLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter gender: ");
        String gender = br.readLine();
        System.out.printf("Name of the student: %s%n",  name);
        System.out.printf("Rollno. of the student: %s%n", rollNumber);
        System.out.printf("Age of the student: %d%n", age);
        System.out.printf("Gender of the student: %s%n",  gender);
    }
}
