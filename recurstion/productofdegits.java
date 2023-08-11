package recurstion;

import java.util.Scanner;

public class productofdegits {
     static int pro(int n){
        if(n<10){
            return n;
        }
        int x=n%10;

        return x*pro((n-x)/10);
    }


    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int i=Sc.nextInt();
        System.out.println(pro(i));
    }
}
