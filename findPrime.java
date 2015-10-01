import java.util.Scanner;

public class findPrime {

	void find(int num){
		if (num<=1){
			System.out.println(num+" "+"is not Prime");
		}
		else{
			if ((num%2==0)||(num%3==0)){
				System.out.println(num+" "+"is not Prime");
			}
			else{
				System.out.println(num+" "+"is Prime");
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		findPrime fp=new findPrime();
		fp.find(num);

	}

}
