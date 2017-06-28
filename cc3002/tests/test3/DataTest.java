package test3;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;


import tarea3.CData;
import tarea3.TData;

public class DataTest {

	private CData cd;
	private TData td;
	
	@Before
	public void setUp() throws Exception {
		String[] cdInput= new String[3];
		cdInput[0]="Chile";
		cdInput[1]="1810";
		cdInput[2]="2017";
				
	}
	@Test
	public void CDtest() throws IOException {
		
		String[] cdInput= new String[3];
		cdInput[0]="Chile";
		cdInput[1]="1810";
		cdInput[2]="2017";
		
		cd= new CData(cdInput);
		assertEquals(cd.getCategory(),"Chile");
		assertEquals(10,10);
	}
}
