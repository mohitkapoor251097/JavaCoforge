package Comparator;

import java.time.LocalDate;

public class Employee {
   private int id;
   private String name;
   private  double salary;
   private LocalDate joiningDate;

    public Employee(int id, String name, double salary, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", joiningDate=" + joiningDate +
                '}';
    }

//    @Override
//    public int compareTo(Employee o) {
//        //return this.getId()-o.getId();
//        if(this.getSalary()<o.getSalary())
//            return 1;
//        else if(this.getSalary()>o.getSalary())
//            return -1;
//        else
//            return 0;
//    }
}
