package oops;

public class Getter_Setter {

   
	 public Getter_Setter() {}
       public Getter_Setter(int x, String n) {
		
		this.x = x;
		this.n = n;
	}
	private int x;
       private String n;
    public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}

	}


