// Lab no 01 Saad Ahmed
// 72



public class Labone {
    String Company;
    int Price;
     String myName;

     // Personal Info
     String name;
     int age;
     int Rollno;
     String technology;
     String Section;



    public static void main(String[] args) {
        Labone mobile = new Labone();

        mobile.Company = "Iphone";
        mobile.Price = 400000;

        System.out.println(mobile.Company);
        System.out.println(mobile.Price);

        Labone student = new Labone();

        student.myName = "Saad Ahmed";
        System.out.println(student.myName);
        student.myName = "Ahmed Butt";
        System.out.println(student.myName);


        // personal Info
        Labone personalInfo = new Labone();

        personalInfo.name = "Saad Ahmed";
        personalInfo.age = 20;
        personalInfo.Rollno = 72;
        personalInfo.technology = "Software Technology";
        personalInfo.Section = "B";


        System.out.println(personalInfo.name);
        System.out.println(personalInfo.age);
        System.out.println(personalInfo.Rollno);
        System.out.println(personalInfo.technology);
        System.out.println(personalInfo.Section);
    }
 }

