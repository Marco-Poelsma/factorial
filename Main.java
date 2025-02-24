import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int res;

        res = fact(n);
        System.out.println(res);
    }

    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        return n * fact(n-1);
    }
}