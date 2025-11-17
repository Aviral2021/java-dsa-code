package javafuel.oops;

class Student{
    String name;
    int rollNumber;

    // 1️⃣ Default Constructor
    Student(){
        System.out.println("Default contructor called");
    }

    // 2️⃣ Parameterized constructor
    Student(String name, int rollNumber){
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.rollNumber = rollNumber;
    }
    // 3️⃣ Copy constructor constructor
    Student(Student s){
        System.out.println("Copy constructor call");
        this.name = s.name;
        this.rollNumber = s.rollNumber;

    }

    void printInfo(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }
}
public class ConstructorMethods {
    public static void main(String[] args){

        // 1️⃣ Default constructor
        Student s1 = new Student(); // default constructor called here

        // 2️⃣ Parameterized constructor
        Student s2 = new Student("Abhishek", 4567);
         s2.printInfo();

        // 3️⃣ Copy constructor constructor
        Student s3 = new Student(s2);
        s3.printInfo();
    }
}




