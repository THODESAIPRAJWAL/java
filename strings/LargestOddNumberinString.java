public class LargestOddNumberinString {
    public static String largestOddNumber(String num) {
        int[] n=new int[num.length()];
        for(int i=0;i<num.length();i++){
            n[i]=num.charAt(i)-'0';
        }
        String a="";
        for(int i=num.length()-1;i>=0;i--){
        if(n[i]%2!=0){
            int subarrayLength=i+ 1;
            int[] subarray = new int[subarrayLength];
            System.arraycopy(n,0, subarray, 0, subarrayLength);
            StringBuilder sb = new StringBuilder();
                for (int numInSubarray : subarray) {
                    sb.append(numInSubarray);
                }
                a = sb.toString();
                break;
        }
    }
        return a;

    }
    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
    }
}
