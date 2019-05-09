package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnagramTest {

	private Anagram anagram;

	@BeforeEach
	public void createAnagramInstance() {
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
	public void givenSpecialSymbols_whenReverseText_thenSpecialSymbols() {
		String expected = "!2% @#12";
		String actual = anagram.reverseText("!2% @#12");
		assertEquals(expected, actual);
	}
}
