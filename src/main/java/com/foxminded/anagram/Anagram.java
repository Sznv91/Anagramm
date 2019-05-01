package com.foxminded.anagram;

import static java.lang.Character.isLetter;

import java.util.Arrays;

public class Anagram {
	
	public void reverseText(String text) {
		final String SPACE = " ";
		String[] words = text.split(SPACE);
		Arrays.stream(words).forEach(word -> reversWord(word));
	}

	private void reversWord(String word) {
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
		System.out.print(new String(chars) + " ");
	}
}
