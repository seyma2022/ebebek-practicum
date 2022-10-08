public class Employee {

    public int hireYear;
    public int workHours;
    public double salary;
    public String name;
    public double taxAmaunt;
    public double bonusAmount;
    public double exactSalary;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary >= 1000) {
            taxAmaunt = this.salary * 0.03;
        }
        return taxAmaunt;
    }

    public double bonus() {
        if (workHours > 40) {
            bonusAmount = (workHours - 40) * 30;
        }
        return bonusAmount;
    }

    public double getExactSalary() {
        exactSalary = salary + bonus() - tax();
        return exactSalary;
    }

    public double getRaiseSalary() {
        int yearAmount = 2021 - hireYear;
        double raiseSalary = 0;
        if (yearAmount < 10) {
            raiseSalary = getExactSalary() * 0.05;
        } else if (yearAmount > 9 && yearAmount < 20) {
            raiseSalary = getExactSalary() * 0.10;
        } else if (yearAmount >= 20) {
            raiseSalary = getExactSalary() * 0.15;
        }
        return raiseSalary;
    }

    public double totalSalary() {
        double totalSalary = getExactSalary() + getRaiseSalary();
        return totalSalary;
    }

    public String toString(){
        System.out.println("Name of the worker: " + this.name);
        System.out.println("Salary of the worker: " + this.salary);
        System.out.println("Work hours of worker: " + this.workHours);
        System.out.println("Hire year of work: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Raise of salary: " + getRaiseSalary());
        System.out.println("Excat salary: " + getExactSalary());
        System.out.println("Total Salary: " + totalSalary());
        return null;
    }


    public static void main(String[] args) {
        Employee employee = new Employee("Seyma", 20.000, 45, 1998);

        employee.toString();
    }

}


