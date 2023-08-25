package binarysearch;

public class binarysearch {
    public static int search(int[] nums, int target) {
        return binarySearchRecursive(nums, target, 0, nums.length-1);
    }
    public static int binarySearchRecursive(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearchRecursive(nums, target, mid + 1, right);
        } else {
            return binarySearchRecursive(nums, target, left, mid - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,9,3};
        System.out.println(search(nums,3));
    }
}
