import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        long n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        long res;

        res = fact(n);
        System.out.println(res);
    }

    public static long fact(long n) {
        if(n == 0) {
            return 1;
        }
        return n * fact(n-1);
    }
}