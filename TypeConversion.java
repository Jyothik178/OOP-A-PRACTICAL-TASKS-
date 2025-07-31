package sample_concept_programs;
public class TypeConversion {
    public static void main(String[] args) {
        int intValue = 1000;              
        long longValue = intValue;        
        float floatValue = longValue;     
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
    }
}