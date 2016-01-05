import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		EmployeeManager em = new EmployeeManager();
		
		Employee Dominik = new Employee(1, "Dominik", 1500, "IT");
		em.addEmployee(Dominik);
		Employee David = new Employee(2, "David", 1600, "IT");
		em.addEmployee(David);
		
		Employee emp1 = em.findByEmpNumber(1);
		System.out.println(emp1);
		
		Employee emp2 = em.findMyMaxSalary();
		System.out.println(emp2);
		
		
		ArrayList<Employee> emp3 = em.findByDepartment("IT");
		System.out.println("IT (" + emp3.size() + ") -> " + emp3);
		
	}

}
