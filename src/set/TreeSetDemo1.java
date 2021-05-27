package set;

import java.util.TreeSet;

class Customer implements Comparable<Customer> {
    private int id;
    private String name;

     public Customer(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

     public int getId() {
        return id;
    }

     public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    @Override
   public int compareTo(Customer x) {
         
    	return name.compareTo(x.getName());
    }
    
    @Override
    public String toString() {
        return "Customer : [id=" + id + ", name=" + name + "]";
    }

}

public class TreeSetDemo1 {
	
    public static void main(String[] args) {
    	TreeSet<Customer> cust = new TreeSet<Customer>();
    	cust.add(new Customer(4042, "ravinder"));
    	cust.add(new Customer(4045, "rainder"));
    	cust.add(new Customer(4044, "rainder"));
    	cust.add(new Customer(4043, "rvinder"));
    	System.out.println(cust);
    	

       // System.out.println(ts);
    }

 

}