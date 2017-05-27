package tarea2;

public class ScatterPlot implements IPlot{
	
	private String[] xlabel;
	private int[] ylabel;
	private int[][] data;
	private PlotPrinter printer;
	
	public ScatterPlot(){
		this.printer= new PlotPrinter();
		this.xlabel= new String[1];
		this.ylabel= new int[1];
		this.data=new int[1][1];
	}
	
	

	@Override
	public void draw() {
		
		
		this.printer.setData(this.xlabel, this.ylabel ,this.xlabel.length, this.ylabel.length, this.data);
		
		this.printer.print();
		
	}



	public void setXLabel(String xdata[],int xmax, int xrex) {
		int delta=0;
		int n=0;
		if (xrex!=0){
			delta=xmax/xrex;
			n=xrex;
		}
		else{
			if(xmax<10){
				delta=1;
				n=xmax;
			}
			else{
				delta=xmax/10;
				n=10;
			}
		}
		
		this.xlabel=new String[n+1];
		for(int i=0;i<=n;i++){
			xlabel[i]=Integer.toString(i*delta);
		}
		
		if(xlabel[n]!=Integer.toString(xmax)){
			xlabel[n]=Integer.toString(xmax);
		}
		
		
	}
	
	public void setYLabel(int xdata[],int ymax, int yrex) {
		int delta=0;
		int n=0;
		if (yrex!=0){
			delta=ymax/yrex;
			n=yrex;
		}
		else{
			if(ymax<10){
				delta=1;
				n=ymax;
			}
			else{
				delta=ymax/10;
				n=10;
			}
		}
		
		this.ylabel=new int[n+1];
		for(int i=0;i<=n;i++){
			ylabel[i]=i*delta;
		}
		
		if(ylabel[n]!=ymax){
			ylabel[n]=ymax;
		}
		
		
	}
	
	public void setData(String[] xdatast,int[] ydata){
		int nx = xlabel.length;
		int ny = ylabel.length;
		
		int xdata[]=new int[nx];
		
		for (int m=0;m<nx;m++){
			xdata[m]= Integer.parseInt(xdatast[m]);
		}
		
		this.data= new int[nx][ny];
		
		for(int k=0;k<xdata.length;k++){

			if(xdata[k]<Integer.parseInt(xlabel[0])){
				if(ydata[k]<ylabel[nx-1]){
					data[ny-1][0]=1;
				}
				else{
					
					for(int i=ny-2;i>=0;i--){
						
						if(ydata[k]<=ylabel[i] & ydata[k]>ylabel[i+1]){
							data[i][0]=1;
						}
						else{
							data[i][0]=0;
						}
					}
					
				}
			}
			
			
			for(int j=1;j<nx;j++){
				
				
				if(ydata[k]<ylabel[nx-1]){
					data[ny-1][j]=1;
				}
				else{
					
					for(int i=ny-2;i>=0;i--){
						
						if(ydata[k]<=ylabel[i] & ydata[k]>ylabel[i+1]){
							data[i][j]=1;
						}
						else{
							data[i][j]=0;
						}
					}
					
				}
				
				
					
				
				
				
				
				
			}
		}
	}
			
	
}
