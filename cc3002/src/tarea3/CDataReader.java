package tarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CDataReader extends DataReader{
	
	private ArrayList<CData> series = new ArrayList<CData>();
	

	public void extractDataInfo() throws FileNotFoundException {
		try {
			FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);
	        String[] line = br.readLine().split(";");
			this.title = line[0].trim();
			this.xLabel = line[1].trim();
			this.yLabel = line[2].trim();
			for (int i = 3; i < line.length; i++) {
				this.seriesNames.add(line[i].trim());
			}
			fr.close();
			br.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<String> obtainPlotData() throws IOException {
    	FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> data = new ArrayList<String>();
        String line;
        while((line = br.readLine()) != null) {
        	line.trim();
            data.add(line);
        }
        fr.close();
        br.close();
        return data;
	}
	
	public void extractPlotData() throws IOException {
		
		FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String[] lineData;
        line=br.readLine();
        while((line = br.readLine()) != null) {
        	line.trim();
            lineData = line.split(", ");
            //Verificar excepciones
            try{
            	series.add(new CData(lineData));
            }
            catch(IOException e){
            	System.out.println("Wrong data");
				e.printStackTrace();
            }
        }
        fr.close();
        br.close();
        
		
	}
	
	public ArrayList<String> getXAxis() {
		ArrayList<String> xAxis =  new ArrayList<String>();
		for (CData category : series ) {
			xAxis.add(category.getCategory());
		}
		return xAxis;
	}
	
	public ArrayList<Number> getYAxis(int index) {
		ArrayList<Number> yAxis =  new ArrayList<Number>();
		for (CData values : series ) {
			yAxis.add(values.getValues().get(index));		
		}
		return yAxis;
	}

	

}
