package br.edu.ifsc.stages;

import br.edu.ifsc.entities.User;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainStage {

	public MainStage(Stage stage, String username) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(640, 480);
		Scene scene = new Scene(pane);		
		
		stage.setScene(scene);

		Label lblMain = new Label("Usuario " + username);
		lblMain.setLayoutX(10);
		lblMain.setLayoutY(10);
		pane.getChildren().add(lblMain);

		Button btnAdd = new Button("add");
		btnAdd.setLayoutX(400);
		btnAdd.setLayoutY(10);

//		btnAdd.setOnAction(e -> {
//			new AddUserStage(new Stage());
//		});

		pane.getChildren().add(btnAdd);

		TableView<User> usersTable = new TableView<User>();
		usersTable.setLayoutX(10);
		usersTable.setLayoutY(50);
		usersTable.setPrefSize(620, 420);
		usersTable.setEditable(true);

		TableColumn<User, String> colName = new TableColumn<>("nome");
		TableColumn<User, String> colPass = new TableColumn<>("senha");

		colName.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
		colName.setCellFactory(TextFieldTableCell.forTableColumn());
		colName.setMinWidth(200);

		colPass.setCellValueFactory(new PropertyValueFactory<User, String>("pass"));
		colPass.setCellFactory(TextFieldTableCell.forTableColumn());
		colPass.setMinWidth(200);
		
//		colPass.setOnEditCommit(e -> {
//			DB.users.changePass(e.getRowValue().getName(), e.getNewValue());
//		});

		usersTable.getColumns().add(colName);
		usersTable.getColumns().add(colPass);

//		usersTable.setItems(DB.users.getUsers());

		pane.getChildren().add(usersTable);

		stage.setTitle("Tabelaaa");
		stage.setResizable(false);

		stage.show();
	}
}
