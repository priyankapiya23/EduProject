package HomeworkPoly;

public class Poly1 {
String name;
String course;
Poly1(String name,String course){
	this.name=name;
	this.course=course;
	
}
double getdata(int marks1,int marks2)
{
	double total=marks1+marks2;
	double avg=(total/200)*100;
	System.out.println("marks is " + avg);
	return avg;
}
void display(int roll)
{
	   System.out.println("name: "+name);
	   System.out.println("roll: "+roll);
	   System.out.println("course: "+course);
	   
	   
}
} 
