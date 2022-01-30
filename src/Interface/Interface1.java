package Interface;

public interface Interface1 {
	int x = 100;
	 void show();
	 public static void staticdemo() {
		 System.out.println("Method from I1");
		  }
	default void defmethod() {
		System.out.println("My default from I1");}
}
