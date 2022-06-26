public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(double salary){
        if (salary<1000){
            return salary;
        }else return salary*1.03;
    }
    public double bonus(){
        int bonus = 0;
        if (this.workHours>40){
            bonus = (this.workHours-40)*30;
            return bonus;
        }else return bonus;
    }
    public double raiseSalary(){
        int workingYear = 2021-this.hireYear;
        double raise = 0;
        if (workingYear<10){
            raise = this.salary*0.05;
            return raise;
        } else if (workingYear<20) {
            raise = this.salary*0.10;
            return raise;
        }else {
            raise = this.salary*0.15;
            return raise;
        }
    }
    public void Yazdir(){
        System.out.println("Adi : " + this.name
                + "\nMaasi : " + this.salary
                + "\nCalisma Saati : " + this.workHours
                + "\nBaslangic Yili : " + this.hireYear
                + "\nBonus : " + this.bonus()
                + "\nMaas Artisi : " + this.raiseSalary()
                + "\nVergi haric maas : " + (this.salary+this.raiseSalary()+this.bonus())
                + "\nVergi dahil maas : " + tax(this.salary+this.raiseSalary()+this.bonus()));
    }
}
