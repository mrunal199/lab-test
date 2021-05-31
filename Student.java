class Student
{
  void test()
  { System.out.println("Class Test");  }
}  
class Marks extends Student
{
   void marks()
   { System.out.println("Marks of the Student"); }
  }
class Result extends Marks
{
   void marks()
   { System.out.println("Result of Class Test");  }

    public static void main(String args [])
	{
	 Result r1 = new Result();
	 r1.marks();
	}	
}
