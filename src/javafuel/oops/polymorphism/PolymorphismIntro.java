package javafuel.oops.polymorphism;


class Student{
  String name;
   int age;

   void printInfo(String name){
       System.out.println(name);
   }

    void printInfo(int age){
       System.out.println(age);
    }

    void printInfo(String name, int age){
       System.out.println(name +' ' + age);
    }
}



public class PolymorphismIntro {
    public static void main(String[] args){

        Student s1 = new Student();

        s1.name = "Aviral";
        s1.age = 34;
        s1.printInfo(s1.name, s1.age);
        s1.printInfo(s1.age);
}

}

