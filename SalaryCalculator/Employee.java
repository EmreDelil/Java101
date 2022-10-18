package SalaryCalculator;
import java.util.Scanner;
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	double tax() {
		if(this.salary < 1000) {
			return 0;
		}else {
			return this.salary * 0.03;
		}
	}
	
	int bonus() {
		if(this.workHours > 40) {
			return 30 * (this.workHours - 40);
		}else {
			return 0;
		}
	}
	
	double raiseSalary() {
		if(this.hireYear > 2021) {
			System.out.println("You entered wrong year.");
		}
		if(2021 - this.hireYear > 0 && 2021 - this.hireYear < 10) {
			return this.salary * 0.05;
		}else if(2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
			return this.salary * 0.1;
		}else if(2021 - this.hireYear > 19) {
			return this.salary * 0.15;
		}
		return 0;
	}
	
	void printInfo() {
		System.out.println("Name\t\t\t : " + this.name);
		System.out.println("Salary\t\t\t : " + this.salary);
		System.out.println("Work hours\t\t : " + this.workHours);
		System.out.println("Begining year\t\t : " + this.hireYear);
		System.out.println("Tax\t\t\t : " + tax());
		System.out.println("Bonus\t\t\t : " + bonus());
		System.out.println("Salary raise\t\t : " + raiseSalary());
		System.out.println("Salary with tax and bonus: " + (this.salary - tax() + bonus()));
		System.out.println("Total salary\t\t : " + (this.salary + raiseSalary()));
	}
	
}