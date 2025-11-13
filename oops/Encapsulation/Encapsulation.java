package oops.Encapsulation;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter
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
        if (salary > 0)
            this.salary = salary;
    }
}

class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary); // call parent constructor
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void showDetails() {
        // Can’t access name/salary directly because they’re private
        // System.out.println(name); // error
        // Instead, use getters:
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Bonus: " + bonus);
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Employee e = new Manager("Pranav", 50000, 10000);
        System.out.println(e.getSalary()); // ✅ works
        // System.out.println(e.getBonus()); // ❌ compile-time error, not in Employee

        if (e instanceof Manager) {
            Manager m = (Manager) e;
            System.out.println(m.getBonus()); // ✅ works
        }
    }
}
