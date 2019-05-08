package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void ReverseText_t35t_Str1ng_Returnedt35t_gnr1tS() {
		Anagram anagram = new Anagram();
		String actual = anagram.reverseText("t35t Str1ng");
		String expected = "t35t gnr1tS";
		assertEquals(expected, actual);
	}

	@Test
	void ReverseText_Empty_Empty() {
		Anagram anagram = new Anagram();
		String actual = anagram.reverseText("");
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	void ReverseText_SPACE_SPACE() {
		Anagram anagram = new Anagram();
		String actual = anagram.reverseText(" ");
		String expected = " ";
		assertEquals(expected, actual);
	}

}
