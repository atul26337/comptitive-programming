//package com.sample.company;
//
//public class CircularQueue {
//    int rear;
//    int size;
//    int front;
//    int[] queue=new int[size];
//
//    public CircularQueue(int size) {
//        front = -1;
//        rear = -1;
//        size = size;
//    }
//
//    public boolean isFull(){
//        if(rear+1==front ||front==0&& rear==size-1) {
//            return true;
//        }
//        return false;
//    }
//    public void enQueue(int value){
//        if(isFull()){
//            System.out.println("queue is full");
//            return;
//        }
//        if(rear==-1){
//            rear=0,front=0;
//        }
//    }
//}
