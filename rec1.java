import java.util.*;

public class rec1 {

    public static int power(int x, int n) {
        if (n==0){
            return 1;
        }
        if (x==0) {
            return 0;
        }
        int x_ = power(x, n-1);
        int pow= x* x_;
        return pow;

    }

    public static void main(String[] args) {
        int x = 5;
        int n = 3;
        int pow=power(x,n);
        System.out.println(pow);
    }
}