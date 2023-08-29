import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count=new int[256];
        int[] count1=new int[256];
        for(int i=0;i<ransomNote.length();i++){
            count[ransomNote.charAt(i)]++;
        }
        for(int i=0;i<magazine.length();i++){
            count1[magazine.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            count1[i]=count1[i]-count[i];
        }
        for(int i=0;i<256;i++){
            if(count1[i]<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("aac","aab"));
    }
}
