import java.util.Scanner;

public class Reverse {
	String SentenceReverse(String s){
		
		String buff="";
		// use StringBuilder.
		String result="";
		for(int i=s.length()-1;i>=0;i--){
		  buff+=i!=0?s.charAt(i):s.charAt(i)+" ";	
		  if(s.charAt(i)==' '||i==0){
			for(int a=buff.length()-1;a>=0;a--){
				result+=buff.charAt(a);
			}
			buff="";
		  }
		}
		return result;
		
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sen=s.nextLine();
		Reverse r=new Reverse();
		String result=r.SentenceReverse(sen);
		System.out.println(result);

	}

}
