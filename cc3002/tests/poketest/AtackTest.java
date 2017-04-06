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


public class AtackTest {

	private Electric el;
	private Electric el1;
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
		el1 = new Electric("Raichu",100,10);
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
	
	
	//ELECTRIC
	
	//Vulnerable
	@Test
	public void testGroundVsElectric(){
		gn.atack(el);
		assertEquals(20,el.damage,0);
		el.heal();
	}
	
	//Resistente
	public void testElecticVsElectric(){
		el1.atack(el);
		assertEquals(-10,el.damage,0);
		el.heal();
	}
	
	//-------------------------------------------------------------------------------------------
	//FIRE
	
	//Vulnerable
	@Test
	public void testWaterVsFire(){
		wt.atack(fr2);
		assertEquals(20,fr2.damage,0);
		fr2.heal();
	}
	
	@Test
	public void testGroundVsFire(){
		gn.atack(fr2);
		assertEquals(20,fr2.damage,0);
		fr2.heal();
	}
		
	//Resistente
	@Test
	public void testGrassVsFire(){
		gs.atack(fr2);
		assertEquals(-10,fr2.damage,0);
		fr2.heal();
	}
	
	//-------------------------------------------------------------------------------------------
	//GRASS
	
	//Vulnerable
	@Test
	public void testFireVsGrass(){
		fr.atack(gs);
		assertEquals(20,gs.damage,0);
		gs.heal();
	}
	
	//Resistente
	@Test
	public void testGroundVsGras(){
		gn.atack(gs);
		assertEquals(-10,gs.damage,0);
		gs.heal();
	}
		
	@Test
	public void testWaterVsGrass(){
		wt.atack(gs);
		assertEquals(-10,gs.damage,0);
		gs.heal();
	}
	
	//--------------------------------------------------------------------------------------------------
	//GROUND
	
	//Vulnerable
	@Test
	public void testWaterVsGround(){
		wt.atack(gn);
		assertEquals(20,gn.damage,0);
		gn.heal();
	}
	
	@Test
	public void testGrassVsGround(){
		gs.atack(gn);
		assertEquals(20,gn.damage,0);
		gn.heal();
	}
	
	//Resistentes
	@Test
	public void testNormalVsGround(){
		nm.atack(gn);
		assertEquals(-10,gn.damage,0);
		gn.heal();
	}
	
	@Test
	public void testElectricVsGround(){
		el.atack(gn);
		assertEquals(-10,gn.damage,0);
		gn.heal();
	}
	
	
}
