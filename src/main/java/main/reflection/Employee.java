package main.reflection;

public class Employee extends Person {
	@Override
	public void raiseSalary() {
		System.out.println("Raising salary for Employee");
	}
	public void changeAddress(String newaddress) {
		System.out.println("New address is : " + newaddress);
	}
}