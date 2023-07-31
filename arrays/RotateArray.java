package arrays;

public class RotateArray {
    
}
class Solution {
    public void RotateArray(int[] nums){
        int i=nums.length;
        int j=0;
        int temp=nums[nums.length-1];
        while(i!=0){
            int swap=nums[j];
            nums[j]=temp;
            temp=swap;
            j=j+1;
            i=i-1;
        }
    } 
    public int[] rotate(int[] nums, int k) {
        int n = nums.length;
         k = k % n; // Handle cases when k is larger than the array size
        while(k!=0){
            RotateArray(nums);
            k=k-1;
        }
        return nums;
    }
}
#mysolution

#optimal

class Solution {
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases when k is larger than the array size
        reverse(nums, 0, n - 1); // Step 1: Reverse the entire array
        reverse(nums, 0, k - 1); // Step 2: Reverse the first k elements
        reverse(nums, k, n - 1); // Step 3: Reverse the remaining elements
        return nums;
    }
}
