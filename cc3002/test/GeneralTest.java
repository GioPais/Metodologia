package tarea1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class GeneralTest {
	
	private Fire f;
	private Grass gs;
	
	@Before
	public void setUp() throws Exception {
		f = new Fire("torchic",100,10);
		gs = new Grass("bulbasaur",100,10);
	}
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test(){
		f.atack(gs);
		asserEquals(20,gs.damage,0.1);
	}

}
