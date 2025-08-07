package springcoreapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyMathTest {

    @Test
    public void testAdd() {
        MyMath calculator = new MyMath();
        int result = calculator.add(2, 3);
        assertEquals(5, result); // Expected value is 5
    }

    @Test
    public void testAdd_NegativeNumbers() {
        MyMath calculator = new MyMath();
        int result = calculator.add(-5, -3);
        assertEquals(-8, result); // Expected value is -8
    }

    @Test
    public void testAdd_Zero() {
        MyMath calculator = new MyMath();
        int result = calculator.add(10, 0);
        assertEquals(10, result); // Expected value is 10
    }
}
