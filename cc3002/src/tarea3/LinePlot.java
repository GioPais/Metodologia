package tarea3;

import java.util.List;

import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
/**
 * Clase encargada del plot del tipo LinePlot con metodos y el chart adecuado
 @author Giovanni Pais
 *
 * @param <T1> informacion del eje X de los graficos
 * @param <T2> informacion del eje Y de los graficos
 */
public class LinePlot<T1, T2> extends Plot<T1,T2> {
	private LineChart<T1, T2> plot;

	public LinePlot(Axis<T1> xAxis, Axis<T2> yAxis){
		super(xAxis,yAxis);
		plot = new LineChart<T1, T2>(xAxis, yAxis);
	}

	public void addSeries(List<T1> xData, List<T2> yData){
		addSeries(xData, yData, "");
	}

	public void addSeries(List<T1> xData, List<T2> yData, String seriesName){
		XYChart.Series<T1, T2> series= super.setSeries(xData,yData,seriesName);
		plot.getData().add(series);
	}

	public void setTitle(String title){
		plot.setTitle(title);
	}

	public LineChart<T1, T2> getPlot(){
		return plot;
	}
	
	public void clear(){
		plot.getData().clear();
	}
}
