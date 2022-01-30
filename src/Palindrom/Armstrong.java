package Palindrom;

	import java.util.Scanner;

	public class Armstrong {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	           int num,x,y,reverse =0;
	           System.out.println("Enter the number ");
	           @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	           num=sc.nextInt();
	           x=num;
	           while(num!=0)
	           {
	        	   y= num%10;
	        	   reverse=(y*y*y);
	        	   num= num/10;
	           }
	           if( x==reverse)
	           {
	        	   System.out.println("It is armstrong number");
	           }
	           else
	           System.out.println("It is armstrong number");
		}
		

	}


