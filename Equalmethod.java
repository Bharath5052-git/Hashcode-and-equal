package HaashcodeAndEqual;

public class Equalmethod {
	public static void main(String[] args) {

//		Employee bharath = new Employee(1, "Bharath");
//
//		Employee hari = new Employee(2, "hari");
//
//		Employee prasath = hari; // here i am assing the value to prasath to hari
//		System.out.println(bharath == hari); // beacause here equal both different ogjects
//		System.out.println(hari == prasath); // so here "==" check the identity by usinf this == method we can check
//												// weather refernce same object are different object
//
//		// equal() method .....
//
//		boolean value = hari.equals(bharath);
//		System.out.println(value);
//
//		// using string here ..
//
//		// if we compare string value its cheack the contain which given by ourselefs
//		// so we can override the equal () to own class
//
//		String fruit = new String("mango");
//		String veg = new String("carrot");
////		String veg = new String ("mango");
//
//		System.out.println(fruit.equals(veg));
//		
//		
//		
//		
		
		
		Equalmethod value = new Equalmethod() ;
		Employee bharath = new Employee(1, "Bharath");
	//	Employee hari = new Employee (2,"hari");
		boolean result = bharath.equals(value);

//	Employee duplbharath = new Employee(1, "Bharath"); // here both the contents are same but both refernce are differrent 
		 System.out.println(result); 
		
		
		
		// comparing two different class ..
		
		
		
		

	}

}
