package tarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class DataReader {
	
	protected File file;
	protected String title;
	protected String xLabel;
	protected String yLabel;
	protected ArrayList<String> seriesNames = new ArrayList<String>();
	
	public DataReader(){}
	
	public void loadFile(File aFile){
		this.file = aFile;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getXLabel(){
		return xLabel;
	}
	
	public String getYLabel(){
		return yLabel;
	}
	
	public ArrayList<String> getSeriesNames(){
		return seriesNames;
	}
	
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
}
