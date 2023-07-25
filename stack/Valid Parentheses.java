class Solution {
    public boolean isValid(String s) {
        Stack<Character> pa = new Stack<>();
        char[] para = s.toCharArray();
        int x = 0;

        for (int i = 0; i < para.length; i++) {
            if (para[i] == '{' || para[i] == '(' || para[i] == '[') {
                pa.push(para[i]); // Push the opening parenthesis onto the stack
            } else if (para[i] == '}' || para[i] == ')' || para[i] == ']') {
                if (pa.isEmpty()) {
                    return false; // If there is no corresponding opening parenthesis, the string is not valid
                }

                char out = pa.peek(); // Get the top element from the stack
                pa.pop(); // Pop the top element from the stack

                // Check if the current closing parenthesis matches the corresponding opening parenthesis
                if ((out == '{' && para[i] == '}') ||
                    (out == '(' && para[i] == ')') ||
                    (out == '[' && para[i] == ']')) {
                    x = 1;
                } else {
                    return false; // If the parentheses do not match, the string is not valid
                }
            }
        }

        return pa.isEmpty() && x == 1;
        // The string is valid if the stack is empty (all parentheses matched correctly) and x is set to 1.
        // x is used to ensure that there was at least one matched pair of parentheses.
    }
}

