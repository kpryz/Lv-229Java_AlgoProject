package com.aglos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Mykhailo Dzhura
 */

public class Task4 implements Task {

    /**
     * ArrayList for the longest query row
     */
    private static ArrayList<Integer> longestQueryList = new ArrayList<Integer>();

    /**
     * Main function
     *
     * @param numbers Integer array - random int numbers, written through comma
     * @return Integer value - quantity of the longest subsequence with difference one
     */
    public static int runTaskFour(int[] numbers) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
//        for (String retval : numbers.split(",")) {
//            nums.add(Integer.valueOf(retval));
//        }
        for (int i = 0; i < numbers.length; i++) {
            nums.add(numbers[i]);
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
            longestQueryList.add(arr[i]);
            // System.out.println("Our array:" + arr[i]);
        }

//        int[] corectArr= new int[1];
//        corectArr[0]=arr.length;
        return arr.length;
    }

    @Override
    public void solveTask() {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Next method finds how many numbers we have with difference one in the maximum sub sequence" +
                "\n" +
                "You should input: sequence with integer numbers ");
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Array element[" + (i + 1) + "]:");
            array[i] = input.nextInt();
        }

        System.out.println("The longest query have size:" + runTaskFour(array));
        System.out.print("This query contain those integers: ");
        for (int e :
                longestQueryList) {
            System.out.print(e + "; ");
        }
        System.out.println();

    }
}