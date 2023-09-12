package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringAndBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[string]"));
    }
    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void partialStringBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("str[in]g"));
    }
    @Test
    public void emptyBracketsAndStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]string"));
    }
    @Test
    public void oneLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void flippedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void stringAndFlippedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch][Code"));
    }
    @Test
    public void oneRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void oneRightBracketAndStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("String]"));
    }
    @Test
    public void oneLeftBracketAndStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("String["));
    }
    @Test
    public void noBracketsAndStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
}