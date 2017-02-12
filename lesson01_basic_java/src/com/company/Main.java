package com.company;

public class Main {

    public static void main(String[] args) {

        // write your code here
    }

    static int distance(int x, int y) {
        int result = 0;
        int large = y;
        int small = x;
        if (x > y) {
            small = y;
            large = x;
        }
        while ((result + small) < large)
            result++;
        return result;

    }

    //זמן ריצה n
    static int product_big(int x, int y) {
        int result = 0;
        int large = y;
        int small = x;
        if (x > y) {
            small = y;
            large = x;
        }
        for (int i = 0; i < small; i++) {
            result += large;

        }
        return result;

    }

    //זמן ריצה log n
    static int product_small(int x, int y) {
        int result = 0;
        while (y > 0) {
            if (y % 2 == 0) {
                y = y >> 1;
                x = x << 1;
            } else {
                y--;
                result += x;
            }
        }
        return result;
    }

    static int quotient(int x, int y) {
        if (y == 0)
            return -1;
        int sum = y;
        int result = 0;
        while (sum <= x) {
            result++;
            sum += y;
        }
        return result;
    }

    static int remainder(int x, int y) {

        if (y == 0)
            return -1;

        return distance(x, product_big(quotient(x, y), y));

    }

    //לולאת for
    static int power_for(int x, int y) {
        if (x == 0) {
            if (y == 0)
                return -1;
            return 0;
        }
        if (y == 0 || x == 1)
            return 1;
        int result = x;
        for (int i = 1; i < y; i++) {
            result *= x;

        }
        return result;

    }

    //רקורסיה
    static int power_rec(int x, int y) {
        if (x == 0) {
            if (y == 0)
                return -1;
            return 0;
        }
        if (y == 0 || x == 1)
            return 1;
        int result = x;
        return x * power_rec(x, y - 1);


    }

    //קיצור זמן ריצה
    static int power_rec_short(int x, int y) {
        if (x == 0) {
            if (y == 0)
                return -1;
            return 0;
        }
        if (y == 0 || x == 1)
            return 1;
        if (y % 2 == 0) {
            int temp = power_rec_short(x, y / 2);
            return temp * temp;
        } else {
            int temp = power_rec_short(x, (y - 1) / 2);
            return temp * temp * x;
        }
    }

    static int s(int x) {
      /*  for (int i = 0; i <x/2 ; i++) {
            if (x==power_rec(x,2))
                return i;
        }
        if
        int result=0;
        return  result;*/
        int result = 0;
        while (result * result < x)
            result++;
        return result;

    }

//זמן ריצה 2 ^n
    static int fib_rec(int n) {
        if (n==1 || n==2)
            return  1;
        return  fib_rec(n-1)+fib_rec(n-2);

    }
    //זמן ריצה n
    static int fib_loop(int n) {
        if (n==1 || n==2)
            return  1;
        int a = 0;
        int b = 1;
        int c;
        for (int i = 2; i < n ; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return  b;
    }


}


