public class Product of Array Except Self {
    
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pro=new int[nums.length];
        int x=1;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            x=x*nums[i];
        }
            y=y*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            pro[i]=y/nums[i];
        }else{
            pro[i]=x;
        }
        }
        return pro;
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n=nums.length;
        int[] out=new int[n];
        int x=1;
        for(int i=0;i<n;i++){
            out[i]=x;
            x=x*nums[i];
        }
        int y=1;
        for(int i=n-1;i>=0;i--){
            out[i]=out[i]*y;
            y=y*nums[i];
        }
        return out;
    }
}
