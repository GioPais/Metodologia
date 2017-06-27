package tarea3;

import java.util.List;

import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;

public interface IPlot<T1,T2> {
	
	public void setXLabel(String label);
	public void setYLabel(String label);
	
	void addSeries(List<T1> xData, List<T2> yData);
	void addSeries(List<T1> xData, List<T2> yData, String seriesName);
	public void setTitle(String title);
	public XYChart<T1, T2> getPlot();
	public void clear();
	
	
	
}
