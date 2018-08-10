/*
 * Author: Dmytro Kiiko
 */
package com.aglos;

import java.util.Scanner;

public class Task7 implements Task {


    @Override
    public void solveTask() {
        System.out.println("The goal: Calculate our possibility to cover the distance with 1, 2 and 3 steps.");
        System.out.println("Enter the distance: ");
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        System.out.println("The number of possible options:" + countWays(distance));
    }

    /**
     * Counting the amount of possible ways
     *
     * @param distance The given distance
     * @return The amount of possible ways
     */
    static int countWays(int distance) {
        // if the distance equals 0 or 1
        if (distance < 0) {
            return 0;
        } else if (distance == 0) {
            return 1;
        }
        return countWays(distance - 1)
                + countWays(distance - 2)
                + countWays(distance - 3);
    }
}

