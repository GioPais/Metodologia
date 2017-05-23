package tarea2;

public class Plot {
	
	private String titulo;
	private int[][] M;
	private int xlabel[];
	private int xm;
	private int ym;
	
	
	
	public Plot(String titulo,int ym, int xm){
		this.titulo=titulo;
		this.xm=xm;
		this.ym=ym;
		int arreglo[] = new int[xm+1];
		for(int j=0;j<=xm;j++){
			arreglo[j]=j;
		}
		this.xlabel=arreglo;
		
	}
	
	public void graph(){
		
		int M[][] = new int[ym+1][xm+1];
		
		for(int i=0;i<=ym;i++){
			for(int j=0;j<=xm;j++){
				M[i][j]=0;
			}
		}
		
		//Dato1 = 3,4
		//Dato2 = 2,1
		//Dato3 = 1,0
		
		//M[3-1][4+1]=1;
		//M[2-1][1+1]=1;
		//M[1-1][0+1]=1;
		
		M[6][3]=1;
		M[9][2]=1;
		M[10][1]=1;
				
		
		System.out.println("-----------------------------------------");
		System.out.println(this.titulo);
		System.out.println("-----------------------------------------");
		
		for(int i=0;i<=ym;i++){
			//-------------------------------------------------
			System.out.print(ym-i);
			if((ym-i)>99){
				System.out.print("|");
			}
			else{
				if((ym-i)>9){
					System.out.print(" |");
				}
				else{
					System.out.print("  |");
				}
			}
			//-------------------------------------------------
			
			for(int j=0;j<=xm;j++){
				System.out.print(" ");
				if(M[i][j]==1){
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
		for(int j=0;j<=xm;j++){
			System.out.print("====");
		}
		System.out.println("");
		//////////////////////////////////////////////////////////////
		System.out.print("    ");
		for(int j=0;j<=xm;j++){
			if((xlabel[j])>99){
				System.out.print("");
			}
			else{
				if((xlabel[j])>9){
					System.out.print(" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print(xlabel[j]);
			System.out.print(" ");
			
		}
		System.out.println("");
		
		
	}
}
