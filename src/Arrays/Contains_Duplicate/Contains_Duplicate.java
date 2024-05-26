package Arrays.Contains_Duplicate;

import Utils.PrintTestResult;

import java.util.*;

public class Contains_Duplicate {
    public static void main(String[] args) {
        Contains_Duplicate cd = new Contains_Duplicate();
        cd.runTests();
    }

    private boolean isDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int item : arr) {
            if (set.contains(item)) {
                return true;
            }

            set.add(item);
        }
        return false;
    }

    private void runTests() {
        TestCase[] testCases = {
                new TestCase(1, new int[]{1, 2, 3, 1}, true),
                new TestCase(2, new int[]{1, 2, 3, 4}, false),
                new TestCase(3, new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true),
        };

        for (TestCase testCase : testCases) {
            PrintTestResult.print(testCase, isDuplicate(testCase.input));
        }
    }
}
