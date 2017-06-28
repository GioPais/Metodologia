package tarea3;

import java.io.IOException;
import java.util.ArrayList;
/**
 * Clase que almacena los datos necesarios para realizar plot en ScatterPlot y LinePLot.
 * @author Giovanni Pais
 *
 */
public class TData {
	/*
	 * Valor en el eje y del dato.
	 */
	private Number yValues;
	/*
	 * Valor en el eje x del dato.
	 */
	private Number xValues;
	/*
	 * Indice que indica a que serie corresponde el dato
	 */
	private int serieIndex;
	
	
	/*
	 * Constructor de la clase. Se le entrega un arreglo de String que creado a partir de una linea del FileReader.
	 * El parametro line ya viene separada por "," y ya se verifico que la linea esta bien construida.
	 */
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
