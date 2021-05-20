package com.core.operation;

import com.core.vo.Node;

public class Mylistimplement {

    public Node node;
    public Node firstnode;

    public Node lastnode;
    public int size;

    public void add(int data) {
        if (node == null) {
            //node = new Node(data);
            Node tempnode = new Node(data);
            firstnode = tempnode;
            lastnode = tempnode;
            node = tempnode;
            size++;
        } else {
            Node tempnode = new Node(data);
            lastnode = traverseNode(node);
            this.lastnode.next = tempnode;
            // node.next = tempnode;
            lastnode = tempnode;
            //firstnode.next = null;
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
            // Point the new node's next to head
            newnode.next = firstnode;
            // Make the new node as head
            this.firstnode = newnode;
            node = firstnode;
            return;
        } else {
            while (firstnode.next != null && --position > 0) {
                prevnode = currentnode;
                currentnode = currentnode.next;
            }
            prevnode.next = newnode;
            newnode.next = currentnode;

        }
        /*if (node != null) {
            for (int loopindex = 1; loopindex <= position; loopindex++) {
                node = node.next;

               // tempnode = tempnode.next;
                //connectednode = node.next.next;
                //tempnode.next =null;
                //connectednode.next = null;
            }*/

            /*tempnode.next = newnode;
            newnode.next = node;
            node = tempnode;*/
        //tempnode.next.next = connectednode;
        //newnode.next = node.next;

    }




    public void print() {
        if (node != null) {
            Node tempnode = node;
            while (tempnode.next != null) {
                System.out.print(tempnode.data + "->");
                tempnode = tempnode.next;
            }
            System.out.println(tempnode.data);
        }
    }
}
