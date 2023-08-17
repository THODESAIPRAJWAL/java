public class RearrangeArrayElementsbySign {
    public static int[] rearrangeArray(int[] nums) {
        int[] n=new int[nums.length];
        int x=0;
        int y=1;
        for(int i=0;i<n.length;i++){
            if(nums[i]>0){
                n[x]=nums[i];
                x=x+2;
            }
            else{
                n[y]=nums[i];
                y=y+2;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(rearrangeArray(nums));
    }
}
