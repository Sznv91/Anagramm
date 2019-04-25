package com.foxminded.anagram;

import java.util.Arrays;

public class Anagram {

	public String reverseText(String text) {
		String[] words = text.split(" ");
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			result.append(reversWord(word));
		}
		return result.toString();
	}

	private String reversWord(String word) {
		String readyStr;
		char[] symbols = word.toCharArray();
		int len = symbols.length - 1;
		int counter = symbols.length - 1;

		for (int i = 0; i <= len / 2; i++) {
			if (Character.isLetter(symbols[i])) {
				if (Character.isLetter(symbols[counter])) {
					char tmpLetter = symbols[i];
					symbols[i] = symbols[counter];
					symbols[counter] = tmpLetter;
					counter--;
				} else {
					counter--;
					i--;
				}
			}
		}
		readyStr = Arrays.toString(symbols);
		return readyStr;
	}
}
