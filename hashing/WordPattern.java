import java.util.Collection;
import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false;
        }
        
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            if (!patternMap.containsKey(c)) {
                patternMap.put(c, word);
            } else {
                if (!patternMap.get(c).equals(word)) {
                    return false;
                }
            }
            
            if (!wordMap.containsKey(word)) {
                wordMap.put(word, c);
            } else {
                if (wordMap.get(word) != c) {
                    return false;
                }
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
}
