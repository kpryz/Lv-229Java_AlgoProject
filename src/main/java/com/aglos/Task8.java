/*
 * Author: Volodymyr Fuks
 */

package com.aglos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task8 implements Task {
    /**
     * Solving task "Paths without crossing"
     * Check input params
     */
    @Override
    public void solveTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number ");
        try {
            int numberOfPoints = scanner.nextInt();
            if (numberOfPoints % 2 == 0) {
                System.out.print(catalanDP(numberOfPoints / 2));
            } else {
                System.out.println("0");
            }
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong input. Please input even positive number");
            solveTask();
        }
    }

    /**
     * Counting in how many different ways is possible to connect n (where n is even) points
     * on a circle such that no two connecting lines cross each other and every point is connected
     * with one other point
     *
     * @param n The number of points
     * @return The amount of paths without crossing
     */
    public static int catalanDP(int n) {
        int[] catalan = new int[n + 1];

        catalan[0] = catalan[1] = 1;

        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++)
                catalan[i] += catalan[j] *
                        catalan[i - j - 1];
        }

        return catalan[n];
    }
}
