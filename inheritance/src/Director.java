
public class Director extends Employee {

    private double budget;

    public Director(String name, String department, double salary) {
        super(name, department, salary);

    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

}
