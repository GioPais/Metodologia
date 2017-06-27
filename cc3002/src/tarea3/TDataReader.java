package tarea3;

import java.io.File;
import java.util.ArrayList;

public class TDataReader extends DataReader {

	private ArrayList<TData> series = new ArrayList<TData>();
	
	public ArrayList<Number> getXAxis(int index) {
		ArrayList<Number> xAxis =  new ArrayList<Number>();
		for (TData xValue : series ) {
			if(xValue.getSerieIndex()==index){
				xAxis.add(xValue.getXValues());
			}
			
		}
		return xAxis;
	}
	
	public ArrayList<Number> getYAxis(int index) {
		ArrayList<Number> yAxis =  new ArrayList<Number>();
		for (TData yValue : series ) {
			if(yValue.getSerieIndex()==index){
				yAxis.add(yValue.getXValues());
			}		
		}
		return yAxis;
	}
	

}
