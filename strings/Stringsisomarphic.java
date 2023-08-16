import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Stringsisomarphic {
    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Character> a=new HashMap<>();
        HashMap<Character,Character> b=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(a.containsKey(sChar)){
                if(a.get(sChar)!=tChar){
                    return false;
                }
            }else{
                a.put(sChar,tChar);
            }
            if (b.containsKey(tChar)) {
                if (b.get(tChar) != sChar) {
                    return false;
                }
            } else {
                b.put(tChar, sChar);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
}
