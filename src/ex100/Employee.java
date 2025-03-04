package ex100;

public class Employee {

private int id;
private String name;
private double salary;

public Employee(){    
}
public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
}

public double getSalary() {
    return salary;
}

public int getId() {
    return id;
}

public String getName() {
    return name;
}

public void setId(int id) {
    this.id = id;
}

public void setName(String name) {
    this.name = name;
}

public void setSalary(double salary) {
    this.salary = salary;
}
public void increaseSalary(double percentage){
this.salary += salary / 100.00 *percentage;
}

@Override
public String toString() {
    return getId() + ", " + getName() + ", " + String.format("%.2f", getSalary());
}
}
