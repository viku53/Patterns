import java.util.Scanner;


public class Patterns {
	
	public void pattern1(int n)
	{
		int s=n;
		System.out.println("Pattern 1");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Pattern 2");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Pattern 3");
		
		for(int i=0;i<n;i++)
		{
		
			for(int j=0;j<s-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			s--;
		}
		System.out.println("Pattern 4");
		s=n;
		for(int i=0;i<n;i++)
		{
		
		
			for(int j=0;j<s-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			s--;
		}
		
	}
	
	public void number(int n)
	{
		int s=n;
		System.out.println("Pattern 1");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println("Pattern 2");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println("Pattern 3");
		
		for(int i=0;i<n;i++)
		{
		
			for(int j=0;j<s-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i+1;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
			s--;
		}
		System.out.println("Pattern 4");
		s=n;
		for(int i=0;i<n;i++)
		{
		
		
			for(int j=0;j<s-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
			s--;
		}
		
	}
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Patterns p = new Patterns();
		System.out.println("Enter the size of pattern:");
		int i = sc.nextInt();
		int n=0;
		System.out.println("To Print Numbers Enter 1 \n " +
				" To print * enter 2 \n");
		n = sc.nextInt();
		
		
		switch(n)
		{
		case 1 : p.number(i);
				 break;
		case 2 : p.pattern1(i);
				 break;
		default : System.out.println("Enter Valid Number");
		
		}
	}
	

}
