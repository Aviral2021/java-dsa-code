package dsa.linkedList.singly;

 class Node{
     int data;
     Node next;

     Node(int data){
         this.data = data;
         next = null;
     }
}

public class LinkedList02 {
   static void print(Node head){
       Node temp = head;
       while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
       }
   }
     public static void main(String[] args){
         // Created 5 Node with function
         Node n1 = new Node(10);
         // Initialise head with first Node address

         Node head = n1;
         Node n2 = new Node(20);
         Node n3 = new Node(30);
         Node n4 = new Node(40);
         Node n5 = new Node(50);

         // Linking nodes
         n1.next = n2;
         n2.next = n3;
         n3.next = n4;
         n4.next = n5;
         n5.next = null;
         print(head);
     }
}
