package constructor;

public class Circle {
	
	double radius;
	double area;
	double circumferences;
	double diameter;
	String color;
	//constructor without parameter
Circle()
{
	System.out.println("calculate the circumferences program");
}
//constructor with two arguments
Circle(double r,String c)
{
	radius=r;
	color=c;
}
//using method to calculate circumferences
public double circumferences(double circum)
{
	circumferences= 2*Math.PI*radius;
	return circumferences;
}
//using diameter method  to calculate the diamater of the circle
public double diameter(double dmeter)
{
	diameter=2*radius;
	return diameter;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//obj create for constructor no argument
		Circle objc=new Circle();
		//create aobject for constructor with two arguments
		Circle objc1=new Circle(2.5,"red");
		System.out.println();
		System.out.println("The radius of the circle is :"+objc1.radius);
		
		System.out.println("The color of the circle is :"+objc1.color);
		//call the circumfrences method 
		System.out.println();
		System.out.println("circumferences of the circle is :"+objc1.circumferences(2.5));
		System.out.println("The diameter of the circle is :" + objc1.diameter(2.5));
				
	}

}

//Output
//calculate the circumferences program

//The radius of the circle is :2.5
//The color of the circle is :red

//circumferences of the circle is :15.707963267948966
//The diameter of the circle is :5.0

