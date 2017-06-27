package tarea3;

import java.util.List;

import javafx.scene.chart.Axis;
import javafx.scene.chart.XYChart;
/**
 * 
 * @author Giovanni Pais
 *
 * @param <T1> 
 * @param <T2>
 */
public abstract class Plot<T1,T2> implements IPlot<T1,T2>{
	protected Axis<T1> xAxis;
	protected Axis<T2> yAxis;
	protected XYChart.Series<T1, T2> series;
	
	public Plot(Axis<T1> xAxis, Axis<T2> yAxis){
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		series = new XYChart.Series<>();
	}
	
	public XYChart.Series<T1, T2> setSeries(List<T1> xData, List<T2> yData, String seriesName){
		if(xData.size() != yData.size())
			throw new IllegalArgumentException("X and Y data must have the same size");
		XYChart.Series<T1, T2> series = new XYChart.Series<>();
		for(int i=0; i<xData.size(); i++){
			series.getData().add(new XYChart.Data<>(xData.get(i), yData.get(i)));
		}
		series.setName(seriesName);
		return series;
	}
	
	public void setXLabel(String label){
		xAxis.setLabel(label);
	}
	
	public void setYLabel(String label){
		yAxis.setLabel(label);
	}
}
