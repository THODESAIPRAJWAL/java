import java.util.*;
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        int i=0;
        int j=0;

        for(Map.Entry<Integer,Integer> e:a.entrySet()){
            j=Math.max(j,e.getValue());
        }
        for(Map.Entry<Integer,Integer> e:a.entrySet()){
            if(e.getValue()==j){
                i=e.getKey();
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
