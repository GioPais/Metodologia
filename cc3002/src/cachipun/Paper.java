package cachipun;

public class Paper implements Hand {

	public int play(Hand v) {
		return v.playWithPaper (this);
	}

	public int playWithStone (Stone v) {
		return -1;
	}

	public int playWithScissor (Scissor v) {
		return 1;
	}

	public int playWithPaper (Paper v) {
		return 0;
	}
	
}
