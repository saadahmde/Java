// Method Creation

// Lanbtwo 



public class Labtwo {
    // int half;
    // int anotherHalf;

    // Personal info 

    // String name;
    // int age;
    // String fatherName;
    // String technology;

    // Company info 
    String companyName;
    int employees;
    String bossNama;

    // Constructor 
    // public Labtwo (int half , int anotherHalf) {
    //     this.half = half;
    //     this.anotherHalf = anotherHalf;
    // }

    // public void displayInfo() {
    //     System.out.println("half: " + half);
    //     System.out.println("anotherHalf: " + anotherHalf);
    // }


    public static void main(String[] args) {
        // Labtwo mobileNumber1 = new Labtwo(0311026, 5385);
        // Labtwo mobileNumber2 = new Labtwo(031221, 38301);
        // Labtwo personalInfo = new Labtwo();
        Labtwo companyInfo = new Labtwo();
        

        // mobileNumber1.displayInfo();
        // mobileNumber2.displayInfo();

        // personalInfo.name = "Saad Ahmed";
        // personalInfo.age = 20;
        // personalInfo.fatherName = "Sarfaraz Ahmed";
        // personalInfo.technology = "Software Technology";

        // System.out.println("Name " + personalInfo.name + " Age " + personalInfo.age + " FatherName " + personalInfo.fatherName + " Technology " + personalInfo.technology);


        companyInfo.companyName = "SR transport Services";
        companyInfo.employees = 30;
        companyInfo.bossNama = "Boss Name";

        System.out.println("Company Name " + companyInfo.companyName + " Employees " + companyInfo.employees + " Boss name " + companyInfo.bossNama);
    }
    
}    

