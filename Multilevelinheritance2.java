package inhertiancetutorial;

public class Multilevelinheritance2 {	
	static class Person {
	    public void displayInfo() {
	        System.out.println("Displaying person information");
	    }
	}
	static class Student extends Person {
	    String studentID;
	    public Student(String id) {
	        studentID = id;
	    }
@Override	    
public void displayInfo() {
	super.displayInfo();
	System.out.println("Student ID: " + studentID);
	    }
	}
	static class GraduateStudent extends Student {
	    public GraduateStudent(String id) {
	        super(id);
	    }
	    public void submitThesis() {
	        System.out.println("Thesis submitted.");
	    }
	}
	public class AcademicSystemDemo {
	    public static void main(String[] args) {
	        GraduateStudent grad = new GraduateStudent("G12345");
	        grad.displayInfo();    
	        grad.submitThesis();  
	    }
	}
	

}
