// public class TwoSumII{
//     public static int[] twoSum(int[] numbers, int target) {
//        int left=0;
//        int right=numbers.length-1;
//        while(left<right){
//         int sum=numbers[left]+numbers[right];
//         if(sum==target){
//             return new int[]{left+1,right+1};
//         }
//         else if(sum<target){
//             left++;
//         }
//         else{
//             right--;
//         }
//        }
//        return new int[0];
//     }
//     public static void main(String[] args) {
//         int[] nums ={2,7,11,15};
//         int[] a=twoSum(nums,9);
//         for(int aa:a){
//             System.out.println(aa);
//         }
//     }
// }
public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        // Two pointers approach
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                // Indices are expected to be 1-based
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        // Return an empty array if no solution is found
        return new int[0];
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum(nums, 9);
        
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}

