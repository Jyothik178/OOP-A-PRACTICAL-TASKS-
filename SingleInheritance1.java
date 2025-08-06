package inhertiancetutorial;
class Animal {
 public void eat() {
     System.out.println("This animal is eating.");
 }
}
class Lion extends Animal {
 public void roar() {
     System.out.println("The lion is roaring");
 }
}
public class SingleInheritance1 {
 public static void main(String[] args) {
     Lion simba = new Lion();
     simba.eat();
     simba.roar();
 }
}