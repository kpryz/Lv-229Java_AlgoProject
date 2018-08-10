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
            System.out.println("This task is about painting the fence");
            System.out.println("Goal: Given a fence with n posts and k colors, find out the number of ways of painting\n" +
                    " the fence such that at most 2 adjacent posts have the same color. ");
            System.out.println("For example: \n We have 4 colors and 2 posts.\n" +
                    "Ways when both posts have same color : 4 \n" +
                    "Ways when both posts have diff color :\n" +
                    "4*(choices for 1st post) * 3(choices for \n" +
                    "2nd post) = 12\n" +
                    "Then the output must be 4+12= 16");
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
