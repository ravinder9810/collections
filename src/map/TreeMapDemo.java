package map;

import java.util.Comparator;
import java.util.TreeMap;

class Cust3 { // bean class | model class
    private int id;
    private String name;

 

    public Cust3(int id, String name) {
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
        Cust3 other = (Cust3) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cust3 [id=" + id + ", name=" + name + "]";
    }

}

 

class IdComparator implements Comparator<Cust3> {

 

    public int compare(Cust3 o1, Cust3 o2) {
        if (o1.getId() < o2.getId())
            return -1;
        else if (o1.getId() == o2.getId())
            return 0;
        else
            return 1;
        // return (o1.getId() < o2.getId()) ? -1 : (o1.getId() == o2.getId() ? 0 : 1);
    }
} 
/*
class NameComparator implements Comparator<Cust3> {

    @Override
    public int compare(Cust3 o1, Cust3 o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
*/

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Cust3, String> map = new TreeMap<>(new IdComparator());  //IdComparator OR Namecomparator
        map.put(new Cust3(115, "lavanya"), "cust-4");
        map.put(new Cust3(114, "saif"), "cust-3");
        map.put(new Cust3(112, "zaid"), "cust-5");
        map.put(new Cust3(113, "rama"), "cust-6");

         System.out.println(map);
    }
}