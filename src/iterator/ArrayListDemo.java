package iterator;

import java.util.ArrayList;

 //import jdk.javadoc.internal.doclets.toolkit.util.Comparators;

import java.util.*;

 class ArrayListDemo1 implements Comparable<Integer>{

	Integer a;
	ArrayListDemo1(Integer a) {
		this.a = a;		
		
	}

	public Integer getnum() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*@Override
	public int compareTo(Integer x) {
		
		return (this.a < x.getnum()) ? -1 : ((this.a == x.getA()) ? 0 : 1);
	}
	*/

	}
	public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add((20));
       listOfIntegers.add(30);
        listOfIntegers.add(50);
        listOfIntegers.add(60);
        listOfIntegers.add(80);
        listOfIntegers.add(90);
        listOfIntegers.add(70);
        listOfIntegers.add(40);
        listOfIntegers.add(10);
       /* */
      
       ArrayList<Integer> a = listOfIntegers;
      // ArrayList<Integer> a = ob.compareTo(listOfIntegers);
      // System.out.println();
       System.out.println(listOfIntegers);
       System.out.println(a);
        Iterator<Integer> itr = listOfIntegers.iterator();
        
        while(itr.hasNext()) {
            Integer i = itr.next();
            //i+=10;
            System.out.print(i + " ");
        }
        
    }

/*	@Override
	public int compareTo(Object o) {
		if(this.)
		return ;
	}*/
	
	}

 
