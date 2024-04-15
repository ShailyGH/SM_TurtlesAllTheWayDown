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

}
