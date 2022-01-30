package Interface;

public class Interdemo implements Interface1, Interface2 {

	public Interdemo() {
		this.defmethod();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Method overriding is hear ");
	}
static void staticdemo() {
	Interface2.display();
}
}
