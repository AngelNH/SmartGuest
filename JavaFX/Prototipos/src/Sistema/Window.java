package Sistema;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Window extends Application{
	private Stage primaryStage;
	private Scene scene;
	private BorderPane mainLayout;
	private VBox vboxscene;
	private HBox hbox;
	private VBox vboxmenu;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("SmartGuest - Ventana Principal");
		showWindow();

	}

	private void showWindow()throws Exception{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/empleados/SubMenuEmpleados.fxml"));
		hbox = (HBox)loader.load();
		mainLayout.setCenter(hbox);
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.hide();

	}

}
