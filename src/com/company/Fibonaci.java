package com.company;

/**
 * Created by user on 8/4/16.
 */
public class Fibonaci {

    public int fibonacci(int number){
        int first = 1;
        int second = 1;
        int score = 1;

        if(number == 0){
            return 0;
        }else if(number == 1 || number == 2){
            return 1;
        }else{
            for(int i = 3; i <= number; i++ ){
                score = first + second;
                first = second;
                second = score;
            }
        }

        return score;
    }

    public int fibonacci_rek(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci_rek(n - 1) + fibonacci_rek(n - 2);
    }
}
