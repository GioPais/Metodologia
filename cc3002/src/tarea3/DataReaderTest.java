package tarea3;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class DataReaderTest {

	private CDataReader cdr;
	private TDataReader tdr;
	private File cdFile, tdFile;
	
	@Before
	public void init() {
		cdFile = new File("countries.cdata");
		tdFile = new File("xy.tdata");
	}
	
	@Before
	public void setUp() throws Exception {
		cdr=new CDataReader();
		tdr=new TDataReader();
	}
	
	@Test
	public void CDRtest() throws IOException {
		
		cdr.loadFile(cdFile);
		assertTrue(cdr.getFile().equals(cdFile));
		
		assertEquals(10,10);
	}
	
	@Test
	public void TDRtest() throws IOException {
		
		tdr.loadFile(tdFile);
		assertTrue(tdr.getFile().equals(tdFile));
		
		assertEquals(10,10);
	}
}
