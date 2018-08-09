package com.aglos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Mykhailo Dzhura
 */

public class Task4 implements Task{

    /**
     * Main function
     *
     * @param numbers Integer array - random int numbers, written through comma
     * @return Integer value - quantity of the longest subsequence with difference one
     */
    public static int runTaskFour(String numbers) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (String retval : numbers.split(",")) {
            nums.add(Integer.valueOf(retval));
        }
        ArrayList<ArrayList> listOfArray = new ArrayList<ArrayList>();

        ArrayList<Integer> temporary = new ArrayList<Integer>();
        if (nums.get(0) == nums.get(1) - 1) {
            temporary.add(nums.get(0));
        }
        for (int i = 1; i < nums.size(); i++) {
            if (i == nums.size() - 1) {
                if (nums.get(i) == nums.get(i - 1) + 1) {

                    temporary.add(nums.get(i));
                    listOfArray.add((ArrayList) temporary.clone());
                    temporary.clear();
                }
                break;
            }

            if ((nums.get(i) == nums.get(i + 1) - 1) || (nums.get(i) == nums.get(i - 1) + 1)) {
                temporary.add(nums.get(i));

            }

            if ((nums.get(i) != nums.get(i + 1) - 1)) {
                listOfArray.add((ArrayList) temporary.clone());
                temporary.clear();
            }
        }

        int maxRow = listOfArray.get(0).size();
        int counter = 0;
        for (int q = 0; q < listOfArray.size(); q++) {
            if (listOfArray.get(q).size() > maxRow) {
                maxRow = listOfArray.get(q).size();
                counter = q;
            }
        }
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        finalList = (ArrayList<Integer>) listOfArray.get(counter).clone();

//        for (int e :
//                finalList) {
//            System.out.println("Element of FINAL::" + e);
//        }

        int[] arr = new int[finalList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = finalList.get(i).intValue();
           // System.out.println("Our array:" + arr[i]);
        }
        return arr.length;
    }

    @Override
    public void solveTask() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string of numbers, in format like<1,3,4,6,7,3>: ");
        String s = scan.next();
        runTaskFour(s);
    }
}