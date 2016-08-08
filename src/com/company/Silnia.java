package com.company;


public class Silnia {

    public int silnia(int i)
    {
        if (i == 1)
            return 1;
        else if(i == 0 ){
            return 0;
        }
        else
            return i * silnia(i - 1);
    }
}
