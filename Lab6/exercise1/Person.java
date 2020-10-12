package Lab6.exercise1;

public class Person {

    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Person(){
        this("Not Supplied", "Not Supplied");
    }

    public String toString(){
        return("\nFirst Name: " + getFirstName() + "   Last Name: " + getLastName());
    }
}
