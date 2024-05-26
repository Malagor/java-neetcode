package Arrays.Valid_Anagram;

import Utils.PrintTestResult;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Valid_Anagram {
    private final TestCase[] testCases = {
            new TestCase(1, new String[]{"racecar", "carrace"}, true),
            new TestCase(2, new String[]{"jar", "jam"}, false),
    };

    public static void main(String[] args) {
        Valid_Anagram cd = new Valid_Anagram();
        cd.runTests();
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    private void runTests() {
        for (TestCase testCase : testCases) {
            PrintTestResult.print(testCase, isAnagram(testCase.input[0], testCase.input[1]));
        }
    }

    private String sort(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
