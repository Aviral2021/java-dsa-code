package javafuel.collections;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Hello");
        list1.add("Java");

        System.out.println(list);
        System.out.println(list1);

        //get elements

        int element = list.get(1);
        System.out.println(element);

        //add inbetween in list
        list.add(1, 78);
        System.out.println(list);

    }

}
