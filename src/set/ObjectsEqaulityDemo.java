package set;

class Cust {
    private int id;
    private String name;

 

    public Cust(int id, String name) {
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
        return "Cust [id=" + id + ", name=" + name + "]";
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
        Cust other = (Cust) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
    

 

}

 

public class ObjectsEqaulityDemo {

 

    public static void main(String[] args) {
        Cust cust1 = new Cust(112, "saif");
        Cust cust2 = new Cust(112, "saif");
        
        System.out.println(cust1);
        System.out.println(cust2);
        
        System.out.println("Cust objects equal ? "+cust1.equals(cust2));
        
        
    }

 

}