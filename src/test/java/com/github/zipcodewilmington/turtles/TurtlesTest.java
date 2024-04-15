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

    @Test
    public void testGCD_1()
    {
        int expectedResult = 34;

        int actualResult = Turtles.gcd(102, 68);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGCD_2()
    {
        int expectedResult = 24;

        int actualResult = Turtles.gcd(1440, 408);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGCD_3()
    {
        int expectedResult = 1440;

        int actualResult = Turtles.gcd(1440, 0);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGCD2_1()
    {
        int expectedResult = 34;

        int actualResult = Turtles.gcd2(102, 68);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGCD2_2()
    {
        int expectedResult = 24;

        int actualResult = Turtles.gcd2(1440, 408);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGCD2_3()
    {
        int expectedResult = 1440;

        int actualResult = Turtles.gcd2(1440, 0);

        Assert.assertEquals(expectedResult, actualResult);
    }

}