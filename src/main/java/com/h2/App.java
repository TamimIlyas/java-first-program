package com.h2;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return 2* number;
    }

    private static int add(int[] numbers) {
        System.out.println(numbers);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i] ;
        }
            return sum;

    }
}
