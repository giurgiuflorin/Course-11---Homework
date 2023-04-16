import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Florin", 22, "red", "Penny", 2400.00));
        employees.add(new Employee("Dorian", 22, "red", "Penny", 2480.00));
        employees.add(new Employee("Robert", 33, "red", "BMW", 8700.50));
        employees.add(new Employee("Cristian", 30, "black", "Crucea Rosie", 2000));
        employees.add(new Employee("Laura", 19, "brown", "Lidl", 2000));
        employees.add(new Employee("Dana", 19, "red", "Lidl", 2765));
        employees.add(new Employee("Flavia", 42, "blonde", "Bosch", 5000));

        //3.1 extract persons that have salaries more than a specified ammount
        getSalariesLargerThan(employees, 2100.57);

        //3.2 extract a Map that gathers all the persons for a company
        getMapOfEmployeesFromCompany(employees, "Lidl");

        //3.3 calculate the sum of all salaries for all employees
        sumOfAllSalaries(employees);

        //3.4 calculate which company gives the biggest salary
        biggestSalaryFromCompany(employees);
    }

    public static ArrayList<Employee> getSalariesLargerThan(ArrayList<Employee> array, double amount) {

        ArrayList<Employee> employeesWithSalaries = new ArrayList<>();
        for (Employee e : array) {
            if (e.getSalary() > amount) {
                employeesWithSalaries.add(e);
            }
        }

        for (Employee e : employeesWithSalaries) {
            System.out.println(e.getName() + " has a salary of " + e.getSalary());
        }
        return employeesWithSalaries;
    }

    public static Map<String, ArrayList<Employee>> getMapOfEmployeesFromCompany(ArrayList<Employee> array, String company) {

        Map<String, ArrayList<Employee>> employeesFromCompany = new HashMap<>();
        ArrayList<Employee> employees = new ArrayList<>();

        for (Employee e : array) {
            if (e.getCompany() == company) {
                employees.add(e);
                employeesFromCompany.put(company, employees);
            }
        }

        for (Employee e : employees) {
            System.out.println(e.getName());
        }
        return employeesFromCompany;
    }

    public static double sumOfAllSalaries(ArrayList<Employee> array) {

        double sum = 0;
        for (Employee e : array) {
            sum += e.getSalary();
        }

        System.out.println("The sum of all salaries is: " + sum);
        return sum;
    }

    public static void biggestSalaryFromCompany(ArrayList<Employee> array) {

        double biggestSalary = 0;
        String company = null;

        for (Employee e : array) {
            if (e.getSalary() > biggestSalary) {
                biggestSalary = e.getSalary();
                company = e.getCompany();
            }
        }

        System.out.println("The company with the biggest salary is " + company
            + "(" + biggestSalary + ")");
    }
}
