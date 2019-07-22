package Management;

public class Director extends Manager {

    private double budget;

    public Director(String niNumber, String name, int salary, String deptName, double budget) {
        super(niNumber, name, salary, deptName);
        this.budget = budget;


    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        double bonusAmount = salary * 0.02;
        return this.salary += bonusAmount;
    }
}
