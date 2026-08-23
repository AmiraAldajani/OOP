public class Employee {
    private String id, name;
    private double salary;

    public Employee(){}
    public Employee(String id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary= salary;
    }
    //setters
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    //getters
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    // Logic
    public double getAnnualSalary(){
        return salary*12;
    }
    public double raisedSalary(double percent){
        salary = salary + salary*(percent/100);
        return salary;
    }
    public String toString(){
        return "Id: "+getId()+"\nName: "+getName()+"\nSalary: "+getSalary();
    }
}
