package com.prowings.Array;

import java.util.Arrays;

public class WordCountInStmt {

	public static void main(String[] args) {

		String s = "India is my country. India has 29 states";
		countWord(s);
	}

	public static void countWord(String s) {
		s = s.trim().replaceAll("[@#$.,]", "");
		String[] Word = s.split(" ");
		System.out.println(Arrays.toString(Word));

		for (int i = 0; i < Word.length; i++) {
			String currentWord = Word[i];
			int count = 1;
			if (!currentWord.isEmpty()) {
				for (int j = i + 1; j < Word.length; j++) {
					if (currentWord.equals(Word[j])) {
						count++;
                    	Word[j] = "";
					}
				}

				System.out.println(currentWord + " : " + count);
			}
		}
	}
}
