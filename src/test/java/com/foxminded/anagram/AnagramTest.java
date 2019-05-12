package com.foxminded.anagram;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnagramTest {

	private Anagram anagram;

	@Before
	public void ReverseTextSetUp() {
		anagram = new Anagram();
	}
	
	@Test
	public void givenNull_whenReverseText_thenNull() {
		String actual = anagram.reverseText(null);
		assertNull(actual);
	}

	@Test
	public void givenEmptyText_whenReverseText_thenEmptyText() {
		String expected = "";
		String actual = anagram.reverseText("");
		assertEquals(expected, actual);
	}

	@Test
	public void givenText_whenReverseText_thenReversedText() {
		String expected = "tseT gnirtS";
		String actual = anagram.reverseText("Test String");
		assertEquals(expected, actual);
	}

	@Test
	public void givenTextWithSpecialSymbol_whenReverseText_thenReversedTextWithSpecialSymbol() {
		String expected = "t35T_ g@nr1tS";
		String actual = anagram.reverseText("T35t_ S@tr1ng");
		assertEquals(expected, actual);
	}

	@Test
	public void givenSpecialSymbols_whenReverse_thenSameText() {
		String expected = "!2% @#12";
		String actual = anagram.reverseText("!2% @#12");
		assertEquals(expected, actual);
	}
}
