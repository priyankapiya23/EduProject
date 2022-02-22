package packageexample;

import java.util.ArrayList;
import java.util.Collections;

public class MainCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanClass bean = new BeanClass("red","zara",123.98);
		BeanClass bean1 = new BeanClass("black","arrow",437.7);
		BeanClass bean2 = new BeanClass("blue","guess",13.5);
		
		ArrayList<BeanClass> a1 =new ArrayList<BeanClass>();
		a1.add(bean);
		a1.add(bean1);
		a1.add(bean2);
		Collections.sort(a1);
		for(BeanClass obj:a1)
		{
        	System.out.println("Brand:: "+obj.getBrand());
			System.out.println("Price:: "+obj.getPrice());
			System.out.println("Color:: "+obj.getColor());
			System.out.println(" "+obj);
		}
	}

}
