package recurstion;

import java.util.Scanner;

public class factorial {
    static int fac(int n){
        if(n==1){
            return n;
        }
        return n*fac(n-1);
    }


    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int i=Sc.nextInt();
        System.out.println(fac(i));
    }
}
