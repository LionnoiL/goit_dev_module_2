import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {

    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSumCorrectCalc1() {
        Assertions.assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    public void testSumCorrectCalc3(){
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    public void testSumCorrectCalc0(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> sumCalculator.sum(0));
    }

}
