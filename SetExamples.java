package week8.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<String> names = new HashSet<String>();
		
		//Set<String> names = new LinkedHashSet<String> ();
			
		Set<String> names = new TreeSet<String> ();
		
		
		names.add("Raja");
		names.add("Aarthi");
		names.add("Hema");
		names.add("Shals");
		names.add("Kaws");
		names.remove("Guru");		
		names.add("Ayyan");
		names.contains("Ayyan");
		names.add("Guru");
		names.size();
		
		System.out.println("Contains : " + names.contains("Ayyan"));
		System.out.println("Remove: " + names.remove("Guru"));
		System.out.println("Size of the set: " + names.size());
		
		
		System.out.println(names);
		
		
		

	}

}
