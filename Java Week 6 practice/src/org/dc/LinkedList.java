package org.dc;

public class LinkedList {
    Node head;

    public void add(int data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node nodeToAdd = new Node(data);
            nodeToAdd.next = this.head;
            this.head = nodeToAdd;
        }
    }

    public void remove(int position) {
        int index = 1;
        Node newHead = this.head;
        Node prev = newHead;
        while (index < position) {
            prev = newHead;
            newHead = newHead.next;
            index++;
        }
        prev.next = newHead.next; //
    }
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.add(10);
        myList.add(18);
        myList.add(37);
        myList.add(55);
        myList.add(33);
        myList.add(89);

        Node head = myList.head;
        while(head!=null) {
            System.out.println(head.data);
            head = head.next;
        }


        System.out.println("After removing element : ");
        myList.remove(2);

        while(head!=null) {
            System.out.println(head.data);
            head = head.next;
        }



    }



    //node
    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }

    }



}