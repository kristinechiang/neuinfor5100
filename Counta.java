import java.util.Scanner;

public class Counta {

	void count(String sg){
		int c=0;
		for(int n=0;n<sg.length();n++){
			String s=sg.substring(n,n+1);
			if (s.equals("a")){
				c++;
			}
		}
		if(c==0){
			System.out.println(sg+" "+"has"+" "+"no"+" "+"'a'");
		}else{
			System.out.println(sg+" "+"has"+" "+c+" "+"'a'");
		}
				
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sg =s.nextLine();
		Counta a=new Counta();
		a.count(sg);

	}

}
