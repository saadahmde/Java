// Object Creation in Java

// Generating class
public class Object {

// assigning Variables
    String name;
    int age;
    String Technology;
    String Section;
    int RollNumber;
    
// Method to Compile Java code
    public static void main( String[] args){

// Object Creation
        Object student = new Object();

// Assigning Value to the variables 
            student.name =  "Saad Ahmed";
            student.age = 20;
            student.Technology = "Software Engineering";
            student.Section = "B";
            student.RollNumber = 72;

// Printing output           
            System.out.print("Name: "+student.name + "\n");
            System.out.print("Age: "+student.age + "\n");
            System.out.print("Technology "+student.Technology + "\n");
            System.out.print("Section "+student.Section + "\n");
            System.out.print("RollNumber "+student.RollNumber + "\n");
    }
}