import java.util.Arrays;

public class rotateString {
    public void reverse(char[] a, int start, int end) {
        for (int i = start; i < start + (end - start) / 2; i++) {
            char temp = a[i];
            a[i] = a[end - i - 1];
            a[end - i - 1] = temp;
        }
    }

    public boolean rotateString(String s, String goal) {
        char[] a = s.toCharArray();
        int x = 0;

        while (!Arrays.equals(a, goal.toCharArray())) {
            reverse(a, 0, a.length - x);
            x = x + 1;
        }
        
        return x > 0;
    }
}

