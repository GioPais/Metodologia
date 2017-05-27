package tarea2;

import java.util.HashMap;

public class PlotFactory {
	
	private static HashMap<String, IPlot> plots = new HashMap<String, IPlot>();
	
	
	static{
		plots.put("BarPlot", new BarPlot());
		plots.put("ScatterPlot", new ScatterPlot());
		
	}
	
	public static IPlot getPlot(String type){
		IPlot plot =plots.get(type);
		
		if(plot!=null){
			return plot;
		}
		else{
			return null;
		}
	}

}
