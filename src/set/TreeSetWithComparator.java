package set;
/*
import java.util.Comparator;
import java.util.TreeSet;

/*class Customer implements Comparable<Customer> {
    private int id;
    private String name;

     Customer(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

 

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

 

    /*
     * @Override public int compareTo(Customer o) { return
     * name.compareTo(o.getName()); }
     */

 /*

    @Override
    public int compareTo(Customer o) {
        if(this.id < o.getId())
            return -1;
        else if(this.id == o.getId())
            return 0;
        else 
            return 1;

        //return (this.id < o.getId()) ? -1 : ((this.id == o.getId()) ? 0 : 1);
    }

    private int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
    public String toString() {
        return "Customer : [id=" + id + ", name=" + name + "]";
    }*/

/*
public class TreeSetWithComparator {
    public static void main(String[] args) {
        TreeSet<Customer> ts = new TreeSet<Customer>(); 
        ts.add(new Customer(112, "raza"));
        ts.add(new Customer(111, "zaid"));
        ts.add(new Customer(223, "neha"));
        ts.add(new Customer(332, "ayan"));
        ts.add(new Customer(333, "ayan"));
        System.out.println(ts);
    }
}*/
