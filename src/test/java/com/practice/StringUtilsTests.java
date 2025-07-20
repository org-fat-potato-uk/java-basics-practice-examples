package com.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTests {

    StringUtils utils = new StringUtils();

    @Test
    void testIsPalindromeTrue() {
        assertTrue(utils.isPalindrome("racecar"));
    }

    @Test
    void testIsPalindromeFalse() {
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void testIsPalindromeNull() {
        assertFalse(utils.isPalindrome(null));
    }

    @Test
    void testReverse() {
        assertEquals("cba", utils.reverse("abc"));
    }

    @Test
    void testReverseNull() {
        assertNull(utils.reverse(null));
    }

    @Test
    void testCapitalize() {
        assertEquals("Hello", utils.capitalize("hello"));
    }

    @Test
    void testCapitalizeEmpty() {
        assertEquals("", utils.capitalize(""));
    }

    @Test
    void testCapitalizeNull() {
        assertNull(utils.capitalize(null));
    }
}