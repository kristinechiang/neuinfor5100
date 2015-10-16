import java.util.Scanner;

public class PrintPyramid {
	
	void PrintPyramidNum(int row){
		int num=1;
		for(int n=1;n<=row;n++){
			for(double j=0;j<row/(n+1);j+=2){
				System.out.print(" ");
			for(int i=1;i<=n;i++){
				
				System.out.print(num);
				num++;
			}
			System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		PrintPyramid pp=new PrintPyramid();
		pp.PrintPyramidNum(row);
		

	}

}
