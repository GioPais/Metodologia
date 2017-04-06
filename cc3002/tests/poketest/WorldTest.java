package poketest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tarea1.Electric;
import tarea1.Fighting;
import tarea1.Fire;
import tarea1.Grass;
import tarea1.Ground;
import tarea1.Normal;
import tarea1.Psychic;
import tarea1.Water;


public class WorldTest {

	private Electric el;
	private Fighting fgt;
	private Fire fr;
	private Fire fr2;
	private Grass gs;
	private Ground gn;
	private Normal nm;
	private Psychic py;
	private Water wt;
	
	@Before
	public void setUp() throws Exception {
		el = new Electric("pikachu",100,10);
		fgt = new Fighting("Hitmonlee",100,10);
		fr = new Fire("torchic",100,10);
		fr2 = new Fire("Charmander",100,10);
		gs = new Grass("bulbasaur",100,10);
		gn = new Ground("sandrew",100,10);
		nm = new Normal("Snorlax",1000,10);
		py = new Psychic("Alakazam",100,10);
		wt = new Water("Squirtle",100,10);
		
	}
	
	
	//@Test
	//public void test() {
	//	fail("Not yet implemented");
	//}
	
	@Test
	public void testHeal(){
		fr.atack(fr2);
		assertEquals(10,fr2.damage,0);
		fr2.heal();
		assertEquals(0,fr2.damage,0);
	}
	
	@Test
	public void testAtack(){
		fr.atack(fr2);
		assertEquals(10,fr2.damage,0);
		fr2.heal();
	}
	
	@Test
	public void testAtackRes(){
		gs.atack(fr);
		assertEquals(-10,fr.damage,0);
	}
	
	@Test
	public void testAtackVul(){
		fr.atack(gs);
		assertEquals(20,gs.damage,0);
		gs.heal();
	}
	

}
