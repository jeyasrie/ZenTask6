package constructor;

public class Employee {
//declare the variables using private ,the employee salary is confidential
 private int ID;
 private String Firstname;
 private String Lastname;
 private  int salary;
 private String name;
 private int annual_salary;
private  int newsalary;
 private int new_annual_salary;
 
 //setting the employee variable
 public void setemplyee(int no,String Fn,String Ln,int s)
 {
	 ID=no;
	 Firstname=Fn;
	 Lastname=Ln;
	 salary=s;
	 
 }
 //get emplyee id
 public int getid()
 {
	 return ID;
 }
 //get employee firstname
 public String getfirstname()
 {
	 return Firstname;
	 
 }
 //get employee lastname
 public String getlastname()
 {
	 return Lastname;
 }
 //using  concadinate two string
 public String getname()
 {
	 name=Firstname.concat(Lastname);
	 return name;
 }
 //get employee  salary before increment
 public  int getsalary()
 {
	return salary;
 }
 //gey employee annual salary before increment
 public int getannual_salary()
 {
	 annual_salary=salary*12;
	 System.out.println();
	 System.out.println("emplyee annual salary before increment");
	 return annual_salary;
 }
//using raisesalary method to calculate new salary
 public void raisesalary(int  percent)
 {
	 
 	percent=salary*20/100;
 	newsalary=salary+percent;
 	System.out.println();
 	System.out.println(" The salary 20% increment of: "+ newsalary);
 	
 }
 //calculate the annual salary of new salary
 public int newannualsalary() {
	 new_annual_salary=newsalary*12;
	 System.out.println();
	 System.out.println("employee annual salary after increment ");
	 return new_annual_salary;
 }
 //using tostring() method display the employee details after salary increment
 public String toString()
	 {  
	 System.out.println();
	 System.out.println("Employee Details");
	    return "Employee [emp_id = " + ID+ ",emp_name= " + name+", emp_salary ="+ newsalary + ",emp_newannualsalary="+ new_annual_salary+"]";
	    }  

public static void main(String[] args)
{
		// TODO Auto-generated method stub
   //create the object of employee class
         Employee emp=new Employee();
         //set the employee values 
          emp.setemplyee(4,"sankar","varathan",5000);
          //call the employee id,name,salary
 		 System.out.println("emp_id : "+ emp.getid());
 		  System.out.println("emp_name : "+emp.getname());
 		  System.out.println("emp_old_salary: "+emp.getsalary());
 		  System.out.println("emp_annual_salary :"+emp.getannual_salary());
 		  emp.raisesalary(5000);
 		  System.out.println(emp.newannualsalary());
 		  
 		  System.out.println(emp.toString());
 }
	}

//output

//emp_id : 4
//emp_name : sankarvarathan
//emp_old_salary: 5000

//emplyee annual salary before increment
//emp_annual_salary :60000

 //The salary 20% increment of: 6000

//employee annual salary after increment 
//72000

//Employee Details
//Employee [emp_id = 4,emp_name= sankarvarathan, emp_salary =6000,emp_newannualsalary=72000]
