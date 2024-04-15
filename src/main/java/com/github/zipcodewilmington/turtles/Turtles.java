package com.github.zipcodewilmington.turtles;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {
    public static int factorial (int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else if(n > 0)
        {
            return (n * factorial (n-1));
        }
        throw new IllegalArgumentException("Please provide a positive number !!!");
    }

    public static int gcd(int firstNumber, int secondNumber)
    {
        if(secondNumber != 0)
        {
            return gcd(secondNumber, firstNumber % secondNumber);
        }
        return firstNumber;
    }

    public static int gcd2(int firstNumber, int secondNumber)
    {
        int temp = 0;
        while(secondNumber != 0)
        {
            temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }

}
