package tarea2;

public class BarPlot implements IPlot {

	private String[] xlabel;
	private int[] ylabel;
	private int[][] data;
	private PlotPrinter printer;
	
	public BarPlot(){
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
		
		this.xlabel=xdata;
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
	
	public void setData(String[] xdata,int[] ydata){
		int nx = xlabel.length;
		int ny = ylabel.length;
		
		this.data= new int[ny][nx];
		
		for(int k=0;k<xdata.length;k++){
			
			for(int j=0;j<nx;j++){
				
				if(xdata[k]==xlabel[j]){
					
					if(ydata[k]<ylabel[0]){
						data[ny-1][0]=1;
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
				else{
					for(int i=0;i<ny;i++){
						data[i][j]=0;
					}
				}
				
			}
		}
	}

}
