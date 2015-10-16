import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
	void generateFibonacci(int max){
		
		int a=1;
		int b=1;
	System.out.print(a+" "+b);	
	while (a+b<max){
		int c=a+b;
		System.out.print(" "+c);
		
		a=b;
		b=c;
		
		}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int max=s.nextInt();
		Fibonacci f=new Fibonacci();
		
		f.generateFibonacci(max);
		

		

	}

}
		
		
		
	