
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int a=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right){
            a=Math.max(a,Math.min(height[left],height[right])*(right-left));
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] nums ={1,8,6,2,5,4,8,3,7};
        System.out.print(maxArea(nums));
    }
}
