package tarea3;

import java.util.HashMap;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

public class PlotFactory {
	
	private static HashMap<String, Plot> plots = new HashMap<String, Plot>();
	
	static {
		plots.put("LinePlot", new LinePlot<>(new NumberAxis(), new NumberAxis()));
		plots.put("BarPlot", new BarPlot<>(new CategoryAxis(), new NumberAxis()));
		plots.put("ScatterPlot", new ScatterPlot<>(new NumberAxis(), new NumberAxis()));
	}
	
	public static IPlot getPlot(String plotName) {
		
		IPlot plot = plots.get(plotName);
		
		if (plot!=null) {
			return plot;
		}
		else {
			// ################## Intentar con excepcion
			return null;
		}
	}

}
