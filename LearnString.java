package week2.day3;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Employe = "Vicky Vignesh"; // STRING LITERAL 
		
		String name = new String("Kumaraguru"); // Instantiation
		
		String uppercase = "KUMARAGURU";
		
		String lowercase = "guru";
				
		int number = 2326;
		
		//String splitThis = "Author, approved proof";
		
		System.out.println(name.charAt(3));
		
		System.out.println(name.length());
		
		System.out.println(name.equals("Kuamarguru"));
		
		System.out.println(name.equalsIgnoreCase("Vicky"));
		
		System.out.println(name.equalsIgnoreCase("Kumaraguru"));
		
		System.out.println(name.concat("G"));
		
		System.out.println(name.substring(2));
		
		System.out.println(name.substring(2, 6));
			
		System.out.println(name.replace("g", "G"));
		
		System.out.println(name.replaceAll("Kumaraguru", "Vicky"));
		
		System.out.println(name.contains("a"));
		
		System.out.println(name.indexOf("G"));
				
		System.out.println(name.indexOf("K", 3));
		
		System.out.println(Employe.trim());
		
		System.out.println(String.valueOf(number));
		
		System.out.println(lowercase.toUpperCase());
		
		System.out.println(uppercase.toLowerCase());
		
		//String [] words = splitThis.split(",");
		
		//System.out.println(words);
		
		
			
			
		
		

	}

}
