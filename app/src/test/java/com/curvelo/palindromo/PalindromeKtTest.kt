package com.curvelo.palindromo

import org.junit.Assert.*

import org.junit.Test

class PalindromeKtTest {



    @Test
    fun testIsPalindromeWithNonPalindromeWord() {
        val nonPalindromeWord = "hello"
        assertFalse(isPalindrome(nonPalindromeWord))
    }

    @Test
    fun testIsPalindromeWithEmptyWord() {
        val emptyWord = ""
        assertTrue(isPalindrome(emptyWord))
    }

    @Test
    fun testIsPalindromeWithWhitespace() {
        val whitespaceWord = "   "
        assertTrue(isPalindrome(whitespaceWord))
    }

    @Test
    fun testIsPalindromeWithSpecialCharacters() {
        val wordWithSpecialCharacters = "A man, a plan, a canal, Panama!"
        assertTrue(isPalindrome(wordWithSpecialCharacters))
    }

    @Test
    fun testIsPalindromeWithUpperCaseWord() {
        val upperCaseWord = "RaceCar"
        assertTrue(isPalindrome(upperCaseWord))
    }

    @Test
    fun testIsPalindromeWithNonAlphaNumericCharacters() {
        val nonAlphaNumericWord = "a b c!@# c b a"
        assertTrue(isPalindrome(nonAlphaNumericWord))
    }

}