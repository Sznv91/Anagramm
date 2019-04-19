
public class TestClassForSwap {

	public static void main(String[] args) {
		String testedWords = "n1tr0 Sp33d";
		split(testedWords);

	}

	private static void split(String word) {
		String[] massive = word.split("");

		massive = swap(massive);
		for (int i = 0; i < massive.length-1; i++) {
			// System.out.println(massive[i] + " it's fist iteration");
			//massive = swap(massive, i);
		}
		for (int i = 0; i < massive.length; i++) {
			System.out.print(massive[i]);
		}

	}

	private static String[] swap(String[] mass) {
		//System.out.println(mass[position] + " from swap method");
		String[] innerMass = mass;
		/*if (position < mass.length - 2) {
			System.out.print("Sucess");
			
			String tmpLetter = innerMass[position + 1];
			innerMass[position + 1] = innerMass[position];
			innerMass[position] = tmpLetter;
			return innerMass;

		}*/
		int len = innerMass.length-1;
		for(int i = 0; i <= len/2;i++) {
			if (isLetter(innerMass[i])) {
				String tmpLetter = innerMass[i];
				innerMass[i] = innerMass[len-i];
				innerMass[len-i] = tmpLetter;	
			}
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
