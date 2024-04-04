/*   Write a java program to create linkedlist with employee objects, sort the aemployees
             object based name of employee and salary of employee. 
              Note: take Employee as a class with id, name, designation and salary fields */

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Employee
{
	int id;
	String name;
	String designation;
	double salary;
	public Employee(int id, String name, String designation, double salary)
	{
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
}
class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        // First compare by name
        int nameComparison = e1.name.compareTo(e2.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            // If names are equal, compare by salary
            return Double.compare(e1.salary, e2.salary);
        }
    }
}
public class SortEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<Employee> employees = new LinkedList<>();
      employees.add(new Employee(1, "Teja", "Developer", 50000));
      employees.add(new Employee(2, "Harshitha", "Manager", 100000));
      employees.add(new Employee(3, "Narasimha", "Project Manager", 150000));
      employees.add(new Employee(4, "Satya", "Tester", 45000));
      
   // Sort employees
      Collections.sort(employees, new EmployeeComparator());

      // Print sorted list
      System.out.println("Sorted Employees:");
      for (Employee employee : employees) {
          System.out.println(employee.id + " "+employee.name+" "+employee.designation+" "+employee.salary);
      }
      
	}

}
