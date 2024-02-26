package binarysearch;


public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // The peak must be on the left side
                right = mid;
            } else {
                // The peak must be on the right side
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,9,3};
        System.out.println(findPeakElement(nums));
    }
}
