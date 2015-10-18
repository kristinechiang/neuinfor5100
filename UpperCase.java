import java.util.Scanner;

public class UpperCase {
	String ctoUpperCase(String s){
		String result="";
		for(int n=0;n<s.length();n++){
			if(n!=0){
			result+=s.charAt(n-1)!=' '?s.charAt(n):Character.toUpperCase(s.charAt(n));
			
			}else{
				
				result+=Character.toUpperCase(s.charAt(n));
			}
			}
		return result;
			
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sen=s.nextLine();
		UpperCase u=new UpperCase();
		String result=u.ctoUpperCase(sen);
		System.out.println(result);

	}

}
