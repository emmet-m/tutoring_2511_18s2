import java.util.Scanner;

public class Fast {
    public static void main (String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    public static long fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        return fib(n-1) + fib(n - 2);
    }
}
