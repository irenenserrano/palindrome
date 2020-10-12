package edu.mills.cs180;

import static edu.mills.cs180.PalindromeChecker.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckerTest {

    @Test
    void isPalindrome_True_EmptyString() {
        assertTrue(isPalindrome(""));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AMA","racecar","x"})
    void isPalindrome_True_Palindromes(String Palindromes) {
        assertTrue(isPalindrome(Palindromes));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java","abc","spatula"})
    void isPalindrom_False_NonPalindromes(String nonPalindromes) {
        assertFalse(isPalindrome(nonPalindromes));
    }
}
