package week8.day1;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> places = new ArrayList<String> ();
		
		places.add("Pondicherry");
		places.add("Mahabs");
		places.add("Chennai");
		places.add("Villupuram");
		places.add("Chennai");
		places.size();
		
		System.out.println("Lenght : " + places.size() );
		System.out.println(places);
		places.add(3, "Coimbatore"); // index
		System.out.println(places);
	}

}
