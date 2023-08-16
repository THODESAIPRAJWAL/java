public class Solution {
    public String reverseWords(String s) {
        // Split the input string into words using space as the delimiter
        String[] words = s.trim().split("\\s+");
        
        // Create a StringBuilder to build the reversed string
        StringBuilder reversedString = new StringBuilder();
        
        // Iterate through the words in reverse order and append to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i > 0) {
                reversedString.append(" "); // Append a space if not the last word
            }
        }
        
        return reversedString.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String s1 = "the sky is blue";
        System.out.println(solution.reverseWords(s1));  // Output: "blue is sky the"
        
        String s2 = "  hello world  ";
        System.out.println(solution.reverseWords(s2));  // Output: "world hello"
        
        String s3 = "a good   example";
        System.out.println(solution.reverseWords(s3));  // Output: "example good a"
    }
}

