package Entity;

public class CrewMember {
    private final String firstName;
    private final String lastName;
    private final int employeeID;

    public CrewMember(String firstName, String lastName, int employeeID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getEmployeeID(){
        return employeeID;
    }
}
