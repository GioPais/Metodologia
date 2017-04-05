package tarea1;

public class Main {
	
	public static void main(String[] argv){
		Grass g1 = new Grass("chikorita",100,50);
		Grass g2 = new Grass("bulbasaur",100,30);
		Fire  f1 = new Fire("Charmander",100,50);
		
		g1.status();
		g2.status();
		f1.status();
		
		System.out.println("-----------------------------");
		g1.atack(g2);
		System.out.println("-----------------------------");
		
		g1.status();
		g2.status();
		f1.status();
		
		System.out.println("-----------------------------");
		f1.atack(g1);
		System.out.println("-----------------------------");
		
		g1.status();
		g2.status();
		f1.status();
		

		System.out.println("-----------------------------");
		g2.atack(f1);
		System.out.println("-----------------------------");
		
		g1.status();
		g2.status();
		f1.status();
	}
}
