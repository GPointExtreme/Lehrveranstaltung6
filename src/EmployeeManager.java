import java.util.ArrayList;

public class EmployeeManager {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		public void addEmployee(Employee e) {
			employees.add(e);
		}
		
		public Employee findByEmpNumber(int number) {
			Employee found = null;
			for (Employee e : employees) {
				if (e.getEmpNumber() == number) {
					found = e;
				}
			}
			return found;
		}
		
		public ArrayList<Employee> findByDepartment(String department) {
			ArrayList<Employee> sameDept = new ArrayList<>();
		
			for (Employee e : employees) {
				if(e.getDepartment().equals(department)) {
					sameDept.add(e);
				}
			}
			return sameDept;
		}
		
		public Employee findMyMaxSalary() {
			double maxSalary = 0;
			Employee found = null;
			for (Employee employee : employees) {
				if(employee.getSalary() > maxSalary) {
					maxSalary = employee.getSalary();
					found = employee;
				}
			}
			return found;
		}		
	}
