import java.util.LinkedList;
public class MinStack {
    LinkedList stack;
    public MinStack<T>() {
        LinkedList<T> stack=new LinkedList<>();

    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        if(stack.isEmpty()){
            System.out.println("is empty");
        }
        else{
            
        }
    }
    
    public int top() {
        
    }
    
    public int getMin() {
        
    }
}
