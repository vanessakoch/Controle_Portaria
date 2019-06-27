package br.edu.ifsc.stages;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXSlider.IndicatorPosition;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import com.jfoenix.controls.JFXToggleNode;
import com.jfoenix.controls.JFXButton.ButtonType;

import br.edu.ifsc.util.Strings;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class CorrespondenciaStage {

	public CorrespondenciaStage(Stage stage) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(500, 500);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #BDBDBD;");
		Label lblListaCorrespondencias = new Label("LISTA DE CORRESPONDÊNCIAS");
		lblListaCorrespondencias.setStyle("-fx-background-color: #212121;-fx-padding:20");
		lblListaCorrespondencias.setTextFill(Color.WHITE);
		lblListaCorrespondencias.setPrefSize(500, 50);
		Label lblNome = new Label("Em nome de: ");
		Label lblAp = new Label("Apartamento: ");
		Label lblBloco = new Label("Bloco: ");
		Label lblObs = new Label("Observação: ");
		JFXTextField txtNome = new JFXTextField();
		JFXTextField txtAp = new JFXTextField();
		JFXTextField txtBloco = new JFXTextField();
		JFXTextField txtObs = new JFXTextField();
		JFXButton btnSair = new JFXButton("SAIR");
		Label lblEntregue = new Label("Entregue: ");

		JFXComboBox<Label> comboCorrespondencia = new JFXComboBox<Label>();

		comboCorrespondencia.getItems().add(new Label("LUZ"));
		comboCorrespondencia.getItems().add(new Label("AGUA"));
		comboCorrespondencia.getItems().add(new Label("INTERNET"));
		comboCorrespondencia.getItems().add(new Label("TELEFONE"));
		comboCorrespondencia.getItems().add(new Label("ALUGUEL"));
		comboCorrespondencia.getItems().add(new Label("CONDOMINIO"));
		comboCorrespondencia.getItems().add(new Label("CARTA"));
		comboCorrespondencia.setLayoutX(50);
		comboCorrespondencia.setLayoutY(100);
		comboCorrespondencia.setPromptText("Selecione o tipo da correspondência");
		comboCorrespondencia.setUnFocusColor(Color.BLACK);
		lblNome.setLayoutX(50);
		lblNome.setLayoutY(180);
		lblNome.setTextFill(Color.BLACK);
		txtNome.setLayoutX(150);
		txtNome.setLayoutY(170);
		txtNome.setPrefWidth(300);
		lblEntregue.setTextFill(Color.BLACK);
		lblAp.setLayoutX(50);
		lblAp.setLayoutY(250);
		lblAp.setTextFill(Color.BLACK);
		txtAp.setLayoutX(150);
		txtAp.setLayoutY(240);
		txtAp.setPrefWidth(50);
		lblObs.setLayoutX(220);
		lblObs.setLayoutY(330);
		lblObs.setTextFill(Color.BLACK);
		txtObs.setLayoutX(310);
		txtObs.setLayoutY(320);
		lblBloco.setLayoutX(340);
		lblBloco.setLayoutY(250);
		lblBloco.setTextFill(Color.BLACK);
		txtBloco.setLayoutX(400);
		txtBloco.setLayoutY(240);
		txtBloco.setPrefWidth(50);
		btnSair.setButtonType(ButtonType.RAISED);
		btnSair.setStyle("-fx-background-color: WHITE; -fx-cursor: hand");
		btnSair.setTextFill(Color.BLACK);
		btnSair.setPrefSize(100, 40);
		btnSair.setLayoutX(150);
		btnSair.setLayoutY(420);

		final ToggleGroup group = new ToggleGroup();

		JFXRadioButton radioSim = new JFXRadioButton("Sim");
		radioSim.setTextFill(Color.BLACK);
		radioSim.setPadding(new Insets(10));
		radioSim.setToggleGroup(group);
		radioSim.setLayoutX(120);
		radioSim.setLayoutY(300);
		radioSim.setSelectedColor(Color.RED);
		JFXRadioButton radioNao = new JFXRadioButton("Não");
		radioNao.setTextFill(Color.BLACK);
		radioNao.setPadding(new Insets(10));
		radioNao.setToggleGroup(group);
		radioNao.setLayoutY(340);
		radioNao.setLayoutX(120);
		radioNao.setSelected(true);
		radioNao.setSelectedColor(Color.BLUE);
		lblEntregue.setLayoutX(50);
		lblEntregue.setLayoutY(330);
		
		JFXButton btnSalvar = new JFXButton("SALVAR");
		btnSalvar.setButtonType(ButtonType.RAISED);
		btnSalvar.setStyle("-fx-background-color: #C2185B; -fx-cursor: hand");
		btnSalvar.setTextFill(Color.WHITE);
		btnSalvar.setPrefSize(100, 40);
		btnSalvar.setLayoutX(270);
		btnSalvar.setLayoutY(420);


		pane.getChildren().addAll(btnSalvar,lblObs, txtObs, lblEntregue, radioNao, radioSim, txtBloco, lblBloco, lblAp, txtAp,
				txtNome, lblNome, comboCorrespondencia, btnSair, lblListaCorrespondencias);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();
		
		btnSalvar.setOnMouseClicked(e -> showConfirmation());
		btnSair.setOnMouseClicked(e -> stage.close());
		
	}
	private void showConfirmation() {
		Alert dialogoAcerto = new Alert(Alert.AlertType.INFORMATION);
		dialogoAcerto.initStyle(StageStyle.TRANSPARENT);
		dialogoAcerto.setHeaderText("\t\t\tSALVO COM SUCESSO");
		dialogoAcerto.showAndWait();
	}
}