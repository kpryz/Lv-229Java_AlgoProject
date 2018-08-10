package com.aglos;
/*
 * Author: Volodymyr Fuks
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 implements Task {
    /**
     * Solving task "Ways to write n as sum of two or more positive integers"
     * Check input params
     */

    @Override
    public void solveTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number ");
        try {
            int inputNumber = scanner.nextInt();
            System.out.print(countWays(inputNumber));
        } catch (InputMismatchException | NegativeArraySizeException e) {
            System.out.println("Please input positive number");
            solveTask();
        }
    }

    /**
     * Counting in how many different ways is possible to present number as sum of positive integers
     *
     * @param n The number which has to be represented
     * @return The amount of the ways to sum up a number
     */
    public static int countWays(int n) {
        int table[] = new int[n + 1];
        Arrays.fill(table, 0);
        table[0] = 1;
        for (int i = 1; i < n; i++)
            for (int j = i; j <= n; j++)
                table[j] += table[j - i];
        return table[n];
    }
}
