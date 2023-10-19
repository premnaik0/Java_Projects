package OOCAss;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    LinkedList() {
        head = null;
    }

    void insertBegin(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void insertAfterSpecifiedElement(int value, int ele) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.data == ele) {
                    newNode.next = current.next;
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void deleteBegin() {
        if (head == null) {
            System.out.println("List is empty, Deletion is not possible.");
        } else {
            head = head.next;
        }
    }

    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty, Deletion is not possible.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
    }

    void deleteMiddle(int ele) {
        if (head == null) {
            System.out.println("List is empty, Deletion is not possible.");
        } else if (head.data == ele) {
            head = head.next;
        } else {
            Node current = head;
            Node previous = null;
            while (current != null) {
                if (current.data == ele) {
                    previous.next = current.next;
                    return;
                }
                previous = current;
                current = current.next;
            }
        }
    }

    void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
        } else {
            System.out.print("Linked List: ");
            while (current != null) {
                System.out.print("-> " + current.data);
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int ch, value, ele;

        while (true) {
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert after a specified element");
            System.out.println("4. Delete from the beginning");
            System.out.println("5. Delete from the end");
            System.out.println("6. Delete a specific element");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the value: ");
                    value = sc.nextInt();
                    list.insertBegin(value);
                    list.display();
                    break;
                case 2:
                    System.out.print("Enter the value: ");
                    value = sc.nextInt();
                    list.insertEnd(value);
                    list.display();
                    break;
                case 3:
                    System.out.print("Enter the value: ");
                    value = sc.nextInt();
                    System.out.print("After which element you want to insert: ");
                    ele = sc.nextInt();
                    list.insertAfterSpecifiedElement(value, ele);
                    list.display();
                    break;
                case 4:
                    list.deleteBegin();
                    list.display();
                    break;
                case 5:
                    list.deleteEnd();
                    list.display();
                    break;
                case 6:
                    System.out.print("Enter the element you want to delete: ");
                    ele = sc.nextInt();
                    list.deleteMiddle(ele);
                    list.display();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
