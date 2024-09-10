package week3.day2;

public class Students extends Teacher {

	public int students (int a, int b) {
		System.out.println("Will take the notes mam");
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Teacher T1 = new Students ();
		
		T1.prop();
		System.out.println(T1.students(10, 5));
	}
}
