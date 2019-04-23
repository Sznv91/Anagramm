package org.OneMoreProject.RevertWord;


public class Anagram {

	public String invert(String wordToReverse) {
		String[] massToReverse = wordToReverse.split("\\p{Space}");
		String readySting = "";
		for (String word : massToReverse) {
			readySting += reversWord(word) + " ";
		}
		readySting = readySting.substring(0, readySting.length()-1);
		return readySting;
	}

	private boolean isLetter(String substring) {
		if (substring.matches("\\p{javaLetter}")) {
			return true;
		}
		return false;
	}

	private String reversWord(String word) {
		String readyStr = "";
		String[] massLetters = word.split("");
		int len = massLetters.length - 1;
		int counter = massLetters.length - 1;

		for (int i = 0; i <= len / 2; i++) {
			if (isLetter(massLetters[i])) {
				if (isLetter(massLetters[counter])) {
					String tmpLetter = massLetters[i];
					massLetters[i] = massLetters[counter];
					massLetters[counter] = tmpLetter;
					counter--;
				} else {
					counter--;
					i--;
				}
			}
		}
		for (int i = 0; i < massLetters.length; i++) {
			readyStr += massLetters[i];
		}
		return readyStr;
	}
}
