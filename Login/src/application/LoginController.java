package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	private Label LoginStatus;

	@FXML
	private TextField UserName;

	@FXML
	private PasswordField Password;

	public void login(ActionEvent event) throws Exception {
		if (UserName.getText().equals("user") && Password.getText().equals("pass")) {
			LoginStatus.setText("Successfully Loggedin");
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();
		} else {
			LoginStatus.setText("login failed");
		}
	}

}
