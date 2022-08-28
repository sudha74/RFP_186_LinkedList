package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(56);

        linkedList.insert(30);

        linkedList.popLast();

        if (linkedList.search(30) != null) {
            System.out.println("Data found");
        } else {
            System.out.println("Data not found");
        }

        linkedList.display();
    }
}
