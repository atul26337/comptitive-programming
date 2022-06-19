package com.topics.linklist;

import com.sample.company.Array;

import java.util.Arrays;
import java.util.List;

public class MergeTwoLinkListAndSort {
    public static  class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempList1=list1;
        ListNode result=null;
        ListNode tempList2=list2;
        int size=0;
        while (tempList1!=null){
            ListNode temp1=result;
            ListNode toBeAdded=new ListNode(tempList1.val);
            if(result==null){
                result=toBeAdded;
                tempList1=tempList1.next;
                size++;

                continue;
            }
            while (temp1.next !=null){
                temp1=temp1.next;
            }
            temp1.next=toBeAdded;
            size++;
            tempList1=tempList1.next;
        }


        while (tempList2!=null){
            ListNode temp1=result;
            ListNode toBeAdded=new ListNode(tempList2.val);
            if(result==null){
                result=toBeAdded;
                tempList2=tempList2.next;
                size++;

                continue;
            }
            while (temp1.next !=null){
                temp1=temp1.next;
            }
            temp1.next=toBeAdded;
            size++;
            tempList2=tempList2.next;
        }

        int[] arr=new int[size];
        ListNode temp=result;
        int i=0;
        while (temp!=null){
            arr[i]=temp.val;
            temp=temp.next;
            i++;
        }

        Arrays.sort(arr);
        i=0;
        temp=result;
        while (temp!=null){
            temp.val=arr[i];
            temp=temp.next;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,4};
        int[] arr2={1,3,4};
        ListNode listNode1 = null;
        for (int t=0;t<arr1.length;t++){
            ListNode toBeAdded=new ListNode(arr1[t]);
            ListNode temp1=listNode1;
            if(listNode1==null){
                listNode1=toBeAdded;
                continue;
            }
            while (temp1.next !=null){
                temp1=temp1.next;
            }
            temp1.next=toBeAdded;
        }
        ListNode listNode2 = null;
        for (int t=0;t<arr2.length;t++){
            ListNode toBeAdded=new ListNode(arr2[t]);
            ListNode temp1=listNode2;
            if(listNode2==null){
                listNode2=toBeAdded;
                continue;
            }
            while (temp1.next !=null){
                temp1=temp1.next;
            }
            temp1.next=toBeAdded;
        }

        MergeTwoLinkListAndSort mergeTwoLinkListAndSort=new MergeTwoLinkListAndSort();
        mergeTwoLinkListAndSort.mergeTwoLists(listNode1,listNode2);
    }
}
