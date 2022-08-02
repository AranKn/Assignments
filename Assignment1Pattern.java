package Assignment;
import java.util.Scanner;

public class Assignment1Pattern 
{
	@SuppressWarnings("resource")
	static void q1()
	{
		System.out.print("Enter the size : ");
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				if(i==0 || i==n-1 || j==n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.print("   ");
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			
			
			for(int j=0;j<n;j++)
			{
				if(i==0  || i==n-1 || i==n/2 || j==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			
			for(int j=0;j<n;j++)
			{
				if(((j==0  || j==n-1) && i!=n-1) || i==n-1 && j>0 && j<n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			
			for(int j=0;j<n;j++)
			{
				if(((i==0 || i==n/2)&&j!=n-1)|| j==0 || (j==n-1) && i<n/2 && i!=0 || (i>n/2 && j==2*(i-(n/2))))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			
			for(int j=0;j<n;j++)
			{
				if((i==0 &&(j>0 && j<n-1)) || (i==n-1 &&(j>0 && j<n-1)) || (j==0 &&(i>0 && i<n-1))  || (j==n-1 && (i>0 && i<n-1)))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			System.out.println();
		}
	}
	
	@SuppressWarnings("resource")
	static void q2()
	{
		System.out.print("Enter the size : ");
		int n=new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(i+" ");
			System.out.println();
		}
	}
	
	@SuppressWarnings("resource")
	static void q3()
	{
		System.out.print("Enter the size : ");
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				if(i==0||i==n-1||j==0||j==n-1 || ((i<(n/2)-1)&&(j<(n/2)-1-(i-1)) ||(j>(n/2)-1+(i-1))))
					System.out.print("* ");
				else
					System.out.print("  ");
		     System.out.println();
		}
	}
	
	@SuppressWarnings("resource")
	static void q4()
	{
		System.out.print("Enter the size : ");
		int n=new Scanner(System.in).nextInt();
		int mid=n/2;
		for(int i=0;i<(n/2)+1;i++)
		{
			for(int j=0;j<n;j++)
				if(i>(mid-2) || j<=i || j>=n-1-i)
					System.out.print("* ");
			    else
			    	System.out.print("  ");
		System.out.println();
		}
	}
	
	@SuppressWarnings("resource")
	static void q5()
	{
		System.out.print("Enter the size : ");
		int n=new Scanner(System.in).nextInt();
		int mid=(n-1)/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				if(i==0 || i==n-1 || (i<=mid && j<=mid-i) || (i>mid && j<=i-mid))
						System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		q1();
		q2();
		q3();
		q4();
		q5();
	}
}