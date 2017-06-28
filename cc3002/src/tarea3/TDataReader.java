package tarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TDataReader extends DataReader {

	private ArrayList<TData> series = new ArrayList<TData>();
	
	
	public void extractPlotData() throws IOException {
		
		FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String line2;
        String[] lineData;
        line=br.readLine();
        while((line = br.readLine()) != null) {
    
        	line2=line.trim().replace(" ","");
            lineData = line2.split(",");
            //Verificar excepciones
            
            if(lineData.length>3){
				System.out.println("Wrong Data!");
			}
			else{
				
				if(lineData[0].equals("") || lineData[1].equals("") || lineData[2].equals("") ){
					System.out.println("Wrong data!");
				}
				else{
					series.add(new TData(lineData));
				}
			}
        }
        fr.close();
        br.close();
	}
	
	
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
				yAxis.add(yValue.getYValues());
			}		
		}
		return yAxis;
	}
	

}
