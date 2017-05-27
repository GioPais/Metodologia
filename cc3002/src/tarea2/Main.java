package tarea2;

		
public	class Main {
	
		//@Parameter(names={"BarPlot"})
		private boolean isBarPlot ;
	    //@Parameter(names={"ScatterPlot"})
	    private boolean isScatterPlot ;
	    //@Parameter(names = "-P", variableArity = true)
	    
	    //@Parameter(names={"-F"})
	    //private File file = null;
	    //@Parameter(names={"-x"})
	    private int Xmax;
	    //@Parameter(names={"-y"})
	    private int Ymax;
		
		
	    public void run() {   	
	        //if (file != null) {
	        //	
			//}
			
	        
		    IPlot plot;
		    String type = null;
	        if (isBarPlot) {
	        	type = "BarPlot";
	        }
	        else if (isScatterPlot) {
	        	type = "ScatterPlot";
	        }
	        else {
	        	// ERROR
	        }
	        
	        
	        //
	        type="BarPlot";
	        //
	        
	        plot = PlotFactory.getPlot(type);
	        
	        //test
	        
	        int ym=3;
			int xm=3;
			String xdata[] = {"0","1","2"};
			int xlabel2[] = {0,1,2};
			
			int ydata[] = {0,2,4};
						
			int data[][] = {{0,0,1},{0,1,0},{1,0,0}};
					
			
			plot.setXLabel(xdata, 2, 3);
			plot.setYLabel(ydata, 4, 3);
			plot.setData(xdata, ydata);
	        
	        
	    	plot.draw();
	    }

	    
}


