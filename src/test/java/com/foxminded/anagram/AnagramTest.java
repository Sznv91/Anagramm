package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AnagramTest {
	private Anagram anagram;

	@Test
	public void givenNull_whenReverseText_Null() {
		anagram = new Anagram();
		String actual = anagram.reverseText(null);
		String expected = null;
		assertEquals(expected, actual);
	}

	@Test
	public void givenEmptyText_whenReverseText_thenEmptyText() {
		anagram = new Anagram();
		String actual = anagram.reverseText("");
		String expected = "";
		assertEquals(expected, actual);
	}

	@Test
	public void givenText_whenReverseText_thenReverseText() {
		anagram = new Anagram();
		String actual = anagram.reverseText("Test String");
		String expected = "tseT gnirtS";
		assertEquals(expected, actual);
	}
	
	@Test
	public void givenTextWithSpec_whenReverseText_thenReverseTextWithSpec() {
		anagram = new Anagram();
		String actual = anagram.reverseText("T35t_ S@tr1ng");
		String expected = "t35T_ g@nr1tS";
		assertEquals(expected, actual);
	}
	
	@Test
	public void givenSpecSymbols_whenReverseText_thenSpecSymbols() {
		anagram = new Anagram();
		String actual = anagram.reverseText("!2% @#12");
		String expected = "!2% @#12";
		assertEquals(expected, actual);
	}
}
