package tarea3;

import java.io.IOException;
import java.util.ArrayList;

public class TData {
	
	private Number yValues;
	private Number xValues;
	private int serieIndex;
	
	public TData(String xValue, String yValue, String serieIndex) throws IOException {
		this.xValues = Integer.parseInt(xValue);
		this.yValues = Integer.parseInt(yValue);
		this.serieIndex = Integer.parseInt(serieIndex);
	}
	
	public TData(String[] line) throws IOException{
		
		this.xValues=Integer.parseInt(line[0]);
		this.yValues=Integer.parseInt(line[1]);
		this.serieIndex=Integer.parseInt(line[2]);
		
	}
	
	public Number getXValues() {
		return xValues;
	}



	public Number getYValues() {
		return yValues;
	}
	
	public int getSerieIndex(){
		return serieIndex;
	}

}
