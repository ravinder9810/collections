package map;

import java.util.LinkedHashMap;

class Emp {
    private int id;
    private String name;

    public Emp(int id, String name) {
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
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + "]";
    }

}

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<Integer, Emp> lhm = new LinkedHashMap<>();
        lhm.put(10, new Emp(112,"john"));
        lhm.put(20, new Emp(113, "smith"));
        lhm.put(30, new Emp(114, "sai"));
        
        System.out.println(lhm);
    }
}