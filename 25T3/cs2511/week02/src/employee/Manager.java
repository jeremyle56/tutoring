package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    /**
     * Create a manager with name, salary and hiring date.
     *
     * @param name     The full name of the manager.
     * @param salary   The manager's yearly salary in dollars.
     * @param hireDate The date the manager was hired.
     */
    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now());
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + "[hireDate=" + hireDate + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        Manager manager = (Manager) obj;
        if (hireDate.equals(manager.hireDate))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Manager m = new Manager("Big Boss", 9);
        Manager m1 = new Manager("Big Boss", 9);
        Employee e = new Employee("Bob", 5);
        Employee e1 = new Employee("Bob", 5);
        System.out.println(m);
        System.out.println(m == e);
        // System.out.println(e.name); this should error
        System.out.println(m1.equals(m));
    }
}
