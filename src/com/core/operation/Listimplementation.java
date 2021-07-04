package com.core.operation;

public class Listimplementation {

    /*public Node node;

    public Node firstnode;

    public Node lastnode;*/

    public static void main(String[] args) {

        Mylistimplement mylistimplement = new Mylistimplement();
        mylistimplement.add(1);
        mylistimplement.add(2);mylistimplement.add(3);mylistimplement.add(4);mylistimplement.add(0);
        mylistimplement.print("Elements in list : ");

        System.out.println("First node data in list: "+mylistimplement.firstnode.data);
        //System.out.println(mylistimplement.lastnode.data);
        //System.out.println(mylistimplement.size);
        //System.out.println(mylistimplement.);
        mylistimplement.addAtIndex(1,5);
        //System.out.println(mylistimplement.firstnode.data);
        mylistimplement.print("List after inserting the element :");
        mylistimplement.deleteAtPosition(1);
        //System.out.println();
        mylistimplement.print("List after deleting at position : ");


    }
}
