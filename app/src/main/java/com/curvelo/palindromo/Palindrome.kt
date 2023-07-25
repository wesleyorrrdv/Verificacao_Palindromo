package com.curvelo.palindromo

class Palindrome {

    fun isPalindrome(word:String):Boolean{
        val cleanWord = word.toLowerCase().replace("\\W".toRegex(),"")
        return cleanWord == cleanWord.reversed()

    }
}