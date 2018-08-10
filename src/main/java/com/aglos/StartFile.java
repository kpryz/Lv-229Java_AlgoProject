
package com.aglos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StartFile {
    public static final int TASK_COUNT = 14;

    public static void main(String[] args) {

        Task5 task5 = new Task5();
        Map<Integer, Task> tasks = new HashMap<Integer, Task>();
        int i = 1;
        tasks.put(i++, new Task1());
        tasks.put(i++, new Task2());
        tasks.put(i++, new Task3());
        tasks.put(i++, new Task4());
        tasks.put(i++, new Task5());
        tasks.put(i++, new Task6());
        tasks.put(i++, new Task7());
        tasks.put(i++, new Task8());
        tasks.put(i++, new Task9());
        tasks.put(i++, new Task10());
        tasks.put(i++, new Task11());
        tasks.put(i++, new Task12());
        tasks.put(i++, new Task13());
        tasks.put(i, new Task14());
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter number of task:");

            int inputNumber = in.nextInt();
            if (inputNumber < 1 || inputNumber > TASK_COUNT) {
                System.out.println("You wrote wrong number, do you want to try again?");
                System.out.println("To try again type 1");
            }
            try {
                tasks.get(inputNumber).solveTask();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("If you want to continue please type 1");
        } while (in.nextInt() == 1);


    }
}
