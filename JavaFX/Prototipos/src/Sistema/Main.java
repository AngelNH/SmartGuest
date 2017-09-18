package Sistema;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	private  Stage primaryStage;
	private static BorderPane mainLayout;
	//PARTE DEL INTENTO
	private VBox Menu;
	private VBox subMenu;
	private static BorderPane secondaryLayout;

	//BIEN
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("SmartGuest - Ventana Principal");
		showMainView();
	}

	//ESTOS DOS MÉTODOS ESTAN BIEN
	private void showMainView() throws IOException {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/sistemaView/MainView.fxml"));
			mainLayout = loader.load();
			Scene scene = new Scene(mainLayout);
			primaryStage.setScene(scene);
			primaryStage.show();

	}

	public  static void showUserViewScene() throws IOException {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/sistemaView/UserView.fxml"));
			BorderPane userview =(BorderPane) loader.load();
			mainLayout.setCenter(userview);
	}
	 public static void showReservaView(BorderPane bp) throws IOException{
		 	FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/reserva/BuscarReserva.fxml"));
			BorderPane userview =(BorderPane) loader.load();
			bp.setCenter(userview);
			//mainLayout.setBottom(bp);
	 }
	public static void main(String[] args) {
		launch(args);
	}
}
