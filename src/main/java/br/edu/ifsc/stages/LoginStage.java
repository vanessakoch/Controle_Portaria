package br.edu.ifsc.stages;

import java.io.FileInputStream;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton.ButtonType;
import com.jfoenix.controls.JFXComboBox;

import br.edu.ifsc.db.UserJson;
import br.edu.ifsc.db.UserXml;
import br.edu.ifsc.entities.User;
import br.edu.ifsc.exceptions.DBException;
import br.edu.ifsc.exceptions.LoginException;
import br.edu.ifsc.util.DB;
import br.edu.ifsc.util.Strings;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginStage {
	private JFXButton btnLogin;
	private TextField txtUser;
	private PasswordField txtPass;

	public LoginStage(Stage stage) throws Exception {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(400, 300);
		Scene scene = new Scene(pane);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #616161;");

		stage.setScene(scene);
		FileInputStream input = new FileInputStream(
				"C:\\Users\\vah_n\\eclipse-workspace\\ControleDePortaria\\src\\main\\java\\br\\edu\\ifsc\\util\\6.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);

		imageView.setFitHeight(70);
		imageView.setFitWidth(70);
		imageView.setLayoutX(165);
		imageView.setLayoutY(30);

		txtUser = new TextField();
		txtPass = new PasswordField();
		btnLogin = new JFXButton(Strings.btnLogin);

		btnLogin.setLayoutX(150);
		btnLogin.setLayoutY(235);
		btnLogin.setButtonType(ButtonType.RAISED);
		btnLogin.setStyle("-fx-background-color: #C2185B; -fx-cursor: hand");
		btnLogin.setTextFill(Color.WHITE);
		btnLogin.setPrefSize(100, 40);

		txtPass.setLayoutX(125);
		txtPass.setLayoutY(150);
		txtUser.setLayoutX(125);
		txtUser.setLayoutY(110);
		txtUser.setMaxWidth(150);
		txtUser.setMinWidth(150);
		txtUser.setPrefWidth(150);
		txtUser.setPromptText(Strings.username);
		txtPass.setPromptText(Strings.password);

		JFXComboBox<String> dbSource = new JFXComboBox<String>();
		dbSource.getItems().add("JSON");
		dbSource.getItems().add("XML");
		dbSource.setLayoutX(112);
		dbSource.setLayoutY(195);
		dbSource.setPromptText("\tSelect DB Version");
		dbSource.setStyle("-fx-background-color: #E0E0E0;");
		dbSource.setOnAction(e -> changeDB(dbSource.getSelectionModel().getSelectedItem()));
		
		btnLogin.setOnMouseClicked(e -> {
			try {
				login(txtUser.getText(), txtPass.getText(), stage);
			} catch (LoginException ex) {
				System.out.println(ex.getMessage());
			} catch (DBException ex2) {

			}
		});

		pane.getChildren().addAll(btnLogin, txtUser, txtPass, dbSource, imageView);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();
	}

	private void changeDB(String selectedItem) {
		if (selectedItem.equals("JSON"))
			DB.users = new UserJson();
		else if (selectedItem.equals("XML"))
			DB.users = new UserXml();
	}

	private void changeDB() {
		if (DB.users instanceof UserJson)
			DB.users = new UserXml();
		else if (DB.users instanceof UserXml)
			DB.users = new UserJson();
	}

	private void login(String username, String pass, Stage stage) throws LoginException, DBException {

		try {
			withCurrentDB(username, pass, stage);
		} catch (DBException exception) {
			changeDB();
			try {
				withCurrentDB(username, pass, stage);
			} catch (DBException newException) {
				throw new LoginException();
			}
		}
	}

	private void withCurrentDB(String username, String pass, Stage stage) throws DBException {
		User user = DB.users.getUser(username);
		try {
			if (!user.getPass().equals(pass)) {
				showLoginError();
				return;
			}
		} catch (NullPointerException ex) {
			throw new DBException();
		}
		try {
			new MenuStage(new Stage(), txtUser.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
		stage.close();
	}

	private void showLoginError() {
		Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
        dialogoErro.setTitle("Erro de autenticação");
        dialogoErro.setHeaderText("\tERRO!!");
        dialogoErro.setContentText("\tCONTA NÃO ENCONTRADA");
        dialogoErro.showAndWait();
	}
}
