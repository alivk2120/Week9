//Write a Java class called Employee that has fields for the employee's name and salary. Write a custom Comparator implementation called SalaryComparator that sorts Employee objects in descending order based on their salary. Then, modify the Employee class to implement the Comparable interface, so that Employee objects are sorted in ascending order based on their name. Test your implementation by creating a list of Employee objects and sorting them using both the SalaryComparator and the Comparable implementation.
import java.util.*;
class Employee implements Comparator<Employee>{
  String employee;
  int salary;
  Employee(String employee,int salary){
    this.employee=employee;
    this.salary=salary;
  }
  public int compareTo(Employee e){
    return employee.compareTo(e.employee);
  }
}
class SalaryComparator implements Comparator<Employee>{
  public int compare(Employee e1,Employee e2){
    if(e1.salary>e2.salary){
      return 1;
    }
    else if(e1.salary<e2.salary){
      return -1;
    }
    else{
      return 0;
    }
  }
}
class EmployeeDemo{
  public static void main(String args[]){
    ArrayList<Employee> employees=new ArrayList<Employee>();
    Scanner s=new Scanner(System.in);
    for(int i=0;i<3;i++){
      employees.add(new Employee(s.next(),s.nextInt()));
    }
    Collections.sort(Employee);
    Collections.sort(employees,new SalaryComparator());
    for(Employee e:employees){
      System.out.println(e.employee+" "+e.salary);
    }
  }
}