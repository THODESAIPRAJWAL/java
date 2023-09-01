public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
       int left=0;
       int right=numbers.length-1;
       while(left<right){
        int sum=numbers[left]+numbers[right];
        if(sum==target){
            return new int[]{left+1,right+1};
        }
        else if(sum<target){
            left++;
        }
        else{
            right--;
        }
       }
       return new int[0];
    }
    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        int[] a=twoSum(nums,9);
        for(int aa:a){
            System.out.println(aa);
        }
    }
}
