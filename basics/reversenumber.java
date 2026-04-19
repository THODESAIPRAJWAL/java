package basics;

import java.util.*;

public class reversenumber {
    public static int rev(int x){
        long min = (long)Math.pow(2, 31)*-1;
        long max =(long)Math.pow(2, 31)-1;
        int y=1;
        if(x<0){
            x*=-1;
            y*=-1;
        }
        long z=x,m=0;

        while(z>0){
            m=m*10+z%10;
            z/=10;
        }
        if(min<=y*m && max>=y*m){  
            return (int)(y*m);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(rev(number));  
    }
}
