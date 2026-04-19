package basics;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int x){
        boolean status=true;
        int length=0;
        int z=x;
        if(x<0){
            return false;
        }
        else if(x==0){
            return true;
        }
        else{
            while(z>0){
                z/=10;
                length++;
            }
            int[] arr=new int[length];
            for(int i=0;i<length;i++){
                arr[i]=x%10;
                x/=10;
            }
            int i=0;
            int j=length-1;
            while (i<j) {
                if(arr[i]==arr[j]){
                    i+=1;
                    j-=1;
                }
                else{
                    status=false;
                    break;
                }
                
            }
            return status;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(isPalindrome(number));
    }
}
