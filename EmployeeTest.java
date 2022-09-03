package HaashcodeAndEqual;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee bharath = new Employee(1, "bharath");
		int bharathValue = bharath.hashCode();
		System.out.println("bharath code is " + bharathValue);
		System.out.println(bharath);

		Employee hari = new Employee(2, "hari");
		int hariValue = hari.hashCode();
		System.out.println("hari code is " + hariValue);
		
		Employee cloneBharath = new Employee(1, "bharath");
		int bharathValue1 = cloneBharath.hashCode();
		System.out.println("bharath code is " + bharathValue1);
		System.out.println(cloneBharath);
		
		System.out.println(bharath.equals(cloneBharath));
		System.out.println(bharath==cloneBharath);
		System.out.println(bharath.equals(hari));
		System.out.println(bharath.equals(null));
		System.out.println(bharath.equals(bharath));
		System.out.println(bharath.equals("bharath"));


	}

}
