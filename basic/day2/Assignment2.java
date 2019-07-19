package basic.day2;

public class Assignment2 {

	public static void main(String args[]){
		boolean bool = false;
		for(int i= 0; i<5 ; i++){
		  for(int j = 0; j<10; j++){
		    System.out.print(j +"\t");
		    if(bool==false){
		    	break;
		    }
		  }
		  System.out.println("Outer Loop");
		}
		System.out.println("End");
	}
}
