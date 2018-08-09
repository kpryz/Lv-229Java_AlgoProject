/*
 *
 * Author: Kostiantyn Pryzyhlei
 *
 * Date: 09.08.2018
 *
 */

package com.aglos;

import java.util.Scanner;

/**
 * class Task 2 solves modificated fibonacci problem
 * 1 1 1 2 3 4 6 9 13 ...
 */
public class Task2 implements Task {
    /**
     * this array is for storing modificated Fibonacci sequence
     */
    static double[] fibArr2 = new double[100000];

    /**
     * @param n
     * @return correspondent number in modificated fibonacci sequence
     */
    static double modFibonacci(int n) {
        if (n <= 0 || n > 100000) {
            try {
                throw new Exception("Input value is less than 0 or too big");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        double f = 0;
        if (fibArr2[n - 1] != 0) {
            return fibArr2[n - 1];
        } else if (n <= 3) {
            f = 1;
        } else {
            f = modFibonacci(n - 1) + modFibonacci(n - 3);
            fibArr2[n - 1] = f;
        }
        return f;
    }

    @Override
    public void solveTask() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("This task is connected with modificated Fibonacci sequence - 1 1 1 2 3 4 6 9 13 ...");
            System.out.println("Enter number of element in modificated Fibonacci sequence which you want to see: \n");
            String input = scanner.nextLine();
            int n = Integer.parseInt(input);
            System.out.println(modFibonacci(n));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
