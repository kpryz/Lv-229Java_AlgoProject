package com.aglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Polydrome class designed for approving the String object to some particular
 * rules of polydrome sequence. For instance "ABCBA" is polydrome.
 *
 * @author Stanislav Zhuravel
 * @version 1
 */

public class Task10 implements Task {
    /**
     * method solveTask Method provides access to class functionality by
     * reading String object form console, checking this object for correct input,
     * and printing in console the length of the longest polydrome subsequence.
     *
     * @throws
     */

    @Override
    public void solveTask() throws NullPointerException {
        System.out.println("Enter stirng to check max polindrome value : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        try {
            str = br.readLine().trim();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if ((str == null) || (str.equals(""))) {
            throw new NullPointerException("String is empty or has not been initialized");
        } else {
            System.out.println("Ways of covering floor : " + Task10.getPolindromeSequense(str));
        }

    }


    /**
     * takes instance of String class and return the length of the longest polydrome
     * sequence within String object
     *
     * @param str is an instance of String class
     */
    static int getPolindromeSequense(String str) throws NullPointerException {

        int[][] subsiquenceResults = new int[str.length()][str.length()];

        for (int i = 0; i < str.length(); i++) {
            subsiquenceResults[i][i] = 1;
        }

        for (int currLenght = 2; currLenght <= str.length(); currLenght++) {

            for (int i = 0; i < str.length() - currLenght + 1; i++) {
                int j = i + currLenght - 1;

                if (str.charAt(i) == str.charAt(j)) {
                    subsiquenceResults[i][j] = subsiquenceResults[i + 1][j - 1] + 2;
                } else {
                    subsiquenceResults[i][j] = Math.max(subsiquenceResults[i + 1][j], subsiquenceResults[i][j - 1]);

                }
            }

        }

        return subsiquenceResults[0][str.length() - 1];
    }
}
