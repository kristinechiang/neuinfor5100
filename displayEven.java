
import java.util.Scanner; 
public class displayEven {
	

	

	void showEven(int num){

		int n=num/2;
		
		 for(int i=1;i<=n;i++)
		{
			System.out.println(2*i);
		}
		
		}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if (num<2)
		{ System.out.println("Please input a number largerer than 2");}
		else{
			displayEven d=new displayEven();
		 d.showEven(num);
		}

	}
}
