/**
 * Author shevromanvk
 */
package com.aglos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Task1 implements Task {


    /**
     * @param n number entered by user
     * @return result of counting task 'Fibonacci'
     */
    public static int fibonacci(int n) {

        int f[] = new int[n + 2];
        int i;
        f[0] = 1;
        f[1] = 1;


        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];

    }

    @Override
    public void solveTask() {
        System.out.println("This app finds number"
                + " of position you'll enter in Fibonacci sequence ");

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
        System.out.println(fibonacci(n + 1));

    }

}