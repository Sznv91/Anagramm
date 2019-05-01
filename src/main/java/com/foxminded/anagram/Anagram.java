package com.foxminded.anagram;

import static java.lang.Character.isLetter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Anagram {

	private static ArrayList<String> storage = new ArrayList<>();
	public final String SPACE = " ";
	
	public String reverseText(String text) {
		String[] words = text.split(SPACE);
		StringBuilder result = new StringBuilder();
		Arrays.stream(words).forEach(word -> reversWord(word));
		Iterator<String> iterator = storage.iterator();
		while (true) {
			result.append(iterator.next());
			if (iterator.hasNext()) {
				result.append(SPACE);
			} else {
				break;
			}
		}
		return result.toString();
	}

	private void reversWord(String word) {
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
		storage.add(new String(chars));
	}
}
