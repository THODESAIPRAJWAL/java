import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] order=new int[heights.length];
        for(int i=0;i<order.length;i++){
            order[i]=heights[i];
        }
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<order.length;i++){
            if(order[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums ={1,1,4,2,1,3};
       System.out.print(heightChecker(nums));
    }
}
