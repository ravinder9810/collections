package listPrograms;
import java.util.*;


class ArrayListOPs{
	public ArrayList<Integer> makeArrayListInt(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<n;i++) {
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			list.add(a);
		}
	
	return list;
}
public ArrayList<Integer> reverseList(ArrayList<Integer> list){
	for(int i=0;i<list.size();i++) {
		list.get(i);
	}
	Collections.reverse(list);
	return list;
	
}
public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i) == m)
		{
			list.set(i, n);
			
			
		}
	}
	return list;
	
}
}

public class My_Prac_1{
	public static void main(String[] args) {
		ArrayListOPs obj = new ArrayListOPs();
		ArrayList<Integer> arr = obj.makeArrayListInt(2);
		System.out.println(arr);
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr3 = new ArrayList<>();
		for(int i=0;i<5;i++) {
			System.out.print("enter element :  " + i);
			Scanner sc = new Scanner(System.in);
			
			Integer a = sc.nextInt();
			
			arr1.add(a);
			//arr3.add(a);
		}
	/*	ArrayList<Integer> arr2 = obj.reverseList(arr1);
		
		System.out.println(arr2);
		
		ArrayList<Integer> arr4 = obj.reverseList(arr1);
		Collections.sort(arr4);
		System.out.println(arr4);*/
		Collections.reverse(arr1);
		
		
		
	}
}