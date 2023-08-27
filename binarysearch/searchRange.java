package binarysearch;
public class searchRange {
        public static int[] SearchRange(int[] nums, int target) {
            int[] result = {-1, -1};
            
            // Find the first occurrence of the target element
            result[0] = findFirstOccurrence(nums, target);
            if (result[0] == -1) {
                // If target is not found, return [-1, -1]
                return result;
            }
            
            // Find the last occurrence of the target element
            result[1] = findLastOccurrence(nums, target);
            
            return result;
        }
        
        private static int findFirstOccurrence(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int index = -1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (nums[mid] == target) {
                    index = mid;
                    right = mid - 1; // Move left to find earlier occurrences
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            return index;
        }
        
        private static int findLastOccurrence(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int index = -1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (nums[mid] == target) {
                    index = mid;
                    left = mid + 1; // Move right to find later occurrences
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            return index;
        }
    
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] b=SearchRange(nums,7);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}
