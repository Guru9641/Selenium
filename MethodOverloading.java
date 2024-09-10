package week3.day2;

public class MethodOverloading {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public int add (int a, int b) {
			return a+b;
		}
		public int add (int a, int b, int c) {
			return a+b+c;
		}
		public float add (float a, float b) {
			return a+b;
		}
			
		public static void main(String[] args) {	
			
		MethodOverloading MOL = new MethodOverloading ();
		System.out.println("Add two numbers: " + MOL.add(3, 6));
		System.out.println("Add three numbers: " + MOL.add(5,50, 7));
		System.out.println("Float of two number: " + MOL.add(3.2f, 7.0f));
		
	
		
	

	}

}
