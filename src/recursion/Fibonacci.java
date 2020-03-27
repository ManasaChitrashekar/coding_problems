package recursion;

public class Fibonacci {
    public static  void main(String args[])
    {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(10));
        System.out.println(fibMem(0));
        System.out.println(fibMem(1));
        System.out.println(fibMem(2));
        System.out.println(fibMem(3));
        System.out.println(fibMem(10));
    }

    private static int fib(int n) {
        if(n == 0)
            return 0;
        if(n==1)
            return  1;
        else
            return fib(n-1)+fib(n-2);
    }

    private static int fibMem(int n){
        int fib[] = new int[n+2];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2;i<=n;i++)
        {
            fib[i] = fib[i-1]+fib[i-2];
        }
        return  fib[n];
    }
}
