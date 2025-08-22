package Calculator;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int n = sc.nextInt();

		        int odd = 1;
		        for (int i = 0; i < n; i++) {
		            System.out.print(odd);
		            if (i < n - 1) {   
		                System.out.print(", ");
		            }
		            odd += 2; 
		        }

		        sc.close();
		    }
		}


