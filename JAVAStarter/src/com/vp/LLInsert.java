package com.vp;

/**
 * Created by PACHAURI on 27-May-17.
 */
public class LLInsert {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void push(int new_data) {
        Node n = new Node(new_data);
        n.next = head;
        head = n;
    }

    public void insertAfter(Node prev, int data) {
        if (prev == null) {
            System.out.println("The given previous node is null, that means we add a new node at the start");
            push(data);
            return;
        }

        Node new_node = new Node(data);

        new_node.next = prev.next;
        prev.next = new_node;
    }

    public void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    public static void main(String... args) {
        LLInsert myList = new LLInsert();
        myList.append(1);
        myList.append(2);
        myList.push(0);
        myList.insertAfter(myList.head.next.next, 99);
        myList.push(11);
        myList.printList();
    }
}
