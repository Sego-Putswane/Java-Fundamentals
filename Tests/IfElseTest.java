import org.junit.api.Test:
import static org.junit.jupiter.api.Assertions.*;

public class IfElseTest {
    @Test
    public void testPrice() {
        assertEquals("You pay R40 for your ticket.", IfElse.price(12));
        assertEquals("You pay R50 for your ticket.", IfElse.price(65));
        assertEquals("You pay R70 for your ticket.", IfElse.price(13));
    }
}