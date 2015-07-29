package struts1;

import struts3.EmpleadoHibernateDAO;
import struts3.Employee;
import struts3.EmployeeDAO2;
import struts3.EmployeeService;
import struts3.Employees;

import com.opensymphony.xwork2.ActionSupport;

public class PersonaActionID extends ActionSupport 
{

	private int id;	
	
	Employee emp =null;
	
	@Override
	public String execute() throws Exception 
	{
			
		EmployeeService e = new EmployeeService();
		
		emp=e.obtenerEmpleado(id);
		
		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getDepartmentId());
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getSalary());

		return SUCCESS;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

}
