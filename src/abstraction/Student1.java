package abstraction;

public class Student1  extends College{
	
	void standard(String course)
	{
		System.out.println("(student1) my course is "+course);
	}
	@override
	void liberary(String name)
	{
		System.out.println(" i am regular student and my name is:: "+name);
	}

}