/*
 * Author: Dmytro Kiiko
 */
package com.aglos;

import java.util.Scanner;

public class Task5 implements Task {
    /**
     * Counting the amount of the ways to sum up a number
     *
     * @param N The number which has to be represented
     * @return The amount of the ways to sum up a number
     */
    static int countWays(int N) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the array");
        int len = scanner.nextInt();
        int arr[] = new int[len];
        System.out.println("Fill the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int count[] = new int[N + 1];

        // base case
        count[0] = 1;

        // counting ways and storing the results
        for (int i = 1; i <= N; i++)
            for (int j = 0; j < arr.length; j++)

                if (i >= arr[j])
                    count[i] += count[i - arr[j]];

        // number of ways
        return count[N];

    }

    @Override
    public void solveTask() {
        System.out.println("The goal: To find how many ways we have to represent one number with a given array of numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number which has to be represented");
        int num = scanner.nextInt();
        System.out.println("The amount of the ways to sum up a number:" + countWays(num));
    }
}

