package Operations;

public class allOperations implements interOperations {
    public float sum(float f, float fs) {
        return f + fs;
    }

    public float min(float f, float fs) {
        return f - fs;
    }

    public float division(float f, float fs) {
        if (fs == 0) {
            throw new ArithmeticException();
        }
        return f / fs;
    }
    public float multiplication(float f, float fs) {

        return f * fs;
    }



}
