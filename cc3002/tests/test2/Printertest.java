package test2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tarea2.PlotPrinter;
import tarea2.ScatterPlot;

public class Printertest {

	
	
private ScatterPlot SP;

	private PlotPrinter p;
	
	@Before
	public void setUp() throws Exception {
		p=new PlotPrinter();
	}

	
	
	@Test
	public void graphtest() {
		
		
		
		// 5x5 
		int ym=3;
		int xm=3;
		String xlabel[] = {"0","1","2"};
		int xlabel2[] = {0,1,2};
		
		int ylabel[] = {0,2,4};
					
		int data[][] = {{0,0,1},{0,1,0},{1,0,0}};
				
		
		p.setData(xlabel,ylabel,3,3,data);
		
		
		System.out.println("Inicia Test");
		p.print();
		assertEquals(10,10);
	}

}
