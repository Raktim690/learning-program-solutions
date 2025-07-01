package com.cognizant.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExampleTest {
    @Test
    public void testGreet() {
        AssertionsExample ae = new AssertionsExample();
        String result = ae.greet("Raktim");
        assertEquals("Hello, Raktim!", result);
        assertNotNull(result);
        assertTrue(result.contains("Hello"));
    }
}
