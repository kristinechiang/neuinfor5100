import java.util.Scanner;

public class PrintWord {
	void findWord(String s){
		String[] buff=s.split(" ");
		
		for(int n=0;n<buff.length;n++){
			if(buff[n].length()>3){
				
				System.out.println(buff[n]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sen=s.nextLine();
		PrintWord p=new PrintWord();
		p.findWord(sen);
		

	}

}
