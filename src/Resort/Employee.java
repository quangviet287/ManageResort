package Resort;

import java.util.Stack;

public class Employee implements Comparable<Employee> {
	private String name;
	private String address;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setInfoEmploy(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getInfoEmployees() {
		String info = "Name: " + getName() + "\nAddress: " + getAddress() + "\nAge: " + getAge();
		return info;
	}

	public Employee(){

	}
	public Employee(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public static void showpush(Stack<Employee> st, Employee ems) {
		st.push(new Employee());
		System.out.println("push(" + ems.getInfoEmployees() + ")");
		System.out.println("stack: " + st);
	}

	public static void showpop(Stack<Employee> st) {
		System.out.print("pop -> ");
		Employee em = st.pop();
		System.out.println(em.getInfoEmployees());
		System.out.println("stack: " + st);
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName());
	}
}
