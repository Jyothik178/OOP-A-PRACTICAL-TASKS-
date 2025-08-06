package inhertiancetutorial;

public class Multilevelinheritance {

    static class Animal {
        public void eat() {
            System.out.println("Animal is eating.");
        }
    }

    static class Dog extends Animal {
        public void bark() {
            System.out.println("Dog is barking.");
        }
    }

    static class Puppy extends Dog {
        public void weep() {
            System.out.println("Puppy is weeping.");
        }
    }
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
