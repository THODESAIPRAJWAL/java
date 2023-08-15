import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        
        }
    }
}
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        // Create a frequency map for characters in both strings
        Map<Character, Integer> freqMap = new HashMap<>();
        
        // Count the frequency of characters in string s
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        // Decrement the frequency of characters in string t
        for (char c : t.toCharArray()) {
            if (!freqMap.containsKey(c)) {
                return false; // Character not found in s
            }
            
            freqMap.put(c, freqMap.get(c) - 1);
            
            if (freqMap.get(c) == 0) {
                freqMap.remove(c);
            }
        }
        
        return freqMap.isEmpty(); // If all characters have been used up
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram")); // Output: true
        System.out.println(validAnagram.isAnagram("rat", "car")); // Output: false
    }
}
