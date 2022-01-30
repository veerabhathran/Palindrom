package Palindrom;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Am in Trichy";
	      int intIndex = str.indexOf("Trichy");
	      
	      if(intIndex > 0) {
	         System.out.println(" found"+intIndex);
	      } else {
	         System.out.println("not Found  " + intIndex);
	      }
	}

}
