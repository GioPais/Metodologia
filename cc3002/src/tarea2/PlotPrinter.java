package tarea2;

public class PlotPrinter {
	
	private int ymax;
	private int xmax;
	private String[] xlabel;
	private int[] ylabel;
	private int[][] data;
	
	
	public PlotPrinter(){
		
	}
	
	public void print(){
			
		System.out.println("-----------------------------------------");
				
		for(int i=0;i<ymax;i++){
			//-------------------------------------------------
			System.out.print(ylabel[ymax-1-i]);
			if((ylabel[ymax-1-i])>99){
				System.out.print("|");
			}
			else{
				if((ylabel[ymax-1-i])>9){
					System.out.print(" |");
				}
				else{
					System.out.print("  |");
				}
			}
			//-------------------------------------------------
			
			for(int j=0;j<xmax;j++){
				System.out.print(" ");
				if(data[i][j]==1){
					System.out.print("XX");
				}
				else{
					System.out.print("  ");
				}
				System.out.print(" ");
			}
			System.out.println("");
					
		}
				
		//////////////////////////////////////////////////////////////
		System.out.print("   =");
		for(int j=0;j<xmax;j++){
			System.out.print("====");
		}
		System.out.println("");
		//////////////////////////////////////////////////////////////
		System.out.print("    ");
		for(int j=0;j<xmax;j++){
			System.out.print("  ");
			System.out.print(xlabel[j]);
			System.out.print(" ");
		}
		System.out.println("");	
	}

	

	public void setData(String[] xl, int[] yl, int xm, int ym, int[][] d) {
		
		this.ymax=ym;
		this.xmax=xm;
		this.xlabel=xl;
		this.ylabel=yl;
		this.data=d;
	}
}

