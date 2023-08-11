package recurstion;

import java.util.Scanner;

public class reverseanumber {
    static int sum = 0;
    
    static int rev(int n) {
        if (n == 0) {
            return sum;
        }
        int j = n % 10;
        sum = sum * 10 + j;
        return rev((n - j) / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(rev(i));
    }
}
