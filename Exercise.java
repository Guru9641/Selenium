package week3.day1;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int income = 2000; 
        int rate = 0; 

        
        if (income < 0) {
            rate = 0;
        } else if (income < 8925) {
            rate = 10;  
        } else if (income < 36250) {
            rate = 15;  
        } else if (income < 87850) {
            rate = 23;  
        } else if (income < 183250) {
            rate = 28;  
        } else if (income < 398350) {
            rate = 33;  
        } else if (income < 400000) {
            rate = 35;  
        } else {
            rate = 40;  
        }

        
        System.out.println("");
	
	}

}
