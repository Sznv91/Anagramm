package com.foxminded.anagram;

public class Anagram {

	public String reverseText(String text) {
		String[] words = text.split(" ");
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			if (word.equals(words[words.length - 1])) {
				result.append(reversWord(word));
			} else
				result.append(reversWord(word) + " ");
		}
		return result.toString();
	}

	private String reversWord(String word) {
		String readyStr;
		char[] symbols = word.toCharArray();

		int rightSymbol = symbols.length - 1;
		int leftSymbol = 0;
		while (rightSymbol > (symbols.length - 1) / 2) {
			if (Character.isLetter(symbols[leftSymbol])) {
				if (Character.isLetter(symbols[rightSymbol])) {
					char tmpLetter = symbols[leftSymbol];
					symbols[leftSymbol] = symbols[rightSymbol];
					symbols[rightSymbol] = tmpLetter;
					leftSymbol++;
					rightSymbol--;
				} else
					rightSymbol--;
			} else
				leftSymbol++;
		}
		readyStr = new String(symbols);
		return readyStr;
	}
}
