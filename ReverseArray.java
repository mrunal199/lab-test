import java.util.*;
public class ReverseArray
{ 
  public static void main(String args[])
  { 
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array :");
	int n = sc.nextInt();
	int a []= new int [n];
	
	System.out.println("Enter the element :");
	//input taken from user
	for (int i=0; i<a.length; i++)
	{ 
	    a[i]=sc.nextInt();
	}	
	//printing of an array
	for (int i=0; i<a.length; i++)
	{ 
	    
		System.out.print(a[i]+" ");
	}
	System.out.println( );
	
	//Reverse of array
	System.out.println("Reverse Array is : ");
	for (int i= a.length-1; i>=0; i--)
	{
         
		 System.out.print(a[i]+ " ");
	}		 
  }
}  