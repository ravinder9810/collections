package listPrograms;
import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(5);
        
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(22);
        list2.add(33);
        list2.add(44);
        
        
      //  list.addAll(1, list2);
        
        // Clear is used to delete all elements :
       // list.clear();
        
        System.out.println(list);
        System.out.print("[");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println("]");
        
        
       // list.removeAll(list2);
        System.out.println(list2);
//        Object clonedList = list.clone();
//        System.out.println(clonedList);
        
//        System.out.println("Size : "+list.size());
//        System.out.println(list.contains(17));
        
//        
//        for(int i=0; i<list.size(); i++)
//            System.out.println(list.get(i));
    }
}
 