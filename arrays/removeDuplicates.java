import java.util.HashMap;
import java.util.Map;

public class removeDuplicates{
    public static HashMap<Integer,Integer> removeDuplicates(int[] nums) {
        /*HashMap<Integer, Integer> count = new HashMap<>();
        
        // Count the occurrences of each number
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int occurrences = entry.getValue();
            
            for (int j = 0; j < Math.min(occurrences, 2); j++) {
                nums[i] = num;
                i++;
            }
        }
        
        // Fill the remaining positions with zeros
        for (int j = i; j < nums.length; j++) {
            nums[j] = 0;
        }
        
        return count;*/
        int j=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {-3, -1, 0, 0, 0, 3, 3};
        //int[] result = removeDuplicates(nums);
        System.out.println(removeDuplicates(nums));
        /*for (int num : result) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }*/
    }
}
