public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int prefixsum=0;
        int suffixsum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                prefixsum=prefixsum+nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                suffixsum=suffixsum+nums[j];
            }
            if(prefixsum==suffixsum){
                return i;
            }
            prefixsum=0;
            suffixsum=0;
        }
        return -1;
        /*int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        
        return -1; */
        
    }
    public static void main(String[] args) {
        int[] nums ={1,7,3,6,5,6};
        System.out.print(pivotIndex(nums));
    }
}
