package tarea3;

import javafx.scene.chart.Axis;
/**
 * 
 * @author Giovanni Pais
 *
 * @param <T1> 
 * @param <T2>
 */
public abstract class Plot<T1,T2> {
	protected Axis<T1> xAxis;
	protected Axis<T2> yAxis;
	
	public Plot(Axis<T1> xAxis, Axis<T2> yAxis){
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}
	
	
	public void setXLabel(String label){
		xAxis.setLabel(label);
	}
	
	public void setYLabel(String label){
		yAxis.setLabel(label);
	}
}
