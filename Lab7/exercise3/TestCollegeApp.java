package Lab7.exercise3;

public class TestCollegeApp {

    public static void main(String[] args) {

        Student student1 = new Student(154345, "Jake", "Computing");
        Student student2 = new Student(234532, "Mary", "Creative Media");
        Student student3 = new Student(453726, "Tommy","Computing");
        Student student4 = new Student(623456, "Peter", "Creative Media");

        Student computingStudents[] = new Student[10];
        computingStudents[0] = student1;
        computingStudents[1] = student3;


        Student creativeStudents[] = new Student[10];
        creativeStudents[0] = student2;
        creativeStudents[1] = student4;

        Department creativeMedia = new Department("Creative Media", creativeStudents);
        Department computing = new Department("Computing", computingStudents);

        Department departments[] = new Department[5];
        departments[0] = creativeMedia;
        departments[1] = computing;

        Institute itTralee = new Institute("IT Tralee", departments);

        System.out.println(itTralee);

    }

}
