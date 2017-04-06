package tarea1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class GeneralTest {
	
	private Fire f;
	private Fire f2;
	private Grass gs;
	
	@Before
	public void setUp() throws Exception {
		f = new Fire("torchic",100,10);
		f2 = new Fire("Charmander",100,10);
		gs = new Grass("bulbasaur",100,10);
	}
	
	
	//@Test
	//public void test() {
	//	fail("Not yet implemented");
	//}
	
	@Test
	public void testHeal(){
		f.atack(f2);
		assertEquals(10,f2.damage,0);
		f2.heal();
		assertEquals(0,f2.damage,0);
	}
	
	@Test
	public void testAtack(){
		f.atack(f2);
		assertEquals(10,f2.damage,0);
		f2.heal();
	}
	
	@Test
	public void testAtackRes(){
		gs.atack(f);
		assertEquals(-10,f.damage,0);
	}
	
	@Test
	public void testAtackVul(){
		f.atack(gs);
		assertEquals(20,gs.damage,0);
		gs.heal();
	}

}
