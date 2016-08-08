package com.company;

/**
 * Created by user on 8/4/16.
 */
public class Pascal {
    public static int solve_value (int line, int column)
    {
        if (column == 1 || column == line)
        {
            return 1;
        }
        else
        {
            return solve_value(line-1, column-1)+solve_value(line-1, column);
        }
    }

    public static String add_empty(int number, int space) {
        String temp = number+"";
        while (temp.length() < space)
        {
            temp = temp + " ";
        }
        return temp;
    }
}
