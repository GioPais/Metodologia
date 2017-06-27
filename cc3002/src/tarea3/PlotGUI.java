package tarea3;

import java.io.File;
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

        hbox.getChildren().addAll(new Label("Plot Type:"), comboBox, openFileButton, drawButton);
        pane.setTop(hbox);

        Scene scene  = new Scene(pane,800,600);

        stage.setScene(scene);
        stage.show();
    }

    protected Node buildPlot() {
    	ScatterPlot<Number, Number> scatterplot = new ScatterPlot<>(new NumberAxis(), new NumberAxis());

        List<Number> x = Arrays.asList(new Number[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        List<Number> y = Arrays.asList(new Number[]{23, 14, 15, 24, 34, 36, 22, 45, 42, 17, 29, 25});

        scatterplot.setTitle("Scatter Plot Sample");
        scatterplot.setXLabel("Number of month");
        scatterplot.setYLabel("Millions of US$");
        scatterplot.addSeries(x, y, "Portfolio #1");
		return scatterplot.getPlot();
	}

	public static void main(String[] args) {
        launch(args);
    }
}
