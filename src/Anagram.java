
public class Anagram {

	public void invert(String wordToReverse) {
		String[] massToReverse = wordToReverse.split("\\p{Space}");

		for (String word : massToReverse) {
			String[] massLetters = word.split("");
			for (int i = massLetters.length - 1; i >= 0; i--) {
				if (isLetter(massLetters[i])) {
					swap(massLetters, i);
				}
				System.out.println(massLetters[i]);
			}
		}
		/*
		 * for (String word : massToReverse) { String onlyLetter = makeOnlyLetter(word);
		 * StringBuilder reverseWord = new StringBuilder(onlyLetter).reverse();
		 * onlyLetter = reverseWord.toString(); StringBuffer buffer = new
		 * StringBuffer(onlyLetter); for (int j = 0; j < word.length(); j++) { if
		 * (!isLetter(word.substring(j, j + 1))) { buffer.insert(j, word.substring(j, j
		 * + 1)); onlyLetter = buffer.toString(); } } System.out.print(onlyLetter +
		 * " "); }
		 */
	}

	/*
	 * private static String makeOnlyLetter(String word) { String onlyLetter = "";
	 * for (int i = 0; i < word.length(); i++) { if (isLetter(word.substring(i, i +
	 * 1))) { onlyLetter += word.substring(i, i + 1); } } return onlyLetter; }
	 */

	private static boolean isLetter(String substring) {
		if (substring.matches("\\p{javaLetter}")) {
			return true;
		}
		return false;
	}

	private static void swap(String[] mass, int position) {

	}
}
