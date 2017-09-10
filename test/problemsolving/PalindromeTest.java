package problemsolving;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome palindrome;

    @Before
    public void setup(){
        palindrome = new Palindrome();
    }


    private String validString = "abcba";
    private String invalidString = "abcca";

    @Test
    public void testIfGivenStringIsPalindrome(){

        assertEquals(true, palindrome.checkIfStringIsPalindrome(validString));
        assertEquals(false, palindrome.checkIfStringIsPalindrome(invalidString));

    }

    @Test
    public void testIFGivenStringIsNullOrEmpty(){
        assertEquals(false,palindrome.checkIfStringIsPalindrome(""));
        assertEquals(false,palindrome.checkIfStringIsPalindrome(null));
    }
}