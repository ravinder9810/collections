package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDEmo {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(12);
		lhs.add(12);
		lhs.add(3);
		lhs.add(3);
		lhs.add(13);
		lhs.add(null);
		System.out.println(lhs); // maintains insertion order
	}

}
