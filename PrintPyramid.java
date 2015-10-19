import java.util.Scanner;

public class PrintPyramid {
	// this function is not correct, it cannot print out the right result.
	// first letter of function name should be lower case.
	void PrintPyramidNum(int row){
		int num=1;
		for(int n=1;n<=row;n++){
			for(double j=0;j<row/(n+1);j+=2){
				System.out.print(" ");
			// careful of the following indentation.
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
