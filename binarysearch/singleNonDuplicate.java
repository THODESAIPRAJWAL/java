package binarysearch;

import java.util.HashMap;
import java.util.Map;

public class singleNonDuplicate {
    public static int singleNonDuplicate(int[] nums) {
        /*HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> e:a.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return -1;*/
        int left=0;
        int right=1;
        for(int i=0;i<nums.length;i++){
            if(nums[left]!=nums[right]){
                return nums[left];
            }else{
                left=left+2;
                right=right+2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(singleNonDuplicate(nums));
    }
}
