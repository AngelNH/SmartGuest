package sistemaView;

import java.io.IOException;

import Sistema.Main;
import javafx.fxml.FXML;

//ESTE SI ESTA BIEN
public class MainViewController {

	private Main main;

	@FXML
	private void goUserView() throws IOException{
		main.showUserViewScene();
	}
}
