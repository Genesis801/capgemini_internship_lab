package lab_7.com.cg.employee.bean;
/**
 * Employee class by debajyoti roy
 * @author genesis
 *
 */
public class Employee {
	private int eId;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	public Employee() {
		super();
	}

	public Employee(int eId, String name, double salary, String designation) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + eId;
		result = prime * result + ((insuranceScheme == null) ? 0 : insuranceScheme.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (eId != other.eId)
			return false;
		if (insuranceScheme == null) {
			if (other.insuranceScheme != null)
				return false;
		} else if (!insuranceScheme.equals(other.insuranceScheme))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public String insuranceScheme() {
		insuranceScheme="no scheme";
		if(this.salary<5000  && this.designation.equalsIgnoreCase("clerk"))
			insuranceScheme= "no scheme";
		else if((this.salary>5000 && this.salary<=20000)&& this.designation.equalsIgnoreCase("system associate") )
			insuranceScheme= "scheme -> C";
		else if((this.salary>=20000 && this.salary<40000)&& this.designation.equalsIgnoreCase("Programmer") )
			insuranceScheme= "scheme -> B";
		else if(this.salary>=40000 && this.designation.equalsIgnoreCase("manager") )
			insuranceScheme= "scheme -> A";
		
		return insuranceScheme;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+  "]";
	}
	
	
}
