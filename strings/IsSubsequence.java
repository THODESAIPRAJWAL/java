public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int x=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(x)){
                x=x+1;
            }
        }
        if(s.length()==x){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isSubsequence("ace", "abcde")); // Output: true
        System.out.println(isSubsequence("ar", "car")); // Output: false
    }
}
