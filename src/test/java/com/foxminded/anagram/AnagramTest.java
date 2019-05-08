package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void ReverseText_t35t_Str1ng_Returnt35t_gnr1tS() {
		Anagram anagram = new Anagram();
		String actual = anagram.reverseText("t35t Str1ng");
		String expected = "t35t gnr1tS";
		assertEquals(expected, actual);
	}

	@Test
	void ReverseText_Empty_ReturnEmpty() {
		Anagram anagram = new Anagram();
		String actual = anagram.reverseText("");
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	void ReverseText_SPACE_ReturnSPACE() {
		Anagram anagram = new Anagram();
		String actual = anagram.reverseText(" ");
		String expected = " ";
		assertEquals(expected, actual);
	}

	@Test
	void ReverseText_5SPACE_Return5SPACE() {
		Anagram anagram = new Anagram();
		String actual = anagram.reverseText("     ");
		String expected ="     ";
		assertEquals(expected, actual);
	}
}
