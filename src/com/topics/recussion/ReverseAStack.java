package com.topics.recussion;

import java.util.Stack;

public class ReverseAStack {
    void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty()){
            return ;
        }
        int a= s.peek();
        s.pop();
        reverse(s);
        addStack(a,s);

    }

    static void addStack(int x,Stack<Integer> st){
        if (st.size() == 0) {
            st.push(x);
        }
        else {

            // All items are held in Function Call
            // Stack until we reach end of the stack
            // When the stack becomes empty, the
            // st.size() becomes 0, the above if
            // part is executed and the item is
            // inserted at the bottom

            int a = st.peek();
            st.pop();
            addStack( x,st);

            // push allthe items held in
            // Function Call Stack
            // once the item is inserted
            // at the bottom
            st.push(a);
        }
    }


    public static void main(String[] args) {
//        3,2,1,7,6
        Stack<Integer> stack=new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(7);
        stack.push(6);
        ReverseAStack reverseAStack=new ReverseAStack();
        reverseAStack.reverse(stack);
    }

}
