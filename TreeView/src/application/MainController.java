package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable {

	@FXML
	TreeView<String> treeView;
	
	Image icon = new Image(getClass().getResourceAsStream("/img/folder.png"));

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		treeView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
//		root.setExpanded(true);
		TreeItem<String> nodeA = new TreeItem<>("Node A", new ImageView(icon));
		TreeItem<String> nodeB = new TreeItem<>("Node B", new ImageView(icon));
		TreeItem<String> nodeC = new TreeItem<>("Node C", new ImageView(icon));
		TreeItem<String> nodeD = new TreeItem<>("Node D", new ImageView(icon));
		root.getChildren().addAll(nodeA, nodeB, nodeC, nodeD);

		TreeItem<String> nodeA1 = new TreeItem<>("Node A1", new ImageView(icon));
		TreeItem<String> nodeA2 = new TreeItem<>("Node A2", new ImageView(icon));
		TreeItem<String> nodeA3 = new TreeItem<>("Node A3", new ImageView(icon));
		TreeItem<String> nodeA4 = new TreeItem<>("Node A4", new ImageView(icon));
		nodeA.getChildren().addAll(nodeA1, nodeA2, nodeA3, nodeA4);

		TreeItem<String> nodeB1 = new TreeItem<>("Node B1", new ImageView(icon));
		TreeItem<String> nodeB2 = new TreeItem<>("Node B2", new ImageView(icon));
		TreeItem<String> nodeB3 = new TreeItem<>("Node B3", new ImageView(icon));
		nodeB.getChildren().addAll(nodeB1, nodeB2, nodeB3);

		TreeItem<String> nodeC1 = new TreeItem<>("Node C1", new ImageView(icon));
		TreeItem<String> nodeC2 = new TreeItem<>("Node C2", new ImageView(icon));
		TreeItem<String> nodeC3 = new TreeItem<>("Node C3", new ImageView(icon));
		nodeC.getChildren().addAll(nodeC1, nodeC2, nodeC3);

		TreeItem<String> nodeD1 = new TreeItem<>("Node D1", new ImageView(icon));
		TreeItem<String> nodeD2 = new TreeItem<>("Node D2", new ImageView(icon));
		nodeD.getChildren().addAll(nodeD1, nodeD2);

		treeView.setRoot(root);

	}
	
	public void buttonAction(ActionEvent event) {
		
		ObservableList<TreeItem<String>> names;
		names = treeView.getSelectionModel().getSelectedItems();
		for(TreeItem<String> name : names){
			System.out.println(name);
		}

	}
	
//	public void mouseClick(MouseEvent mouseEvent) {
//		if (mouseEvent.getClickCount() ==2 ){
//		TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
//		System.out.println(item.getValue());
//		}
//	}

}
