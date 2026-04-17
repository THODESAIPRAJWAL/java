import java.util.*;

public class fibonachirecursion {
    public int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fib(n-2)+fib(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=new fibonachirecursion().fib(n);
        System.out.println(m);
    }
}
