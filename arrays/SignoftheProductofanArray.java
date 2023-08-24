public class SignoftheProductofanArray {
    public static int arraySign(int[] nums) {
        int x=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                x=x*(1);
            }
            if(nums[i]<0){
                x=x*(-1);
            }
            if(nums[i]==0){
                return 0;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(nums));
    }
}
