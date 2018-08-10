package com.aglos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Mykhailo Dzhura
 */

public class Task3 implements Task {

    /**
     * ArrayList for Jacobstal row
     */
    private static ArrayList<Integer> JacobstalNumbersList = new ArrayList<Integer>();

    /**
     * Initialisation of Jacobstal row
     */
    private static void initJacobstalList() {
        if (JacobstalNumbersList.isEmpty()) {
            JacobstalNumbersList.add(0);
            JacobstalNumbersList.add(1);
            for (int i = 2; i < 20; i++) {
                JacobstalNumbersList.add(JacobstalNumbersList.get(i - 1) + 2 * JacobstalNumbersList.get(i - 2));
            }
        }
    }

    /**
     * Print Jacobstal row
     */
    public static void printAllJacobstalRow() {
        System.out.println("All Jacobstal row:");
        for (int i = 0; i < JacobstalNumbersList.size(); i++) {
            System.out.println("Position[" + i + "]:" + JacobstalNumbersList.get(i));
        }
    }

    /**
     * Main function
     *
     * @param position - of element in Jacobstal row
     * @return value of element by position
     */
    public static int runTaskThree(int position) {
        initJacobstalList();
        if (JacobstalNumbersList.get(position) != null) {
            return JacobstalNumbersList.get(position);
        } else {
            System.out.println("We have only first 20 elements of this row:(((");
        }
        return 0;
    }

    @Override
    public void solveTask() {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "Next method finds which is the member of position (n) in our Jacobstal row.\nJacobstal row looks like: 1 1 3 5 11 21 ...\nYou should enter only 1 integer number(position)"
        );
        System.out.print("Enter your number: ");
        int s = scan.nextInt();
        System.out.println("Element in position[" + s + "]is:" + runTaskThree(s));
    }
}
