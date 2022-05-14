package com.sample.company;

import java.util.HashMap;

public class MaxLenth {
    public static void main(String args[]){
        String str="asdffd";
        char[] sb=str.toCharArray();
        int len=sb.length;
        int i=0,j=0;
        HashMap<Character,Integer> count=new  HashMap();
        for( i=0;i<len;++i){
            System.out.println(str.charAt(i));
            int counter=0;
            for( j=0;j<len;++j){
                if(sb[j]==sb[i]){
                 counter++;
                }
                count.put(sb[i],counter);
            }
        }
        Character key=count.entrySet().stream().max((entry1, entry2) ->
                entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        System.out.println("char "+key+" count "+count.get(key));
    }
}
