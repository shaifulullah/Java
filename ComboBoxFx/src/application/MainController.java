package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable {

	@FXML
	private Label myLable;
	@FXML
	public ComboBox<String> comboBox;
	@FXML
	private ListView<String> listView;

	ObservableList<String> list = FXCollections.observableArrayList("Mark", "Susan", "Mike", "Tuntun");

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		comboBox.setItems(list);
		listView.setItems(list);
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}

	public void comboChanged(ActionEvent event) {
		
		myLable.setText(comboBox.getValue());
	}
	
	public void buttonAction(ActionEvent event) {
		//comboBox.getItems().addAll("xxxx", "ddddd", "fffff");
	
		ObservableList<String> names;
		names = listView.getSelectionModel().getSelectedItems();
		for(String name : names){
			System.out.println(name);
		}
	}	
}
 