package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.display();

        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.append(56);
        linkedList1.append(30);
        linkedList1.append(70);
        linkedList1.display();
    }
}
