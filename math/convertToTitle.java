package math;

public class convertToTitle {
    
}
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder col=new StringBuilder();

        while(columnNumber>0){
            int reminder=(columnNumber-1)%26;
            char c=(char) ('A'+reminder);
            col.insert(0,c);
            columnNumber=(columnNumber-1)/26;
        }
        return col.toString();
    }
}