package dsa.string;
import java.util.*;

public class ReverseWordWise {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String output = "";
        int end = input.length();
        int i = end - 1;

                while(i > 0){

                    if(input.charAt(i) != ' ' && input.charAt(i - 1) == ' '){
                        output = output + input.substring(i, end);
                        end = i;
                    }
                    else if(input.charAt(i) == ' ' && input.charAt(i - 1) != ' '){
                        output = output + input.substring(i, end);
                        end = i;
                    }
                    i--;
                }
                output = output +  input.substring(i, end);
                 System.out.println(output);
    }
}
