package edu.mills.cs180;

import static edu.mills.cs180.PalindromeChecker.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {

    @Test
    void isPalindrom_True_EmptyString() {
        assertTrue(isPalindrome(""));
    }

}
