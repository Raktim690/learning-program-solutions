package springcoreapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        calculator.add(5);
        
        assertEquals(5, calculator.getResult());
        
        calculator.clear();
    }

    @Test
    public void testAddMultipleTimes() {
        
        Calculator calculator = new Calculator();

        
        calculator.add(5);
        calculator.add(3);

        assertEquals(8, calculator.getResult());

        calculator.clear();
    }
}
