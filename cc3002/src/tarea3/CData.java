package tarea3;

import java.io.IOException;
import java.util.ArrayList;
/**
 * Clase que almacena los datos necesarios para realizar plot en BarPLot.
 * @author Giovanni Pais
 *
 */
public class CData {
	/*
	 * Categoria que indica a que serie corresponden los datos
	 */
	private String category;
	/*
	 * Arreglo con los valor de la serie para los distintos X del grafico
	 */
	private ArrayList<Number> values = new ArrayList<Number>();
	
	/*
	 * Constructor de la clase. Se le entrega un arreglo de String que creado a partir de una linea del FileReader.
	 * El parametro line ya viene separada por "," y ya se verifico que la linea esta bien construida.
	 */
	
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
