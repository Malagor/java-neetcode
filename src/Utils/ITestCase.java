package Utils;

public abstract class ITestCase {
    int number;
    boolean result;

    protected ITestCase(int number, boolean result) {
        this.number = number;
        this.result = result;
    }
}
