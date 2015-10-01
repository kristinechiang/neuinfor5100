import java.util.Scanner;

public class Countaa {

	void count(String sg){
		int c=0;
		int l=sg.length();
		String a=sg.substring(l-1);
		String w=sg.substring(0,l-2);
		
		for(int n=0;n<l-2;n++){
			
			String s=sg.substring(n,n+1);
			if (s.equals(a)){
				c++;
			}
		}
		if(c==0){
			System.out.println(w+" "+"has"+" "+"no"+" "+a);
		}else{
			System.out.println(w+" "+"has"+" "+c+" "+a);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sg =s.nextLine();
		Countaa ca=new Countaa();
		ca.count(sg);

	}

}
