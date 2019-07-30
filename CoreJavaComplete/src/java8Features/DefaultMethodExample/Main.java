package java8Features.DefaultMethodExample;

public class Main {

	public static void main(String[] args) {
		
		Cricketer bat = new Batsman();
		
		bat.bat();
	    bat.field();
	    bat.bowl();
	    
	    
	    Cricketer allround= new AllRounder();
	    allround.bat();
	    allround.field();
	    allround.bowl();
	    		
		

	}

}
