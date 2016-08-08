package com.company;

import java.io.Console;
import java.util.Scanner;

import static com.company.Pascal.*;

public class Main {

    public static void main(String[] args) {
        Silnia x = new Silnia();
        Fibonaci y = new Fibonaci();
        int n;
        int f;

        System.out.println("Podaj dla jakiej liczby ma byc silnia i  fib");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println(n + "! = " + x.silnia(n));
        System.out.println(n + "fib =  " + y.fibonacci(n));

//        int x;
//        Scanner s = new Scanner(System.in);
//        x = s.nextInt();
//
//        for (int i = 1; i <= x; i++)
//        {
//            for (int j = 1; j <= x - i; j++)
//            {
//                System.out.print("   ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print(add_empty(solve_value(i, k), 6));
//            }
//            System.out.println();

        }
    }

