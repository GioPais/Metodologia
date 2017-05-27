package tarea2;

public interface IPlot {
	
	public void draw();

	public void setXLabel(String[] xlabel, int i, int j);

	public void setYLabel(int[] ylabel, int i, int j);

	public void setData(String[] xdata, int[] ydata);


}
