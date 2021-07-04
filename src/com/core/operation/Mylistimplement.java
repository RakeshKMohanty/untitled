package com.core.operation;

import com.core.vo.Node;

public class Mylistimplement {

    public Node node;
    public Node firstnode;
    public Node lastnode;
    public int size;

    public void add(int data) {
        if (node == null) {
            Node tempnode = new Node(data);
            firstnode = tempnode;
            lastnode = tempnode;
            node = tempnode;
            size++;
        } else {
            Node tempnode = new Node(data);
            lastnode = traverseNode(node);
            this.lastnode.next = tempnode;
            lastnode = tempnode;
            size++;
        }
    }

    public Node traverseNode(Node node) {
        Node traversenode = node;
        while (traversenode.next != null) {
            traversenode = traversenode.next;
        }
        return traversenode;
    }

    public Node getFirstnode() {
        firstnode = node;
        firstnode.next = null;
        return firstnode;
    }

    public void addAtIndex(int position, int data) {

        Node newnode = new Node(data);
        Node prevnode = firstnode;
        Node currentnode = firstnode;
        if (position == 1) {
            newnode.next = firstnode;
            this.firstnode = newnode;
            node = firstnode;
            // return;
        } else {
            while (firstnode.next != null && --position > 0) {
                prevnode = currentnode;
                currentnode = currentnode.next;
            }
            prevnode.next = newnode;
            newnode.next = currentnode;
        }
    }

    public void deleteAtPosition(int position) {
        Node currentnode = firstnode;
        Node previousnode = firstnode;
        if (position == 1) {
            currentnode = firstnode.next;
            node = currentnode;
        } else {
            while (currentnode.next != null && --position > 0) {
                previousnode = currentnode;
                currentnode = currentnode.next;
            }
            previousnode.next = currentnode.next;
        }
    }


    public void print(String msg) {
        System.out.print(msg);
        if (node != null) {
            Node tempnode = node;
            while (tempnode.next != null) {
                System.out.print(tempnode.data + "->");
                tempnode = tempnode.next;
            }
            System.out.print(tempnode.data);
        }
        System.out.println();

    }
}
