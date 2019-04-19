
public class Anagram {

	public void invert(String wordToReverse) {
		String[] massToReverse = wordToReverse.split("\\p{Space}");

		for (String word : massToReverse) {
			for (int letterPosition = 0; letterPosition < word.length(); letterPosition++) {
				if (isLetter(word.substring(letterPosition,letterPosition+1))) {
					System.out.println(word.substring(letterPosition,letterPosition+1));
				}
				else {
					
				}
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
}
