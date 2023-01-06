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
    public void testThatSumWorksCorrect() {
        Assertions.assertEquals(1, sumCalculator.sum(1));
        Assertions.assertEquals(6, sumCalculator.sum(3));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> sumCalculator.sum(0));
    }

}
