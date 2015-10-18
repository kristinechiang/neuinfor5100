
public class gameStart {

	public static void main(String[] args) {
		Game game=new Game();
		Player player=new Player();
		int result=game.gresult();
		int count=5;
		int min=1;
		int max=100;
		System.out.println("Please guess a number between 1 and 100 - You have 5 chances to guess");
		while(count>0){
			count--;
		int answer=player.randomguess(min,max);
		System.out.println(answer);		
		int t=game.compare(answer,result,count);
		if(count==0&&t!=0){
			game.end();
		}
		if (t==0){
			break;
		}
		else if(t>0){
			max=answer;
		}
		else{
			min=answer;
		}
				
		}
	}

}
