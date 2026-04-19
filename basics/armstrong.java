package basics;
import java.util.*;

public class armstrong {

    public static boolean arm(int x){
        int y=0;
        int z=x;
        int length=0;
        while (z>0){
            z/=10;
            length++;
        }
        int temp=x;
        while(x>0){
            y += (int)Math.pow(x % 10, length);
            x /= 10;
        }
        return y == temp;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        // int y=sc.nextInt();
        System.out.print(arm(x));
    }
    
}
