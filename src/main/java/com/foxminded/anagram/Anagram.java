package com.foxminded.anagram;

import static java.lang.Character.isLetter;

public class Anagram {

	public static final String SPACE = " ";

	public String reverseText(String text) {
		String[] words;
		StringBuilder result = new StringBuilder();
		if (isSpace(text)) {
			return text;
		} else {
			words = text.split(SPACE);
		}
		for (int i = 0; i < words.length; i++) {
			result.append(reversWord(words[i]));
			if (i != words.length - 1) {
				result.append(SPACE);
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
					char leftSymbol = chars[leftIndex];
					chars[leftIndex] = chars[rightIndex];
					chars[rightIndex] = leftSymbol;
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
	
	private boolean isSpace(String text) {
		int charCount = 0;		
		for (int i = 0; i < text.length(); i++) {
			if (text.substring(i, i + 1).matches(SPACE)) {
				
			} else {
				charCount++;
			}
		}
		if (charCount > 0) {
			return false;
		} else {
			return true;
		}
	}
}
