package Calculator;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		if(n % 2 ==0)
		{
			n = n-1;
		}
		
		int odd =1;
		for (int i=0; i< n; i++)
		{
			System.out.println(odd);
			if(i <n-1)
			{
				System.out.println(",");
			}
			odd += 2;
		}
		
		
	}

}
