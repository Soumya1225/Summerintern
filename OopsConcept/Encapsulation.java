package OopsConcept;

class Student {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Student s = new Student();

        s.setId(101);
        s.setName("Soumya");

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}