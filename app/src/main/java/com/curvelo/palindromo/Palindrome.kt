package com.curvelo.palindromo



fun isPalindrome(word: String): Boolean {
    val cleanedWord = word.replace("\\W".toRegex(), "")
    return cleanedWord.equals(cleanedWord.reversed(), ignoreCase = true)
}