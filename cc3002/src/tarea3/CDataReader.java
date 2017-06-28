package tarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CDataReader extends DataReader{
	
	private ArrayList<CData> series = new ArrayList<CData>();
	
	
	
	
	public void extractPlotData() throws IOException {
		
		FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String line2;
        String[] lineData;
        line=br.readLine();
        while((line = br.readLine()) != null) {
        	line2=line.replace(" ","");
            lineData = line2.split(",");
            //Verificar excepciones
            try{
            	series.add(new CData(lineData));
            }
            catch(IOException e){
            	System.out.println("Wrong data");
				e.printStackTrace();
            }
        }
        
        while((line = br.readLine()) != null) {
            
        	line2=line.trim().replace(" ","");
            lineData = line2.split(",");
            //Verificar excepciones    
            if(lineData.length>seriesNames.size()){
				System.out.println("Wrong Data!");
			}
			else{
				boolean status=true;
				
				for(int i=0;i<seriesNames.size();i++){
					if(lineData[i]==""){
						status=false;
					}
				}
				
				if(status==false){
					System.out.println("Wrong data!");
				}
				else{
					series.add(new CData(lineData));
				}
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
