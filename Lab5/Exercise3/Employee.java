public class Employee {
	
	private int empID;
	private String empName;
	private int age;
	private double salary;

	public Employee(int empID, String empName, int age, double salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}
  
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
  public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
  
  public void validateSalary(double salary) throws EmployeeException{
		
		if(salary<3000)
			throw new EmployeeException("Salary can't be less than 3000 !!");
		else
			System.out.println("Salary is Valid");
		
	}

}
