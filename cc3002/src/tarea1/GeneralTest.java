package tarea1;

import static org.junit.Assert.*;

import measure.Before;
import measure.Inch;
import measure.Meter;

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

}
