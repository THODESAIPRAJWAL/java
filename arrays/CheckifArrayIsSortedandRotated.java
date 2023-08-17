import java.util.Arrays;

public class CheckifArrayIsSortedandRotated {
    public static boolean check(int[] nums) {
        int n = nums.length;
         int minIndex = 0;
 
         // Find the index of the smallest element
         for (int i = 1; i < n; i++) {
             if (nums[i] < nums[minIndex]) {
                 minIndex = i;
             }
         }
 
         // Check if the elements before the smallest element index are in non-decreasing order
         for (int i = 1; i < minIndex; i++) {
             if (nums[i] < nums[i - 1]) {
                 return false;
             }
         }
 
         // Check if the elements after the smallest element index are in non-decreasing order
         for (int i = minIndex + 1; i < n; i++) {
             if (nums[i] < nums[i - 1]) {
                 return false;
             }
         }
 
         // Check if the last element is in non-decreasing order with the first element
         if (minIndex > 0 && nums[n - 1] < nums[0]) {
             return false;
         }
 
         return true;
     }
    public static void main(String[] args) {
        int[] nums ={3,4,5,1,2};
       System.out.print(check(nums));
    }
}
