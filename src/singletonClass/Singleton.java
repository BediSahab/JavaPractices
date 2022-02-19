package singletonClass;

public class Singleton {

	public static void main(String[] args) {
		CoffeeMachine m1 = CoffeeMachine.getInstance();
		CoffeeMachine m2 = CoffeeMachine.getInstance();
		CoffeeMachine m3 = CoffeeMachine.getInstance();

		m1.getCoffee();
		
		if(m1==m2&&m2==m3)
		{
			System.out.println("Same Instance");
		}
	}

}
