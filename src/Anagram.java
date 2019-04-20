
public class Anagram {

	public String invert(String wordToReverse) {
		String reversedStr = "";
		String[] massToReverse = wordToReverse.split("\\p{Space}");

		for (String word : massToReverse) {
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
			for (int j = 0; j < massLetters.length; j++) {
				reversedStr += massLetters[j];
			}
			reversedStr += " ";
		}
		reversedStr = reversedStr.substring(0, reversedStr.length() - 1);
		return reversedStr;
	}

	private static boolean isLetter(String substring) {
		if (substring.matches("\\p{javaLetter}")) {
			return true;
		}
		return false;
	}

}
