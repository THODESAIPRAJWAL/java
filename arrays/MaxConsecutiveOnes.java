public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int j=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                j=j+1;
            }
            else{
                m=Math.max(m,j);
                j=0;
            }
            m=Math.max(m,j);
        }
        return m;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
