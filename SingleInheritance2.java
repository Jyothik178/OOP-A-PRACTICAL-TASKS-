package inhertiancetutorial;
class Vehicle {
 public void move() {
     System.out.println("The vehicle moves forward.");
 }
}
class Car extends Vehicle {
 public void fuelType() {
     System.out.println("This car runs on petrol.");
 }
}
public class SingleInheritance2 {
 public static void main(String[] args) {
     Car myCar = new Car();
     myCar.move();     
     myCar.fuelType();  
 }
}