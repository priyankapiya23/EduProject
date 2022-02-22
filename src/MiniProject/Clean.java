package MiniProject;

interface Clean {
	void cleanPot();
	}

	class Tea extends Beverages implements Clean {

		@Override
		public void addIngredients() {
			System.out.println("Tea Bag added");
		}

		@Override
		public void getBeverage() {
			cleanPot();
			getMixture();
			addIngredients();
			System.out.println("Tea's Ready! Enjoy");
		}

		@Override
		public void cleanPot() {
			System.out.println("Cleaning tea pot...");
		}
	}

	class Coffee extends Beverages implements Clean {

		@Override
		public void addIngredients() {
			System.out.println("Coffee Bag added");
		}

		@Override
		public void getBeverage() {
			cleanPot();
			getMixture();
			addIngredients();
			System.out.println("Coffee's Ready! Enjoy");
		}

		@Override
		public void cleanPot() {
			System.out.println("Cleaning Coffee pot...");

		}

}
