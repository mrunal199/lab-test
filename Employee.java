class Employee
{
	int empid;
	float salary;
	String name;
	
	void get(int i, float s, String n)
	{
		empid =i;
		salary =s;
		name =n;
	}
    void display()
	{
     System.out.println("Employee ID : " + empid);		
	 System.out.println("Employee Salary : " + salary);	
	 System.out.println("Employee Name : " + name);	
	}
	public static void main(String args [])
	{
		Employee emp = new Employee();
		emp.get(101, 3500 , "XYZ" );
		emp.display();
		
		emp.get(102, 4500 , "PQR" );
		emp.display();
	}	