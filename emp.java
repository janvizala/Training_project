class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void displayInfo() {
        System.out.printf("%-10s %-20d %s\n", name, yearOfJoining, address);
    }
}

public class employee1{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, 1000.0, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, 1500.0, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, 1200.0, "26B- WallsStreet");

        System.out.println("Name        Year of joining        Address");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
