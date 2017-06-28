package tarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase abstracta padre de las clases encargadas de extraer los datos del archivo y guardarla.
 * Contiene objetos y metodos que codifican la informacion general de los graficos como el titulo, los labels y los valores del eje x.
 */
public abstract class DataReader {
	/**
	 * objeto del tipo File donde se almacena el archivo del cual se quiere obtener los datos para los plots
	 */
	protected File file;
	/**
	 * String que guarda el titulo del grafico extraido de la informacion del archivo.
	 */
	protected String title;
	/**
	 * String que guarda el label del eje x extraido de la informacion del archivo.
	 */
	protected String xLabel;
	/**
	 * String que guarda el lab del eje y extraido de la informacion del archivo.
	 */
	protected String yLabel;
	/**
	 * Arreglo de Strings que contiene los valores de los puntos del eje X.
	 */
	protected ArrayList<String> seriesNames = new ArrayList<String>();
	
	/**
	 * Constructor encargado de inicializar la clase
	 */
	public DataReader(){}
	/**
	 * Metodo encargado de cargar el archivo para extraer la informacion
	 */
	public void loadFile(File aFile){
		this.file = aFile;
	}
	
	public File getFile(){
		return file;
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
