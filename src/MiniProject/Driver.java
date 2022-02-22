package MiniProject;

 class Driver {
	String name;
	int license;
	int mobile;

	public Driver() {
		this.name = "Car Owner";
		this.license = 11111;
		this.mobile = 11111;
	}

	public void drive() {
		System.out.println("Drive started..." + "Have a nice drive!");
	}

	public void profile(String name) {
		this.name = name;
	}

	public void profile(String name, int license) {
		this.name = name;
		this.license = license;
	}

	public void profile(String name, int license, int mobile) {
		this.name = name;
		this.license = license;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}
}

