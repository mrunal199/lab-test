class LargestNo
{
  public static void main(String args[])
  { 
    int a = 23;
	int b = 10;
	int c = 86;
	
	int res = (a>b)? (a>c ? a:c):(b>c ? b:c);
	System.out.println("The largest no. is : " +res);
  }
}  