public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        StringBuilder sb=new StringBuilder(haystack);
        int x=needle.length()-1;
        for(int i=0;i<haystack.length()-1;i++){
        if(sb.substring(i,i+x).equals(needle)){
            return i;
            brea
        }
    }
    }

}
class Solution {
    public int strStr(String haystack, String needle) {
        int x = needle.length();
        int z = -1; // Initialize z to -1 to represent the case when needle is not found.

        for (int i = 0; i <= haystack.length() - x; i++) {
            if (haystack.substring(i, i + x).equals(needle)) {
                z = i;
                break;
            }
        }

        return z;
    }
}
