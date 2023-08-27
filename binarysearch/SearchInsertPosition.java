package binarysearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int last=-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                last = mid; // Update last index where target is found
                left = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                left = mid + 1; // Target might be in the right half
            } else {
                right = mid - 1; // Target might be in the left half
            }
        }
        if (last != -1) {
            return last; // Return last index where target is found
        } else {
            return -1; // Target not found in the array
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,9};
        System.out.println(searchInsert(nums,1));
    }
}
