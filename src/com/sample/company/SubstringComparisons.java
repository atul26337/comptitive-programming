package com.sample.company;


import java.util.Scanner;


public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
//        List<String> list=new ArrayList<>();
//        SortedSet<String> sortedSet=new TreeSet();
//        for(int i=0;i<s.length()-2;i++){
//            sortedSet.add(s.substring(0+i,k+i));
//        }
        String[] strArr=new String[s.length()-2];
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            if(i+k>s.length()){

            }else {
                strArr[i] = s.substring(i, k + i);
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (strArr[i].compareTo(strArr[j]) > 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }




        String smallest = strArr[0];
        String largest = strArr[count-1];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(s.length());
        int k = scan.nextInt();
        scan.close();

    }
}

