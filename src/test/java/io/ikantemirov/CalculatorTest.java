package io.ikantemirov;


import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;


public class CalculatorTest {
    @Test
    public void cutterTest() {
        assertTrue(Calculator.cutFirstNumber("-123/5").equals("-123"));
    }

}
