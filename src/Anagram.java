
public class Anagram {

	public void reverseWord(String wordToReverse) {
		String[] massToReverse = splitWords(wordToReverse);

		for (String word : massToReverse) {
			String onlyLetter = makeOnlyLetter(word);
			StringBuilder reverseWord = new StringBuilder(onlyLetter).reverse();
			onlyLetter = reverseWord.toString();
			StringBuffer buffer = new StringBuffer(onlyLetter);
			for (int j = 0; j < word.length(); j++) {
				if (!isLetter(word.substring(j, j + 1))) {
					buffer.insert(j, word.substring(j, j + 1));
					onlyLetter = buffer.toString();
				}
			}
			System.out.print(onlyLetter + " ");
		}
	}

	private static String[] splitWords(String stringForReverse) {
		String[] words = stringForReverse.split("\\p{Space}");
		return words;
	}

	private static String makeOnlyLetter(String word) {
		String onlyLetter = "";
		for (int i = 0; i < word.length(); i++) {
			if (isLetter(word.substring(i, i + 1))) {
				onlyLetter += word.substring(i, i + 1);
			}
		}
		return onlyLetter;
	}

	private static boolean isLetter(String substring) {
		if (substring.matches("\\p{javaLetter}")) {
			return true;
		}
		return false;
	}
}
