package sophos.com.co.models;

public class Cliente {
    public String firstName;
    public String lastName;
    public String email;
    public String age;
    public String salary;
    public String departrment;

    public Cliente(String firstName, String lastName, String email, String age, String salary, String departrment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.departrment = departrment;
    }
}
