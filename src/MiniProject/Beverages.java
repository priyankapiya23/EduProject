package MiniProject;

abstract class Beverages {
	private void addHotWater() {
		System.out.println("Adding hot water");
	}

	private void addMilk() {
		System.out.println("Adding hot milk");
	}

	private void addSugar() {
		System.out.println("Adding Sugar");
	}

	public void getMixture() {
		System.out.println("Your Beverage is " + "getting ready...");
		addHotWater();
		addMilk();
		addSugar();
	}

	public abstract void getBeverage();

	public abstract void addIngredients();

}
