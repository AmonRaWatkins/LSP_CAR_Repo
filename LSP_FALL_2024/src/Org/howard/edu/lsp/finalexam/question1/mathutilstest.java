package Org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class mathutilstest {
	private mathutils mathutils; 
	
	@BeforeEach
    public void setUp() {
        mathutils = new mathutils();
    }

    // Factorial tests
    @Test
    public void testFactorial_ZeroShouldReturnOne() {
        assertEquals(1, mathutils.factorial(0));
    }

    @Test
    public void testFactorial_OneShouldReturnOne() {
        assertEquals(1, mathutils.factorial(1));
    }

    @Test
    public void testFactorial_PositiveNumber() {
        assertEquals(120, mathutils.factorial(5));
    }

    @Test
    public void testFactorial_NegativeNumberShouldThrowException() {
    	assertThrows(IllegalArgumentException.class, () -> mathutils.factorial(-1));
    }

    // IsPrime tests
    @Test
    public void testIsPrime_TwoShouldReturnTrue() {
        assertTrue(mathutils.isPrime(2));
    }

    @Test
    public void testIsPrime_NonPrimeNumber() {
        assertFalse(mathutils.isPrime(4));
    }

    @Test
    public void testIsPrime_LargePrimeNumber() {
        assertTrue(mathutils.isPrime(997));
    }

    @Test
    public void testIsPrime_OneOrLessShouldReturnFalse() {
        assertFalse(mathutils.isPrime(1));
        assertFalse(mathutils.isPrime(0));
        assertFalse(mathutils.isPrime(-1));
    }

    // GCD tests
    @Test
    public void testGcd_PositiveNumbers() {
        assertEquals(6, mathutils.gcd(54, 24));
    }

    @Test
    public void testGcd_OneNumberZero() {
        assertEquals(5, mathutils.gcd(0, 5));
        assertEquals(5, mathutils.gcd(5, 0));
    }

    @Test
    public void testGcd_NegativeNumbers() {
        assertEquals(6, mathutils.gcd(-54, 24));
        assertEquals(6, mathutils.gcd(54, -24));
        assertEquals(6, mathutils.gcd(-54, -24));
    }

    @Test
    public void testGcd_BothNumbersZeroShouldThrowException() {
    	assertThrows(IllegalArgumentException.class, () -> mathutils.gcd(0, 0));
    }
}


