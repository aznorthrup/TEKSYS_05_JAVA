package main.java;

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.setEmployeeId(126534);
		m1.setEmployeeName("Peter");
		m1.setEmployeeAddress("Chennai India");
		m1.setEmployeePhone(237844);
		m1.setBasicSalary(65000);
		double ans = (m1.calculateSalary(m1.basicSalary));
		System.out.println("Test case 1:");
		System.out.println(ans);
		
		System.out.println();
		
		Trainee t1 = new Trainee();
		t1.setEmployeeId(29846);
		t1.setEmployeeName("Jack");
		t1.setEmployeeAddress("Mumbai India");
		t1.setEmployeePhone(442085);
		t1.setBasicSalary(45000);
		ans = (t1.calculateSalary(t1.basicSalary));
		System.out.println("Test case 2:");
		System.out.println(ans);
		
		System.out.println();
	
		System.out.println("Transport allowance 1:");
		System.out.println(m1.calculateTransportAllowance(m1.basicSalary));
		
		System.out.println();
		
		System.out.println("Transport allowance 1:");
		System.out.println(t1.calculateTransportAllowance(t1.basicSalary));
	}

}
