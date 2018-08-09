/*
 *
 * Author: Kostiantyn Pryzyhlei
 *
 * Date: 09.08.2018
 *
 */
package com.aglos;

import java.util.Scanner;

public class Task14 implements Task {
    public static double countWays(int n, int k) {
        double total = k;
        double same = 0;
        double diff = k;

        for (int i = 2; i <= n; ++i) {
            same = diff;
            diff = total * (k - 1);
            total = same + diff;
        }

        return total;
    }

    @Override
    public void solveTask() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter n: \n");
            String input = scanner.nextLine();
            int n = Integer.parseInt(input);
            System.out.println("Enter k: \n");
            input = scanner.nextLine();
            int k = Integer.parseInt(input);
            System.out.println(countWays(n, k));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
