package dsa.string;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {
        // string declaration
//        String name = "Aviral";
//        String fullname = "Aviral Chanket";
//        String sentence = "My name is Aviral Chanket";
//
//        System.out.println(sentence);

        // string takes as a input from user
//      Scanner sc = new Scanner(System.in);
//
//      String name = sc.next(); // for  input single word
//      String name1 = sc.nextLine(); // for input sentence
//
//      System.out.println("your name is " + name);
        // ---> String manupulations functions

        //-----1 - Concatenation
//
//        String firstname = "Aviral";
//        String lastName = "Chanket";
//        String fullName = firstname + " " + lastName;
//        System.out.println(fullName);
//        System.out.println(fullName.length());
//
//        //--2 - charAt()
//        for(int i = 0; i < fullName.length(); i++){
//            System.out.print(fullName.charAt(i));
//        }

        //--3 -- Compare

//        String str1 = "Aviral";
//        String str2 = "Chanket";
        // cases
        //1 - s1 > s2  +ve value
        //2 - s1 == s2  0 value
        //3 - s1 < s2  -ve value
//        if(str1.compareTo(str2) == 0){
//            System.out.println("String are equal");
//        }
//        else System.out.println("Strings are not equal");



    //Note - > we can use also == for check but not recommende sometimes it fails and testcases also fail in contests


    //4 -- subString

        //substring(Starting index, end index)
//             starting index - included
//                end index - not included

    String sentence = "My name is aviral Chanket";


    String name = sentence.substring(14, sentence.length());
    System.out.println(name);
}
}
