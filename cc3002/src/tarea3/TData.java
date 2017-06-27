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
