package DataStructures;
import java.util.Scanner;

public class Linked {
    private Node head;
    private Node tail;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Linked() {
        head = null;
        tail = null;
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            tail = head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null){
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp = null;
    }

    public void deleteList(){
        Node temp;
        while(head != null){
            temp = head.next;
            head = null;
            head = temp;
        }
    }

    public static void main(String[] args) {
        Linked l = new Linked();
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            String value;
            do {
                System.out.println("Enter the operation you want to perform on the linked list: ");
                System.out.println("1. Print List\n2. Insert at Front\n3. Insert at End\n4. Delete\n5. Delete Front\n6. Del End");
                choice = Integer.parseInt(sc.nextLine());
   
                switch (choice) {
                    case 1:
                        System.out.println("Linked List: ");
                        l.display();
                    break;
                    case 2:
                        System.out.println("Enter the value you want to insert at the front: ");
                        value = sc.nextLine();
                        l.addFirst(value);
                    break;
                    case 3:
                        System.out.println("Enter the value you want to insert at the front: ");
                        value = sc.nextLine();
                        l.addLast(value);
                    break;
                    case 4:
                        l.deleteList();
                        System.out.println("Exiting program.\n");
                    break;                
                    case 5:
                        l.deleteFirst();
                        System.out.println("Front deleted.\n");
                    break;
                    case 6:
                        l.deleteLast();
                        System.out.println("End deleted.\n");
                    break;
                    default:
                        System.out.println("Invalid choice. Please try again.\n");
                }
            }while(choice < 6);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}