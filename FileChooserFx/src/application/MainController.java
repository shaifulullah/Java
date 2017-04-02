package application;

import java.io.File;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainController {
	
	@FXML
	private Button singleFlBtn;
	
	@FXML
	private Button multiFlBtn;
	
	@FXML
	private ListView listView;
	
	public void singleBtnAction(ActionEvent event) {
		
		FileChooser fileChooser = new FileChooser();
//		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("PDF Files", "*.pdf"));
		File selectedFile =  fileChooser.showOpenDialog(null);
		if (selectedFile != null) {
			listView.getItems().add(selectedFile.getName());
		}else{
			System.out.println("File not found");
		}
	}
	
	public void multiBtnAction(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		
		List<File> selectedFiles =  fileChooser.showOpenMultipleDialog(null);
		if (selectedFiles != null) {
			for (int i = 0; i < selectedFiles.size(); i++) {
				listView.getItems().add(selectedFiles.get(i).getName());	
			}
		}else{
			System.out.println("File not found");
		}
	}

}
