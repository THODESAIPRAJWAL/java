public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int i=1;
        while(s.charAt(0)!=s.charAt(i)){
            i=i+1;
        }
        String match=s.substring(0, i);
        for(int j=0;j<s.length();j=j+i){

        }
    }
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }
}
