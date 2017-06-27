package tarea3;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class PlotGUI extends Application{

	private String plotType;
	private CDataReader cdr = new CDataReader();
	private TDataReader tdr = new TDataReader();
	
    @Override public void start(Stage stage) {
        stage.setTitle("JPlot");

        BorderPane pane = new BorderPane();

        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER_LEFT);

        FileChooser dataChooser = new FileChooser();
        Button openFileButton = new Button("Choose Data File");

        openFileButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				File file = dataChooser.showOpenDialog(stage);
				/**do things with file**/
				
				try{
					if(file == null){throw new IOException("No file found");}
					if (plotType.equals("BarPlot")) {
						//System.out.println("archivo tipo BarPlot");
						cdr.loadFile(file);
						cdr.extractDataInfo();
					}
					else {
						//System.out.println("archivo tipo NoBarPlot");
						tdr.loadFile(file);
						tdr.extractDataInfo();
					}
				}
				catch (IOException e) {e.printStackTrace();}
				
				
				
			}
		});

        Button drawButton = new Button("Draw");

        drawButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				pane.setCenter(buildPlot());
			}
		});

        ObservableList<String> options =
        	    FXCollections.observableArrayList(
        	        "BarPlot",
        	        "LinePlot",
        	        "ScatterPlot"
        	    );
        ComboBox<String> comboBox = new ComboBox<>(options);
        comboBox.setValue("Plot Type:");
        plotType = "BarPlot";
        comboBox.setOnAction(e -> plotType = comboBox.getValue());

        hbox.getChildren().addAll(new Label("Plot Type:"), comboBox, openFileButton, drawButton);
        pane.setTop(hbox);

        Scene scene  = new Scene(pane,800,600);

        stage.setScene(scene);
        stage.show();
    }

    protected Node buildPlot() {
    	
    	IPlot plot = PlotFactory.getPlot(plotType);
    	
    	if(plotType.equals("BarPlot")){
    		List<String> x = Arrays.asList(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"});
            List<Number> y = Arrays.asList(new Number[]{23, 14, 15, 24, 34, 36, 22, 45, 42, 17, 29, 25});
            plot.setTitle(cdr.getTitle());
            plot.setXLabel(cdr.getXLabel());
            plot.setYLabel(cdr.getYLabel());          
            plot.addSeries(x, y, "Portfolio #1");
    		
    	}
    	else{
    		List<Number> x = Arrays.asList(new Number[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
            List<Number> y = Arrays.asList(new Number[]{23, 14, 15, 24, 34, 36, 22, 45, 42, 17, 29, 25});
            plot.setTitle(tdr.getTitle());
            plot.setXLabel(tdr.getXLabel());
            plot.setYLabel(tdr.getYLabel());           
            plot.addSeries(x, y, "Portfolio #1");
    		
    	}
    	
        return plot.getPlot();
	}

	public static void main(String[] args) {
        launch(args);
    }
}
