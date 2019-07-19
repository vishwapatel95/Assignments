package basic.day1;

public class Assignment7 {
	public static void main(String[] args){
		boolean bool1 = false;
		boolean bool2 = true;
		boolean bool3 = true;
		if(!(bool1 || (bool1 && (bool2=false)))){
			System.out.println("Success");
		}
		else{
			System.out.println("Failure");
		}
		
		System.out.println("bool2 value : " + bool2);
		System.out.println("Press any key to continue");
			
	}
	
}
