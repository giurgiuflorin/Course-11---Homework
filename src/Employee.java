public class Employee extends Person{

    private String company;
    private double salary;


    public Employee(String name, int age, String hairColour, String company, double salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

}
