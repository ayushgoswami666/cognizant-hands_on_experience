package com.springTest1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
	Calculator cal = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, cal.add(4, 6));
    }

    @Test
    void testSubtract() {
        assertEquals(2, cal.subtract(8, 6));
    }

    @Test
    void testMultiply() {
        assertEquals(24, cal.multiply(4, 6));
    }

}
