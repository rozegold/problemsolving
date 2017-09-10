package problemsolving;

import com.sun.istack.internal.NotNull;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Palindrome {


    boolean checkIfStringIsPalindrome(String str) {
        if (null == str || str.isEmpty())
            return false;

        int length = str.length();
        return !(IntStream.range(0, length / 2).anyMatch(i ->
                str.charAt(i) != str.charAt(length - i - 1)
        ));
    }
}
