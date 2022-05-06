package entities;

public class Employee {
    Integer id;
    String name;
    Double salary;

    public Employee(){
        this.id = null;
        this.name = null;
        this.salary = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        this.salary += this.salary * percentage/100;
    }

    @Override
    public String toString(){
        return String.format("%d, %s, %.2f",this.id,this.name,this.salary);
    }


}
