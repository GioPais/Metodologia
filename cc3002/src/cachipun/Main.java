package cachipun;


public class Main {

	public static void main(String[] argv){
		
		Stone rock =new Stone();
		
		System.out.println(rock.playWithStone(new Stone()));
		System.out.println(rock.play(new Scissor()));
		System.out.println(rock.play(new Paper()));
		System.out.println(rock.play(new Stone()));
	}	

}
