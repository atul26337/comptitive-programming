package com.sample.company;

public class LinklistImplimentation {
    Node head;
     static class Node{
         int data;
         Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

    }
    public void insert(int data){
        Node nodeToBeAdded=new Node(data);
        Node temp=head;
        if(head==null){
            head=nodeToBeAdded;
            return;
        }

        while (temp.next!=null){
           temp = head.next;
        }
        temp.next=nodeToBeAdded;
    }

    public void delete(int index){
        Node temp=null;
        Node n=head;
        if(index==0){
            head=n.next;
            return;
        }
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        temp=n.next;
        n.next=temp.next;
    }
    public void show(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insertAtStart(int value){
         Node toBeAdded=new Node(value);
         toBeAdded.next=head;
         head=toBeAdded;
    }
    public void insertAtSpecificLocation(int index,int data){
         Node  temp=new Node(data);
         Node n=head;
        if(index==0){
            temp.next=head;
            head=temp;
            return;
        }
         for(int i=0;i<index-1;i++){
             temp=temp.next;
         }
         temp.next=n.next;
         n.next=temp;
    }
    public int get(int index){
         Node n=head;
         if(index==0){
             return n.data;
         }
         for (int i=0;i<index;i++){
             n=n.next;
         }
         return n.data;
    }
    public static void main(String[] args){
         LinklistImplimentation linklistImplimentation=new LinklistImplimentation();
         linklistImplimentation.insert(12);
         linklistImplimentation.insert(23);
         linklistImplimentation.insert(45);
         linklistImplimentation.insertAtSpecificLocation(1,34);
//         linklistImplimentation.delete(1);
         linklistImplimentation.insertAtStart(2);
         linklistImplimentation.show();

        int a=linklistImplimentation.get(2);
        System.out.println("get index element->\t"+a);
    }


}
