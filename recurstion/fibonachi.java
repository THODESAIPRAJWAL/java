package recurstion;

public class fibonachi {
    static int fib(int n){
        int sum=0;
        if(n<2){
            return n;}
        
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
