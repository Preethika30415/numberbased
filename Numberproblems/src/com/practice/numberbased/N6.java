package com.practice.numberbased;

public class N6 
{
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int c=0;
		while(n!=0) 
		{
			int rem=n%10;
			n=n/10;
			c=c*10+rem;
		}
		System.out.println("The reverse of integer is "+c);
	}
}
