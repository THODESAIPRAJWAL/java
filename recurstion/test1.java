import java.io.*;
import java.util.*;
class test1{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String N = br.readLine();
        int K = Integer.parseInt(br.readLine().trim());
        int out = Decryptions(N, K);
        System.out.println(out);
        wr.close();
        br.close();
    }

    static int Decryptions(String N, int K) {
        // Convert binary string to decimal
        int decimalN = Integer.parseInt(N, 2);
        
        // Initialize result count
        int result = 0;
        
        // Set to store intermediate results
        Set<Integer> intermediates = new HashSet<>();
        
        // Iterate from 1 to decimalN
        for (int i = 1; i <= decimalN; i++) {
            int num = i;
            boolean valid = true;
            // Apply decryption algorithm K times
            for (int j = 0; j < K; j++) {
                // Count set bits
                int count = Integer.bitCount(num);
                // If number becomes 1, check if it's not a duplicate intermediate result
                if (count == 1 && j == K - 1) {
                    if (intermediates.contains(num)) {
                        valid = false;
                        break;
                    } else {
                        result++;
                        intermediates.add(num);
                    }
                }
                // If number is already 1, break the loop
                if (num == 1)
                    break;
                // Update number for next decryption step
                num = count;
            }
            // Break the loop if the intermediate result is already found to be invalid
            if (!valid)
                break;
        }
        // Return result modulo 10^9 + 7
        return result % 1000000007;
    }
}
