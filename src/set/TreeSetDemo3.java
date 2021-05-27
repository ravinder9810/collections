package set;

import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        TreeSet<String> ts2 = new TreeSet<String>();
        
        ts.add(20);
        ts.add(10);
        ts.add(7);
        ts.add(14);
        ts.add(17);
        
        ts2.add("zimbabwe");
        ts2.add("azerbaijan");
        ts2.add("india");
        ts2.add("china");
        ts2.add("uk");
//        ts2.add(null);
        
        System.out.println("TreeSet of integers : "+ts);
        System.out.println("TreeSet of strings : "+ts2); //
        
    }

 

}