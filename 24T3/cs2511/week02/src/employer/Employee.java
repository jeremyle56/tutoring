package employer;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name: " + name + ", salary: " + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;
        return name.equals(other.getName()) && salary == other.salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Bob", 1);
        Employee e1 = new Employee("Bob", 1);
        Manager m = new Manager("Fred", 1, LocalDate.now());
        System.out.println(e);
        System.out.println(e.equals(e1));
        System.out.println(m);
    }
}
