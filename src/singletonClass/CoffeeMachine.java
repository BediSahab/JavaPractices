package singletonClass;

public class CoffeeMachine {

	private float coffeeQty;
	private float milkQty;
	private float waterQty;
	private float sugarQty;
	
	static private CoffeeMachine my = null;   //reference of class
	
	private CoffeeMachine()   //private constructor
	{
		coffeeQty=1;
		milkQty=1;
		waterQty=1;
		sugarQty=1;
	}
	public void getCoffee()
	{
		float cofee = coffeeQty+milkQty+waterQty+sugarQty;
		System.out.println(cofee);
	}
	static CoffeeMachine getInstance()   //getInstannce Method
	{
		if(my==null)
			my= new CoffeeMachine();
		return my;
	}
}
