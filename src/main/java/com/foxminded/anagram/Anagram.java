package com.foxminded.anagram;

import static java.lang.Character.isLetter;

public class Anagram {

	public String reverseText(String text) {
		String space = " ";
		String[] words = text.split(space);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			result.append(reversWord(words[i]));
			if (i != words.length - 1) {
				result.append(space);
			}
		}
		return result.toString();
	}

	private String reversWord(String word) {
		char[] chars = word.toCharArray();
		int rightIndex = chars.length - 1;
		int leftIndex = 0;
		while (leftIndex < rightIndex) {
			if (isLetter(chars[leftIndex])) {
				if (isLetter(chars[rightIndex])) {
					char tempChar = chars[leftIndex];
					chars[leftIndex] = chars[rightIndex];
					chars[rightIndex] = tempChar;
					leftIndex++;
					rightIndex--;
				} else {
					rightIndex--;
				}
			} else {
				leftIndex++;
			}
		}
		return new String(chars);
	}
}
