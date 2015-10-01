import java.util.Scanner;

public class countDigit {

	void count(int num){
		int n=1;
		while(num/(Math.pow(10,n-1))>=1){
			n++;
		}
		System.out.println(num+" "+"has"+" "+(n-1)+" "+"digits");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		countDigit c=new countDigit();
		c.count(num);
		
	}

}
