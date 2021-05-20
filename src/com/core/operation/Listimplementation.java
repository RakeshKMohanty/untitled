package com.core.operation;

import com.core.vo.Node;

import java.util.LinkedList;
import java.util.List;

public class Listimplementation {

    /*public Node node;

    public Node firstnode;

    public Node lastnode;*/

    public static void main(String[] args) {

        Mylistimplement mylistimplement = new Mylistimplement();
        mylistimplement.add(1);
        mylistimplement.add(2);mylistimplement.add(3);mylistimplement.add(4);mylistimplement.add(0);
        mylistimplement.print();

        System.out.println("First node data : "+mylistimplement.firstnode.data);
        //System.out.println(mylistimplement.lastnode.data);
        //System.out.println(mylistimplement.size);
        //System.out.println(mylistimplement.);
        mylistimplement.addAtIndex(1,5);
        System.out.println(mylistimplement.firstnode.data);
        mylistimplement.print();
        List<String> list = new LinkedList<>();
        list.add(0,"a");
    }

    /*public void add() {
        if (node == null) {
            node = new Node(3);
            firstnode = node;
            lastnode = node;
        }
        else{
            Node tempnode = new Node(4);
            getLastnode().next = tempnode;
            lastnode = tempnode;
        }
    }*/

   /* public Node getLastnode() {
        return node;
    }

    public Node getFirstnode() {
        return node;
    }*/
}
