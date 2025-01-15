package constructor;

public class Person {
	
	String name;
	int age;
	//constructor to assign variable
	Person(String a ,int b)
	{
		name=a;
		age=b;
	}
	//getname using getter method
public String getname()
{
	System.out.println("The name of the person is :"+name);
	return name;
}
//getage using getter method
public int getage()
{
	System.out.println("The age of the person is :"+age);
	return age;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pass tha parametrs for constructor class
		Person details=new Person("vino",40);
		Person details1=new Person("Tina",18);
		
		System.out.println("First Person details");
      
		
		//call the method getname and getage
		System.out.println("Name :"+details.getname());
		System.out.println("Age :"+details.getage());
		System.out.println();
        System.out.println("Second Person details");
        System.out.println("Name  :"+details1.getname());
        System.out.println("Age  :"+details1.getage());
	}

}

//Output
//First Person details
//The name of the person is :vino
//Name : vino
//The age of the person is :40
//Age  :40

//Second Person details
//The name of the person is :Tina
//Name  :Tina
//The age of the person is :18
//Age  :18
