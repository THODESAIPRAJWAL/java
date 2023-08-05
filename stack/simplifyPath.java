
import java.util.Stack;
public class simplifyPath {
    public String simplify(String path) {
        Stack<Character> stack = new Stack<>();
        int x=path.length()-1;
        int i=0;
        while(x!=0){
            char j=path.charAt(i);
            if(j=='/'||j=='.'||(j>='a' && j<='z')){
                stack.push(j);
            }
            
        }
    }
}
