// Java program to traversal a
// Java.util.HashMap
  
import java.util.HashMap;
import java.util.Map;
  
public class hashap{
    public static void main(String[] args)
    {

        HashMap<Integer,String> n=new HashMap<>();
        n.put(1,"sai");
        n.put(2,"saiprajwal");
        n.put(3,"saireddy");
        for(Map.Entry<Integer,String> e :n.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());}

    }
}