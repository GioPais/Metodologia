package cachipun;

public interface Hand {
	// 1 win, 0 draw, -1 loose
	int play (Hand v);
	int playWithStone (Stone stone);
	int playWithPaper (Paper paper);
	int playWithScissor (Scissor scissor);
}
