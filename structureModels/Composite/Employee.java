public class Employee {
    String name;
    String dept;
    int salary;
    List<Employee> subordinated;

    public Employee(String name,String dept,int sal){
        this.name = name;
        this.dept = dept;
        this.sal = sal;
        subordinated = new ArrayList<Employee>();
    }

    public add(Employee e){
        subordinated.add(e);
    }

    public remove(Employee e){
        subordinated.remove(e);
    }

    public List<Employee> getSubordinated(){
        return subordinated;
    }
}