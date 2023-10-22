package DataStructures;
import java.util.Scanner;

public class LL {

    class Node {
    int info;
    Node link;
    Node(int val) {
        this.info = val;
        this.link = null;
    }
}
    static Scanner sc = new Scanner(System.in);
    Node head;

    LL() {
        head = null;
    }

    void insertAtFront() {
        System.out.println("Enter the value: ");
        int val = sc.nextInt();
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.link = head;
        head = newNode;
    }
    
    void insertAtEnd() {
        System.out.println("Enter the value: ");
        int val = sc.nextInt();
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.link != null) {
            currNode = currNode.link;
        }
        currNode.link = newNode;      
    }
    void insertAtParticularNode() {
        System.out.println("Enter the value: ");
        int val = sc.nextInt();
        System.out.println("Enter the position where you want to insert: ");
        int pos = sc.nextInt();
        Node newNode = new Node(val);
        if(head == null){
            System.out.println("List is empty.");;
            return;
        }
        Node currNode = head;
        while(currNode.link != null && currNode.info != pos) {
            currNode = currNode.link;
        }
        currNode.link = newNode;    
    }

    void printList() {
        Node currNode = head;
        System.out.print("The elements present in list are: ");
        while(currNode != null) {
            System.out.print(currNode.info + " ");
            currNode = currNode.link;
        }
        System.out.println();
    }

    void deleteNode() {
        System.out.println("Enter the node to delete: ");
        int val = sc.nextInt();
        Node currNode = head;
        while(currNode.link.info != val) {
            currNode = currNode.link;
        }
        currNode.link = currNode.link.link;
    }


    public static void main(String[] args) {
        LL list = new LL();
        boolean flag = true;
        text();
        do {
            switch(sc.nextInt()) {
                case 1 -> list.insertAtFront();
                case 2 -> list.insertAtEnd();
                case 3 -> list.insertAtParticularNode();
               case 4 -> list.deleteNode();
               // case 5 -> list.deleteFront();
                case 13 -> flag = false;
            }
            list.printList();
        } while(flag);
    }
    public static void text() {
        String textBlock = """
                Enter the following digits for respective operations:
                1 - Insert at Front of Linked List
                2 - Insert at Back of Linked List
                3 - Insert at particular position
                4 - Delete a particular element
                5 - Delete at Front
                6 - Delete at Back
                7 - Delete entire list
                8 - Replace an element
                9 - Search an element
                10 - Reverse the list
                12 - Sort list
                13 - Exit
                Enter the appopriate digit:""";
                System.out.print(textBlock +" ");
    }
}
