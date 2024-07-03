import java.util.Scanner;

public class largest {
    public static int first(int[] a){
        int small=Integer.MAX_VALUE;
        int next_small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int next_large=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            small=Math.min(small,a[i]);
            large=Math.max(large,a[i]);
        }
        for(int i=0;i<a.length;i++){
            if(next_large>a[i] && a[i]){

            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int[] array=new int[l];
        for(int i=0;i<l;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(first(array));

    }
}
