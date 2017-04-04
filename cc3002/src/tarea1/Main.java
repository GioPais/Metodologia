package tarea1;

public class Main {
	
	public static void main(String[] argv){
		Pokemon c = new Pokemon("charmander",100,"fire",50);
		Pokemon b = new Pokemon("bulbasaur",100,"planta",30);
		
		c.status();
		b.status();
		
		c.atack(b);
		
		c.status();
		b.status();
	}
}
