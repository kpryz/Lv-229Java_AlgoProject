package com.aglos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task12 implements Task{

	@Override
	public void solveTask() {
		System.out.println("Enter n x m values :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n=0;
		Integer m=0;
		try {
			n=Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			m=Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(Task12.waysOfTailing(n, m));


	}

	public static int waysOfTailing(Integer n, Integer m)  {


		int count[] = new int[n + 1];
		count[0] = 0;

		for (int i = 1; i <= n; i++) {
			if (i > m) {
				count[i] = count[i - 1] + count[i - m];

			} else if (i < m) {
				count[i] = 1;
			} else {
				count[i] = 2;
			}

		}

		return count[n];
	}



}
