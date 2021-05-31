class Student
{   float marks()
	{ return 27;  }
   // void test()
  //{ System.out.println("Class Test");  }
}  
class Marks extends Student
{
	float marks()
	{ return 85; }
   //void marks()
   //{ System.out.println("Marks of the Student"); }
  }
class Result extends Marks
{
	float marks()
	{ return 59; }
   //void marks()
   //{ System.out.println("Result of Class Test");  }

    public static void main(String args [])
	{
	 Result r1 = new Result();
	 Marks m1 = new Marks();
	 System.out.println("The marks of the student is :" +r1.marks());
	 System.out.println("The result of the student is :" +m1.marks());
	}	
	
}
