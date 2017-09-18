package sistemaView;

import java.io.IOException;

import Sistema.Main;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class ReservaViewController {
	private Main main;
	@FXML
	private BorderPane BorderDest;
	@FXML
	private void goReservaView() throws IOException{
		main.showReservaView(BorderDest);
	}
}
