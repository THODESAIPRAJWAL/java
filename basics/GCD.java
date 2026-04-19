package basics;
import java.util.*;

public class GCD {
    public static int gcd(int x,int y){
       while(y!=0){
        int temp=y;
        y=x%y;
        x=temp;
       }
       return x;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(gcd(x, y));
    }
}
