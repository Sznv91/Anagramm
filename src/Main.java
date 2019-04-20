import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hi! Please enter string for reverse");
		String text = reader.readLine();
		reader.close();
		Anagram anagram = new Anagram();
		System.out.println(anagram.invert(text));
	}
}
