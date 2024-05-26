package Arrays.Valid_Anagram;

import Utils.ITestCase;

public class TestCase extends ITestCase {
    public final String[] input;

    TestCase(int number, String[] arr, boolean result) {
        super(number, result);

        this.input = arr;
    }
}
