package Calculator;
import java.util.Scanner;


public class Problem1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the first number a");
	double a = sc.nextDouble();
	
	System.out.println("enter the second number b");
	double b= sc. nextDouble();
	
	System.out.println("enter operation add, sub, mul, div");
	String op = sc.next();
	
	Operations oper = new Operations(a, b);
	 
	double  result =oper.operate(op);
	
	if (!Double.isNaN(result))
	 {
		 System.out.println("Result"+result);
	 }
	 sc.close();
	}
}


 class Operations
{
	private double a;
	private double b;
	
	public  Operations(double a, double b)
	{
		this.a= a;
		this.b=b;
		
	}
	public double operate(String operation)
	{
		switch (operation.toLowerCase())
		{
		case "add":
			return a+b;
		case "sub":
			return a-b;
		case "mul":
			return a*b;
		case "div":
			if(b!=0)
			{
			return a/b;
			}
			else
			{
				System.out.println("division by zero not applicable");
				return Double.NaN;
			}
		default:
				System.out.println("invalid operation");
				return Double.NaN;
		}
		
	}
}

