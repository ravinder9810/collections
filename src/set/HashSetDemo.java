package set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(12);
		hs.add(12);
		hs.add(3);
		hs.add(3);
		hs.add(13);
		hs.add(null);
		//hs.parallelStream();
		System.out.println(hs);// no order is maintained
		
	}

}
