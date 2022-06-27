package recursion;

public class RecursionDemo {

    //print number from 5 to 1
    public void print5To1(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        print5To1(--n);
    }

    //print number from 1 to 5
    public void print1To5(int n) {
        if (n == 6)
            return;
        System.out.println(n);
        print1To5(++n);
    }

    //print sum of first n natural number
    public int sumOfNaturalNumber(int n) {
        if (n == 0)
            return 0;
        return n + sumOfNaturalNumber(--n);
    }

    //print factorial of a number n;

    public int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(--n);
    }

    //print fibonacci series till nth term
    public void fibonacci(int a, int b, int n) {
        if (n == 0)
            return;
        int c = a + b;
        System.out.println(c);
        fibonacci(b, c, n - 1);
    }

    //print x^n (stack height=n)
    public int calculatePower(int x, int n) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        return x * calculatePower(x, --n);
    }

    //print x^n (stack height = logn)
    public int calculatePower1(int x, int n) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;

        if (n % 2 == 0)
            return calculatePower(x, n / 2) * calculatePower(x, n / 2);
        else
            return calculatePower(x, n / 2) * calculatePower(x, n / 2) * x;
    }

    public static void main(String[] args) {
        RecursionDemo recursionDemo = new RecursionDemo();
        //recursionDemo.print5To1(5);
//        recursionDemo.print1To5(1);
//        System.out.println(recursionDemo.sumOfNaturalNumber(5));
        //System.out.println(recursionDemo.factorial(5));

        /**
         //Fibonacci Series
         int a = 0;
         int b = 1;
         System.out.println(a);
         System.out.println(b);
         int number = 10;
         recursionDemo.fibonacci(a, b, number - 2);
         */

       // System.out.println(recursionDemo.calculatePower(4, 3));
        System.out.println(recursionDemo.calculatePower1(4, 8));
    }

}
