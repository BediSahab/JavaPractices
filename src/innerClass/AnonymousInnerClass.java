package innerClass;

public class AnonymousInnerClass {

	public void meth()
	{
		AbstractMy m = new AbstractMy() {
							public void display()
							{
								System.out.println("Hello");
							}
							};
		m.display();
	}
}
