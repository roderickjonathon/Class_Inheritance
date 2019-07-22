package Staff;

public abstract class Employee {



    private String niNumber;
    protected String name;
    protected int salary;

    public Employee(String niNumber, String name, int salary){
        this.niNumber = niNumber;
        this.name = name;
        this.salary = salary;

    }


    public String getNiNumber() {
        return niNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public double raiseSalaray(double raiseAmount){
        if (raiseAmount > 0) {
             salary += raiseAmount;
        }
        return salary;
    }


    public double payBonus(){
       double bonusAmount = salary * 0.01;
        return salary += bonusAmount;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
        }

}
