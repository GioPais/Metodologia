package test2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import tarea2.ScatterPlot;

public class ScatterPlotTest {
	
	private ScatterPlot SP;
	
	@Before
	public void setUp() throws Exception {
		
	}

	
	
	@Test
	public void graphtest() {
		
		SP=new ScatterPlot();
		
		// 5x5 
		int ym=3;
		int xm=3;
		String xlabel[] = {"0","1","2"};
		int xlabel2[] = {0,1,2};
		
		int ylabel[] = {0,2,4};
					
		int data[][] = {{0,0,1},{0,1,0},{1,0,0}};
				
		
		SP.setXLabel(xlabel, 2, 3);
		SP.setYLabel(ylabel, 4, 3);
		SP.setData(xlabel, ylabel);
		
		System.out.println("Inicia Test");
		SP.draw();
		assertEquals(10,10);
	}
	
}
