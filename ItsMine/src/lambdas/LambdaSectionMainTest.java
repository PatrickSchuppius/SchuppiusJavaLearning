package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSectionMainTest {

	public static void main(String[] args) {

		// Version 1: interne Klasse aufrufen (die CodeToRun Klasse unten)
		new Thread(new CodeToRun()).start();

		// Version 2: anonyme Klasse verwenden
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printing from the anonymous class Runnable");
			}
		}).start();

		// Version 3: Lambda-Ausdruck verwenden
		new Thread(() -> System.out.println("Printing from the lambda expression")).start();

		// Version 4: Lambda-Ausdruck mit mehreren Statements verwenden
		new Thread(() -> {
			System.out.println("Printing from the long lambda expression");
			System.out.println("Zeile 2");
			System.out.format("This is line %d\n", 3);
		}).start();

		Employee john = new Employee("John Doe", 30);
		Employee tim = new Employee("Tim Buchalka", 21);
		Employee jack = new Employee("Jack Hill", 40);
		Employee snow = new Employee("Snow White", 22);

		List<Employee> employees = new ArrayList<>();
		employees.add(john);
		employees.add(tim);
		employees.add(jack);
		employees.add(snow);

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee employee1, Employee employee2) {
				return employee1.getName().compareTo(employee2.getName());
			}
		});

		for (Employee employee : employees) {
			System.out.println(employee.getName());
		}

	} // end main

}

class CodeToRun implements Runnable {
	@Override
	public void run() {
		System.out.println("Printing from the Runnable method");
	}
}

class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
