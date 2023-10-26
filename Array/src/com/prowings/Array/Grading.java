package com.prowings.Array;

import java.util.Arrays;
import java.util.Scanner;

    public class Grading {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks of the five subjects");
int[] marks = new int[5];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(marks));

		Grading g = new Grading();

		// String res=g.getGrade(marks);
		System.out.println("result :" + g.getGrade(marks));

	}

	public String getGrade(int[] marks) {
		int sum = 0;

		for (int i = 0; i < marks.length; i++) {

			sum += marks[i];

		}
		// System.out.println(sum);

		int average = sum / marks.length;
		// System.out.println(average);

		if (average <= 100 && average >= 80) {
			return "A";
		} else if (average < 80 && average >= 60) {
			return "B";
        } else if (average < 60 && average >= 40) {
			return "C";
		} else {
			return "fail";

		}

	}

}
