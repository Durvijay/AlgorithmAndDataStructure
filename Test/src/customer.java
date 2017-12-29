
public class customer {
	
	private String empname;
	private int employeeId;
	private int contactNo;

	public customer(String string) {
		this.empname=string;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contactNo;
		result = prime * result + employeeId;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
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
		customer other = (customer) obj;
		if (contactNo != other.contactNo)
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}

	

	

	

	
}
