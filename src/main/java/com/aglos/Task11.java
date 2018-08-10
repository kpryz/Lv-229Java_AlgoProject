/**
 * Author shevromanvk
 */
package com.aglos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Task11 implements Task{

    @Override
    public void solveTask() {
        System.out.println(" Enter number of friends, each one can remain single or " +
                "can be paired up with some other friend. " +
                "Each friend can be paired only once. Program finds out " +
                "the total number of ways in which friends can remain " +
                "single or can be paired up.");

        Integer n = 0;
        boolean tryAgain = true;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (tryAgain) {
            try {
                System.out.println("Enter positive integer: ");
                n = Integer.parseInt(reader.readLine());
                tryAgain = false;
                if (n < 1)
                    throw new Exception();

            } catch (Exception e) {
                tryAgain = true;
            }
        }

        System.out.println(countFriendsPairings(n));

    }

    /**
     * @param n number entered by user
     * @return result of counting task 'Friend pairings'
     */
   static int countFriendsPairings(int n) {
        int dp[] = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i <= 2)
                dp[i] = i;
            else
                dp[i] = dp[i - 1] + (i - 1)
                        * dp[i - 2];
        }

        return dp[n];
    }
}