import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTest {

    @Test
    public void testEvenOrOdd() {
        assertEquals("Even", NumberChecker.evenOrOdd(4));
        assertEquals("Odd", NumberChecker.evenOrOdd(3));
        assertEquals("Even", NumberChecker.evenOrOdd(0));
        assertEquals("Even", NumberChecker.evenOrOdd(-2));
    }

    @Test
    public void testPositiveOrNegative() {
        assertEquals("Positive", NumberChecker.positiveOrNegative(10));
        assertEquals("Negative", NumberChecker.positiveOrNegative(-5));
        assertEquals("Zero", NumberChecker.positiveOrNegative(0));
    }
}
