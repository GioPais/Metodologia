package cachipun

class Stone implements Hand {

	public int play(Hand v) {
		return v.playWithStone (this);
	}

	public int playWithStone (Stone v) {
		return 0;
	}

	public int playWithScissor (Scissor v) {
		return -1;
	}

	public int playWithPaper (Paper v) {
		return 1;
	}

}