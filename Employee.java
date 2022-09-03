package HaashcodeAndEqual;

import java.util.Objects;

public class Employee {

	private int empid;
	private String name;

	public Employee(int empid, String name) {

		this.empid = empid;
		this.name = name;

	}

	public String toString() {

		return getClass().getName() + " " + "\n" + 
		" Empid: " + this.empid + " " + "\n" +
		"  Name : " + this.name + " " + "\n" + 
		" hashcode : " + this.hashCode();

	}

	public int hashCode() {

		return Objects.hash(this.empid, this.name);

	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;

		}

		if (obj == null) {
			return false;
		}
		System.out.println(obj.getClass());
		System.out.println(this.getClass());

		if (obj.getClass() != this.getClass()) {

			return false;
		}

		Employee anthorperson = (Employee) obj;
		if (this.empid != anthorperson.empid) {
			return false;

		}

		if (this.name == null) {
			if (anthorperson.name != null) {
				return false;

			}
		}

		if (!this.name.equals(anthorperson.name)) {

			return false;
		}

		return true;
	}

}
