package main.java;

public class Employee {
	public long employeeId;
	public String employeeName;
	public String employeeAddress;
	public long employeePhone;
	public double basicSalary;
	public double specialAllowance = 250.80;
	public double Hra = 1000.50;
	
	public Employee() {
		
	}
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
		double basicSalary, double specialAllowance, double hra) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
		this.specialAllowance = specialAllowance;
		this.Hra = hra;
	}
	
	public Employee(long id, String Name, String address, long phone) {
		this.employeeId = id;
		this.employeeName = Name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return Hra;
	}

	public void setHra(double hra) {
		Hra = hra;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeePhone=" + employeePhone + ", basicSalary=" + basicSalary
				+ ", specialAllowance=" + specialAllowance + ", Hra=" + Hra + "]";
	}
	public double calculateSalary(double d) {
		double y = this.specialAllowance;
		double z = this.Hra;
		double newSalary = (d + ((d*y)/100) + ((y*z)/100));
		return newSalary;
		
	}
	
	public double calculateTransportAllowance(double d) {
		double transportAllowance = (0.1 * d);
		return transportAllowance;
				
	}
	
}
