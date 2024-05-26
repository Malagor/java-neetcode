package Arrays.Contains_Duplicate;

import Utils.ITestCase;

public class TestCase extends ITestCase {
    public final int[] input;

    TestCase(int number, int[] arr, boolean result) {
        super(number, result);

        this.input = arr;
    }
}
