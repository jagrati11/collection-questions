package com.collectionquestions;

import java.util.LinkedList;

/**
 * Created by Jagrati on 26-01-2019.
 */
public class LinkedListProgram {


    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        Employee employee1=new Employee("ram",1);
        Employee employee2=new Employee("sam",2);
        Employee employee3=new Employee("vam",3);
        Employee employee4=new Employee("pam",4);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

       // System.out.println(list);

        findNode(2,list);

    }


    public static void findNode(int n,LinkedList list){
            int indexFromLast= list.size() -n;
            Employee e= (Employee) list.get(indexFromLast);
            System.out.println("nth element is:");
            System.out.println(e);

    }
}
