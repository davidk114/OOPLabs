package Lab7.exercise3;

public class Student {

    private int id;
    private String name;
    private String department;

    public Student(int id, String name, String department){
        setDepartment(department);
        setName(name);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Name: " + getName() + "  ID: " + getId() + "  Department: " + getDepartment();
    }
}

