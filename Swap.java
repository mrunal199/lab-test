import java.util.*;
public class Swap
{
  public static void main(String args[])
  {
    int i, k, temp;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first no. :");
	i= sc.nextInt();
	
	System.out.println("Enter the second no. :");
	k= sc.nextInt();
	
	System.out.println("Before Swapping : i= "+i+ " and k= "+k);
	temp = i;
	i =k;
	k = temp;
	System.out.println("After Swapping : i= "+i+ " and k= "+k);
  }
}  
	
	