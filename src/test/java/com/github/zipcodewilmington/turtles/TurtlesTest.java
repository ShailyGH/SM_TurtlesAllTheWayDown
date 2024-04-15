package com.github.zipcodewilmington.turtles;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    @Test
    public void testFactorail_1()
    {
        int number = 10;
        int expectedResult = 3628800;

        int actualResult = Turtles.factorial(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFactorail_2()
    {
        int number = 0;
        int expectedResult = 1;

        int actualResult = Turtles.factorial(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFactorial_3()
    {
        int number = -20;

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> { Turtles.factorial(number);});
        Assert.assertEquals("Please provide a positive number !!!", exception.getMessage());
    }

}