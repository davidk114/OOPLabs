package Lab7.exercise3;

import java.util.Arrays;

public class Department {

    private String name;
    private Student students[];

    public Department(String name, Student students[]){
        setName(name);
        setStudent(students);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudent(Student students[]){
        this.students = Arrays.copyOf(students, students.length);
    }

    public String getName(){
        return name;
    }

    public Student[] getStudents(){
        return students;
    }

    public String toString(){
        return("Departments:\nName: " + getName() + "\nList of students:\n\n" +
                getStudents());
    }



}
