package math;

import java.util.LinkedList;

public class isUgly {
    
}
class Solution {
    public boolean isUgly(int n) {
        LinkedList list=new LinkedList<>();
        int i=2;
        while(n>n/2){
            if(n%i==0){
                list.add(i);   
            }
            i=i+1;
        }
    }
}
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }
}
