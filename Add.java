import java.util.*;
public class Add
{
  public static void main(String args[])
  { 
    int num1, num2, sum ;
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first no. :");
	num1 = sc.nextInt();
	
	System.out.println("Enter the second no. :");
	num2 = sc.nextInt();
	
	sum = num1 + num2;
	System.out.println("Addition is : " +sum);
  }
}  
	
	