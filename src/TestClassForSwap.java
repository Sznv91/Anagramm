
public class TestClassForSwap {

	public static void main(String[] args) {
		//String testedWords = "n1tr0 Sp33d";
		//String testedWords = "a1cde";
		//String testedWords = "n1tr0";
		String testedWords = "Sp33d";
		split(testedWords);

	}

	private static void split(String word) {
		String[] massive = word.split("");
		
		massive = swap(massive);
	}

	private static String[] swap(String[] mass) {
		String[] innerMass = mass;
		int len = innerMass.length-1;
		int counter = innerMass.length-1;
		
		for(int i = 0; i <= len/2;i++) {
			if (isLetter(innerMass[i])) {
				if (isLetter(innerMass[counter])) {
					String tmpLetter = innerMass[i];
					innerMass[i] = innerMass[counter];
					innerMass[counter] = tmpLetter;
					counter--;
				}
				else {
					counter--;
					i--;
				}
			}
		}
		
		for (int i = 0; i < innerMass.length; i++) {
			System.out.print(innerMass[i]);
		}
		
		return innerMass;
	}
	
	private static boolean isLetter(String substring) {
		if (substring.matches("\\p{javaLetter}")) {
			return true;
		}
		return false;
	}
}
