package tarea3;

import java.io.IOException;
import java.util.ArrayList;

public class CData {
	private String category;
	private ArrayList<Number> values = new ArrayList<Number>();
	
	public CData(String category, ArrayList<String> values){
		this.category =category;
		for (String aStringValue : values) {
			this.values.add(Integer.parseInt(aStringValue));
		}
	}
	
	public CData(String[] line) throws IOException{
		this.category=line[0];
		for(int i=1;i<line.length;i++){
			this.values.add(Integer.parseInt(line[i]));
		}
		
	}
	
	public String getCategory(){
		return category;
	}
	
	public ArrayList<Number> getValues(){
		return values;
	}
	
	

}
