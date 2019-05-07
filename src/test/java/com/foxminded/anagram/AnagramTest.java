package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void testReverseText() {
		// fail("Not yet implemented");
		Anagram anagram = new Anagram();
		String actual = anagram.reverseText("n1tr0 Sp33d");
		String expected = "r1tn0 dp33S";
		assertEquals(expected, actual);
	}

	@Test
	void emptyEntry() {
		Anagram anagram = new Anagram();
		String actual = anagram.reverseText("");
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	void spaceEntry() {
		Anagram anagram = new Anagram();
		String actual = anagram.reverseText(" ");
		String expected = " ";
		assertEquals(expected, actual);
	}

}
