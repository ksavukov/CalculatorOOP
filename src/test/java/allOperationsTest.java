import org.junit.Assert;
import org.junit.Test;
import Operations.*;

public class allOperationsTest {
    allOperations oper = new  allOperations();
    @Test
    public void sumTest(){
        float f = 7;
        float fs = 3;
        Assert.assertEquals(oper.sum(f,fs), 10, 0);
    }
    @Test
    public void sumTestFloat(){
        float f = 7.1000f;
        float fs = 3.2000f;
        Assert.assertEquals(oper.sum(f,fs), 10.300, 0.000001);
    }
    @Test
    public void sumTestNegative(){
        float f = -7;
        float fs = 3;
        Assert.assertEquals(oper.sum(f,fs), -4, 0);
    }
    @Test
    public void minTest(){
        float f = 27;
        float fs = 11;
        Assert.assertEquals(oper.min(f,fs), 16, 0);
    }
    @Test
    public void minTestFloat(){
        float f = 13.7f;
        float fs = 11.3f;
        Assert.assertEquals(oper.min(f,fs), 2.4, 0.000001);
    }
    @Test
    public void minTestNegative(){
        float f = 7;
        float fs = 11;
        Assert.assertEquals(oper.min(f,fs), -4, 0);
    }
    @Test
    public void divisionTest(){
        float f = 33;
        float fs = 11;
        Assert.assertEquals(oper.division(f,fs), 3, 0);
    }
    @Test
    public void divisionTestFloat(){
        float f = 25.5f;
        float fs = 9.6f;
        Assert.assertEquals(oper.division(f,fs), 2.65625, 0);
    }
    @Test (expected = ArithmeticException.class)
    public void divisionTestZero(){
        float f = 33;
        float fs = 0;
        oper.division(f,fs);
    }
    @Test (expected = ArithmeticException.class)
    public void divisionTestZeroFloat(){
        float f = 33.0f;
        float fs = 0;
        oper.division(f,fs);
    }
    @Test
    public void divisionTestNegative(){
        float f = -15;
        float fs = 3;
        Assert.assertEquals(oper.division(f,fs), -5, 0);
    }
    @Test
    public void divisionTestPositive(){
        float f = -15;
        float fs = -3;
        Assert.assertEquals(oper.division(f,fs), 5, 0);
    }
    @Test
    public void multiplicationTest(){
        float f = 10;
        float fs = 3;
        Assert.assertEquals(oper.multiplication(f,fs), 30, 0);
    }
    @Test
    public void multiplicationTestFloat(){
        float f = 3.3f;
        float fs = 3.3f;
        Assert.assertEquals(oper.multiplication(f,fs), 10.89, 0.01);
    }
    @Test
    public void multiplicationTestZero(){
        float f = 22;
        float fs = 0;
        Assert.assertEquals(oper.multiplication(f,fs), 0, 0);
    }
    @Test
    public void multiplicationTestZeroFloat(){
        float f = 22.4f;
        float fs = 0;
        Assert.assertEquals(oper.multiplication(f,fs), 0, 0);
    }
    @Test
    public void multiplicationTestNegative(){
        float f = -10;
        float fs = 3;
        Assert.assertEquals(oper.multiplication(f,fs), -30, 0);
    }
    @Test
    public void multiplicationTestPositive(){
        float f = -10;
        float fs = -3;
        Assert.assertEquals(oper.multiplication(f,fs), 30, 0);
    }
}
