package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label myMessage;
	
	public void generateRandom(ActionEvent event) {
		Random random = new Random();
		int myRand = random.nextInt(50);
		myMessage.setText(Integer.toString(myRand));
//		System.out.println(Integer.toString(myRand));
	}

}
