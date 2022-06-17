package com.emerline.sandbox;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorForActionsTest {
    private CalculatorForActions calculator = new CalculatorForActions();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testMultiply4on5_resultIs20() {
        System.out.println(calculator.multiplicationOperation(4, 5));
        assertEquals( 20, calculator.multiplicationOperation(4, 5), "Test passed");
    }
}
