/*
* Made by Oleh Krutiak
 */

package com.aglos;/*
* Code produced by Oleh Krutiak.
 */

import java.util.Scanner;


public class Task13 implements Task {

    public static void main(String[] args) {
        System.out.println("Goal: Given a fence with n posts and k colors, " +
                "find out the number of ways of painting the fence such that at most 2 adjacent posts have the same color. ");
        System.out.print("Please, enter number of posts:");
        Scanner in = new Scanner(System.in);
        int n = 0, k = 0;
        try {
            n = in.nextInt();
            System.out.print("Please, enter number of colours:");
            k = in.nextInt();
            if (n <= 0 || k <= 0) {
                System.out.println("invalid parameter");
                System.exit(1);
            }
        } catch (Exception e) {
            System.out.println("Incorrect format. Enter positive number.");
            String[] strings = new String[0];
            main(strings);
        }
        System.out.println(numWays(n, k));
    }

    /**
     * @param n Integer number of posts on a fence
     * @param k Integer number of colours available to draw posts
     * @return Number of ways to draw the fence
     */
    public static long numWays(int n, int k) {
        int dp[] = {0, k, k * k, 0};

        if (n <= 2)
            return dp[n];

        for (int i = 2; i < n; i++) {
            dp[3] = (k - 1) * (dp[1] + dp[2]);
            dp[1] = dp[2];
            dp[2] = dp[3];
        }

        return dp[3];
    }

    @Override
    public void solveTask() {
        Task13.main(new String[]{});
    }
}
