package Lab7.exercise3;

import java.util.Arrays;

public class Institute {

    private String name;
    private Department departments[];

    public Institute(String name,   Department departments[]){
        setName(name);
        setDepartment(departments);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department departments[]){
        this.departments = Arrays.copyOf(departments, departments.length);
    }

    public String getName() {
        return name;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public String toString(){
        String str = "Name: " + getName() + "\n\nDepartments: ";

        for(int i=0;i<getDepartments().length;i++)
            if(departments[i]!=null)
                str+=departments[i];

        return str;

    }

    // getTotalStudent()
}
