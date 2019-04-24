package org.teachProject.anagram;

import java.util.Arrays;

public class RebildAnagram {

	public String reverseText(String wordToReverse) {
		String[] words = wordToReverse.split(" ");
		StringBuilder readySting = new StringBuilder();
		for (String word : words) {
			readySting.append(reversWord(word));
		}
		return readySting.toString();
	}

	private String reversWord(String word) {
		String readyStr;
		char[] massLetters = word.toCharArray();
		int len = massLetters.length - 1;
		int counter = massLetters.length - 1;

		for (int i = 0; i <= len / 2; i++) {
			if (Character.isLetter(massLetters[i])) {
				if (Character.isLetter(massLetters[counter])) {
					char tmpLetter = massLetters[i];
					massLetters[i] = massLetters[counter];
					massLetters[counter] = tmpLetter;
					counter--;
				} else {
					counter--;
					i--;
				}
			}
		}
		readyStr = Arrays.toString(massLetters);
		return readyStr;
	}
}
