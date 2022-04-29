package com.company;

public class Max {
    static final int ASCII_SIZE = 256;

    //    public static void main(String[] args) {
//        String str = "aaaaaffssd";
//        System.out.println(str);
//        char[] sb = str.toCharArray();
//        int len = sb.length;
//        int i = 0, j = 0;
//        String v = str.replaceAll("(.)(?=.*\\1)", "");
//        System.out.println(v);
//        int c = v.length();
//        int[] count = new int[c];
//        for (i = 0; i < c; ++i) {
//            int counter = 0;
//            for (j = 0; j < len; ++j) {
//                if (sb[j] == v.charAt(i)) {
//                    counter++;
//                }
//            }
//            count[i]=  counter;
//
//        }
//        int max = count[0];
//        int key=0;
//        for (i =1; i <count.length; i++){
//            if (count[i] > max){
//                max = count[i];
//                key=i;
//            }
//        }
//        System.out.println("character "+v.charAt(key)+" count "
//                +max);
//    }
    static char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];

        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i=0; i<len; i++)

            count[str.charAt(i)]++;

        int max = -1; // Initialize max count
        char result = ' '; // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        System.out.println(max);

        return result;
    }

    // Driver Method
    public static void main(String[] args)
    {
        String str = "sample string";
        System.out.println("Max occurring character is " +
                getMaxOccuringChar(str));
    }



}
