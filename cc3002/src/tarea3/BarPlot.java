package tarea3;

import java.util.List;

import javafx.scene.chart.Axis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

public class BarPlot<T1, T2> extends Plot<T1,T2> {
	private BarChart<T1, T2> plot;

	public BarPlot(Axis<T1> xAxis, Axis<T2> yAxis){
		super(xAxis,yAxis);
		plot = new BarChart<T1, T2>(xAxis, yAxis);
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

	public BarChart<T1, T2> getPlot(){
		return plot;
	}
}
