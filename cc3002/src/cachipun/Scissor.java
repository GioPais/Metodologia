package cachipun;

public class Scissor {
	
	public int play(Hand v){
		return v.playWithScissor(this);
	}
	
	public int playWithStone(Stone v){
		return -1;
	}
	
	public int playWithScissor(Scissor v){
		return 0;
	}
	
	public int playWithPaper(Paper v){
		return 1;
	}

}
