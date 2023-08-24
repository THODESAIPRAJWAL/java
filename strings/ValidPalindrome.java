public class ValidPalindrome {
    public static String convert(String s){
        String b=s.toLowerCase();
        StringBuilder a =new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((b.charAt(i)<='z'&&b.charAt(i)>='a')||(b.charAt(i)<='9'&&b.charAt(i)>='0')){
            a.append(b.charAt(i));
        }
        }
        return a.toString();
    }
    public static boolean isPalindrome(String s) {
        String a = convert(s);
        int left = 0;
        int right = a.length() - 1;
    
        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
    
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
