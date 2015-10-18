import java.util.Random;

public class Player {

	
	public int randomguess(int min, int max){
		while(true){
		Random randomGenerator = new Random();
		int i = randomGenerator.nextInt(100);
		if(i<max&&i>min){
		 return i;
		}
		}		
	}
	
}
