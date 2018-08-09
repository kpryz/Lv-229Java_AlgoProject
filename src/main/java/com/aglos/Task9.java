/*
 *   Made by Oleh Krutiak.
 */
package com.aglos;

import java.util.Scanner;

public class Task9 implements Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter number of days:");
        int n = in.nextInt();
        int[] high = new int[n];
        int[] low = new int[n];
        String tempHigh[] = new String[n];
        String tempLow[] = new String[n];
        String input = new String();
        System.out.println("Please, enter High level priority tasks(Example:3,4,5,6,7):");
        for (int i = 0; i < n; i++) {
            high[i] = in.nextInt();
        }

        System.out.println("Please, enter Low level priority tasks(Example:3,4,5,6,7):");
        for (int i = 0; i < 5; i++) {
            low[i] = in.nextInt();
        }
        System.out.println(maxTasks(high, low, n));
    }

    /**
     * @param high Array of high level priority task price
     * @param low  Array of low level priority task price
     * @param n    Number of days on the work
     * @return Maximum amount of cost
     */
    public static int maxTasks(int high[], int low[], int n) {
        int[] task_dp = new int[n + 1];
        if (n == 0) {
            return task_dp[0] = 0;
        }
        task_dp[1] = high[0];
        for (int i = 2; i <= n; i++) {
            task_dp[i] = Integer.max(high[i - 1] + task_dp[i - 2], low[i - 1] + task_dp[i - 1]);
        }
        return task_dp[n];
    }

    @Override
    public void solveTask() {
        {
            Task9.main(new String[]{});
        }

    }
}

