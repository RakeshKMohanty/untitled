package com.core.vo;

public class Node {

    public int data;
    public Node next;
    /*public Node node;
    public Node firstnode;

    public Node lastnode;
*/
    public Node(){};
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    /*public void add() {
        if (node == null) {
            node = new Node(3);
            firstnode = node;
            lastnode = node;
        }
        else{
            Node tempnode = new Node(4);
            lastnode.next = tempnode;
            lastnode = tempnode;
        }
    }

     public Node getLastnode() {
        return lastnode;
    }

    public Node getFirstnode() {
        return firstnode;
    }*/
}
