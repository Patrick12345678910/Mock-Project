import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.stage.WindowEvent;
import javafx.scene.control.ListView;
import java.util.ArrayList;

public class AddressSystem 
{
    public static void main(String args[])
    {
        launchFX();
    }
    
    private static void launchFX(){
        new JFXPanel();
        Platform.runLater(() -> initialiseGUI());
    }
    
    private static void initialiseGUI()
    {
    	Stage stage = new Stage();
    	stage.setTitle("Address System");
    	stage.setResizable(true);
    	Pane rootPane=new Pane();
    	stage.setScene(new Scene(rootPane));
    	stage.setWidth(1024);
    	stage.setHeight(768);
    	stage.setOnCloseRequest((WindowEvent we) -> close());
    	stage.show();
    	
    	Button btn = new Button();
    	btn.setText("Add Group");
    	//btn.setPrefWidth(tabPane.getWidth()/6);
    	
    	TabPane tabPane = new TabPane();
    	Tab tab = new Tab();
    	tab.setText("Group 1");
    	//tab.(rootPane.getWidth()/6);
    	tabPane.getTabs().add(tab);
    	rootPane.getChildren().add(tabPane);
    	tab.getChildren().add(btn);
    }
    
    private static void close()
    {
    	System.out.println("Closing...");
    }
}