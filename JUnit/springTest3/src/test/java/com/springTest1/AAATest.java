package com.springTest1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AAATest {
	 Calculator cal;

	    @BeforeEach
	    void setup() {
	        cal = new Calculator();
	        System.out.println("Setup");
	    }

	    @AfterEach
	    void teardown() {
	        System.out.println("Teardown");
	    }

	    @Test 
	    void testAdd() {

	        // Arrange
	        int a = 10;
	        int b = 20;

	        // Act
	        int result = cal.add(a, b);

	        // Assert
	        assertEquals(30, result);
	    }

}
