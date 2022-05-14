package com.sample.company.sa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDifferenceBetweenTwoArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> first = new HashSet<>();
        HashSet<Integer> second = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            boolean gotIt=false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    gotIt=true;
                    continue;
                }
            }
            if(!gotIt) {
                first.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            boolean gotIt=false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    gotIt=true;
                    continue;
                }
            }
            if(!gotIt) {
                second.add(nums2[i]);
            }
        }
        List<Integer> finalList1 = new ArrayList<>(first);
        List<Integer> finalList2=new ArrayList<>(second);
        List<List<Integer>> finalList=new ArrayList<>();
        finalList.add(finalList1);
        finalList.add(finalList2);
        return finalList;
    }

    public static void main(String args[]) {

    }
}
