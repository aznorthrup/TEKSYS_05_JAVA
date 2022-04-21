package main.java;

public class Manager extends Employee{
	
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,
		double basicSalary, double specialAllowance, double hra) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
		}
	
		public Manager() {
	
		}
		
		@Override
		public double calculateTransportAllowance(double d) {
			double transportAllowance = (0.15 * d);
			return transportAllowance;
					
		}
	
}
