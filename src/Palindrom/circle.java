package Palindrom;

public class circle  extends shape{

	@Override
	void area(int x, int y) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		int total = (x*y);
		System.out.println(total);
	}

	@Override
	void volume(int x, int y, int z) {
		// TODO Auto-generated method stub
		int total = (x*y*z);
		System.out.println(total);
	}

}
	

