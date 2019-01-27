package com.collectionquestions;

import java.util.Scanner;

/**
 * Created by Jagrati on 26-01-2019.
 */
public class LinkedList {

    Node node; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(int data, LinkedList list){
        Node new_Node= new Node(data);

        if(list.node == null){
            list.node=new_Node;
        }
        else{
            Node curnode=list.node;
            while(curnode.next != null){
                curnode=curnode.next;
            }

            curnode.next=new_Node;
            //list.node=curnode;
        }

        return list;
    }

    public static Node findNodeFromLast (LinkedList list,int indexFromLast){
        Node node=null;
        int count=0;
        int size=size(list);
        int indexFromFirst=size-indexFromLast;

        Node currentNode = list.node;

        while (currentNode.next != null){
            count++;
            //System.out.println(count+" "+indexFromFirst+1);
            if(count == indexFromFirst+1){
                node=currentNode;
            }
            currentNode=currentNode.next;
        }
        if(currentNode.next == null && size == indexFromFirst+1 ){
            node=currentNode;
        }
        return node;
    }

    public static int size(LinkedList list){
        int size=1;
        Node currentnode=list.node;
        while(currentnode.next !=null){
            currentnode=currentnode.next;
            size++;
        }
        return size;
    }
    public static void main(String[] args) {
        LinkedList l=new LinkedList();

        l=insert(10,l);
        l=insert(11,l);
        l=insert(12,l);
        l=insert(13,l);
        l=insert(14,l);
        l=insert(15,l);
        l=insert(16,l);
        l=insert(17,l);
        l=insert(18,l);
        l=insert(19,l);
        int size=size(l);
        System.out.println(size);
        Node n =l.node;
        System.out.println("LinkedList: ");
        while(n!= null){
        System.out.println(n.data);
        n=n.next;
        }

        Node currNode = l.node;
        System.out.print("Enter no of element from last you want: ");
        Scanner s= new Scanner(System.in);
       int no= s.nextInt();

        Node node=findNodeFromLast(l,no);
        System.out.println(node.data);
      }
    }
