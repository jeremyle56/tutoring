package employee;

public class Employee {
    private String name;
    private int salary;

    /**
     * Create an Employee class with a given name and salary
     * 
     * @param name
     * @param salary
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Return employee name
     * 
     * @return the full name of the employee
     */
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
        return getClass().getName() + ": [name: " + name + ", salary = " + salary +
                "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() != this.getClass())
            return false;
        Employee other = (Employee) obj;
        return other.name.equals(this.name) && other.salary == this.salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Fred", 5);
        Employee e2 = new Employee("Fred", 5);
        Employee m = new Manager("Fred", 5);
        System.err.println(e2.getClass());
        System.out.println(e.equals(e2));
        System.out.println(m);
    }
}
