package test2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import tarea2.Plot;

public class PlotTest {
	
	private Plot p1;
	
	
	
	
	@Before
	public void setUp() throws Exception {
		p1 = new Plot("Grafico de prueba",10,10);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void graphtest() {
		
		System.out.println("Inicia Test");
		p1.graph();
		assertEquals(10,10);
	}
	
	
	
}
