
public class Anagramm {

	public static void main(String[] args) {

        String stringForReverse = "a1bcd efg!h";


        reverseWord(stringForReverse);
    }


    private static void reverseWord (String wordToReverse){
        String[] massToReverse = splitWords(wordToReverse);

        for (String currentWord : massToReverse){
            String onlyLetter = makeOnlyLetter(currentWord);
            StringBuilder reverseWord = new StringBuilder(onlyLetter).reverse();
            onlyLetter = reverseWord.toString();
            StringBuffer buffer = new StringBuffer(onlyLetter);
            for (int j = 0; j < currentWord.length(); j++){
             if (!isLetter(currentWord.substring(j,j+1))){
                 buffer.insert(j, currentWord.substring(j,j+1));
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
        for (int i = 0; i < word.length(); i++){
            if (isLetter(word.substring(i,i+1))){
                onlyLetter += word.substring(i,i+1);
            }
        }
        return onlyLetter;
    }

    private static boolean isLetter(String substring) {
        if (substring.matches("\\p{javaLetter}")){
            return true;
        }
        return false;
    }
}
