package aug14;

import java.util.Scanner;

public class eeven 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0) 
			{
				System.out.println(i+"");
			}
		}
	}

}
