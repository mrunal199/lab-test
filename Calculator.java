class AddCalculator
{
    int add(int x,int y)
      {
         int res = x + y;
         return res;
       }
   
     double add(double x,double y)
       {
         double res = x + y;
         return res;
	}

}

class Calculator
{
   public static void main(String args[])
    {
      AddCalculator calc = new AddCalculator();
      int res =calc.add(3,5);
      System.out.println(res);

      double res1 =calc.add(4.5,6.3);
      System.out.println(res1);
     }
}


      