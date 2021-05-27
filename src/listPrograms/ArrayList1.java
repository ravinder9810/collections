package listPrograms;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		int listSize = list.size();
		System.out.println("list size :" + listSize);
		System.out.println("basic representation of LIST :" + list);
	/*	for(Integer ref: list)
			System.out.print(ref + ",");
		*/
		// without GENERICS :
		ArrayList list2 = new ArrayList<>();
		list2.add((int) 1.1);
		list2.add(new StringBuilder("hallo.."));
		list2.add((double)2.5);
		
		System.out.println("default representation of LIST2 :" + list2);
	}

	private static Integer StringBuilder(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
