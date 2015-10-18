import java.util.Random;

public class Game {
	

	int gresult(){
		Random randomGenerator = new Random();
		int i = randomGenerator.nextInt(100);
		return i;
	}
	int compare(int answer,int result,int count){
		
		int tag=answer-result;
		
		if (tag>0){
			System.out.println(answer+" is greater than what I've guessed - You have "+count+" chances to guess");
		}
		else if(tag<0){
			System.out.println(answer+" is less than what I've guessed - You have "+count+" chances to guess");
		}
		else{
			System.out.println("Congratulations! You've guessed it right and you guessed it in "+(5-count)+" chances..");
		}
		return tag;
		
	}
	void end(){
		System.out.println("Game Over");
	}

}
