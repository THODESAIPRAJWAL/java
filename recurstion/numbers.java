package recurstion;

public class numbers {
    static void numbers(int n){
        if(n==5){
            System.out.println(n);
            return;
        }else{
        System.out.println(n);
        numbers(n+1);}
    }
    public static void main(String[] args) {
        numbers(1);
    }

}
