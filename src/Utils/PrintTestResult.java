package Utils;

public class PrintTestResult<T> {
    public static void print(ITestCase testCase, boolean result) {
        String color;
        String message;

        if (testCase.result == result) {
            color = ConsoleColors.GREEN;
            message = "passed";
        } else {
            color = ConsoleColors.RED;
            message = "failed";
        }

        System.out.println(color + "Test #" + testCase.number + ": " + message);
    }
}
