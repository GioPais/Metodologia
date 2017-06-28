package tarea3;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class DataTest {

	
	
	private CData cd;
	private TData td;
	
	@Before
	public void setUp() throws Exception {
				
	}
	@Test
	public void CDtest() throws IOException {
		
		String[] cdInput= new String[3];
		cdInput[0]="Chile";
		cdInput[1]="1810";
		cdInput[2]="2017";
		
		cd= new CData(cdInput);
		assertEquals(cd.getCategory(),"Chile");
		assertTrue(cd.getValues().contains(1810));
		assertTrue(cd.getValues().contains(2017));
		assertEquals(10,10);
	}
	
	@Test
	public void TDtest() throws IOException {
		
		String[] tdInput= new String[3];
		tdInput[0]="2017";
		tdInput[1]="1810";
		tdInput[2]="1";
		
		td= new TData(tdInput);
		assertEquals(td.getXValues(),2017);
		assertEquals(td.getYValues(),1810);
		assertEquals(td.getSerieIndex(),1);
		assertEquals(10,10);
	}

}
