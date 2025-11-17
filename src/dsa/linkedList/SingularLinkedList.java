package dsa.linkedList;

public class SingularLinkedList {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //---- Add First Node - Function

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
          head = newNode;
          return;
        }
        newNode.next = head;
        head = newNode;
    }

    //---- Add last Node - Function
    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
    }

    //----Print Linked List - Function

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
         System.out.println("NULL");
    }

    public static void main(String[] args){
      SingularLinkedList list  =  new SingularLinkedList();
      list.addFirst("a");
      list.addFirst("is");
      list.printList();


    }

}
