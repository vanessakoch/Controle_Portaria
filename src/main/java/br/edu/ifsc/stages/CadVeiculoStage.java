package br.edu.ifsc.stages;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton.ButtonType;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXTextField;

import br.edu.ifsc.util.Strings;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CadVeiculoStage {

	public CadVeiculoStage(Stage stage) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(500, 550);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #BDBDBD;");

		Label lblMarca = new Label("Marca");
		Label lblModelo = new Label("Modelo");
		Label lblPlaca = new Label("Placa");
		Label lblRenavam = new Label("Renavam");
		Label lblAno = new Label("Ano Fabricação");
		Label lblCadastro = new Label("TIPO DE CADASTRO");

		lblMarca.setTextFill(Color.BLACK);
		lblModelo.setTextFill(Color.BLACK);
		lblPlaca.setTextFill(Color.BLACK);
		lblRenavam.setTextFill(Color.BLACK);
		lblAno.setTextFill(Color.BLACK);
		lblCadastro.setTextFill(Color.BLACK);

		JFXButton btnSalvar = new JFXButton("SALVAR");
		JFXButton btnCancelar = new JFXButton("CANCELAR");
		JFXTextField txtMarca = new JFXTextField();
		JFXTextField txtModelo = new JFXTextField();
		JFXTextField txtRenavam = new JFXTextField();
		JFXTextField txtAno = new JFXTextField();
		JFXTextField txtPlaca = new JFXTextField();

		Label lblCadastroVeiculo = new Label("CADASTRO DE VEÍCULO");
		JFXRippler rippCVisita = new JFXRippler(lblCadastroVeiculo);
		JFXCheckBox checkBoxVisita = new JFXCheckBox("VISITANTE");
		JFXCheckBox checkBoxMorador = new JFXCheckBox("MORADOR");
		JFXCheckBox checkBoxVeiculo = new JFXCheckBox("VEÍCULO");

		checkBoxVeiculo.getStyleClass().add("custom-jfx-check-box");
		checkBoxVisita.getStyleClass().add("custom-jfx-check-box");
		checkBoxMorador.getStyleClass().add("custom-jfx-check-box");
		checkBoxMorador.setFont(Font.font(10));
		checkBoxVisita.setFont(Font.font(10));
		checkBoxVeiculo.setFont(Font.font(10));
		checkBoxVeiculo.setSelected(true);
		checkBoxMorador.setOnMousePressed(e -> {
			try {
				new CadMoradorStage(new Stage());
				stage.close();
			} catch (Exception finaliza1) {
				finaliza1.printStackTrace();
			}
		});
		checkBoxVisita.setOnMousePressed(e -> {
			try {
				new CadVisitaStage(new Stage());
				stage.close();
			} catch (Exception finaliza1) {
				finaliza1.printStackTrace();
			}
		});
		btnSalvar.setButtonType(ButtonType.RAISED);
		btnSalvar.setStyle("-fx-background-color: #C2185B; -fx-cursor: hand");
		btnSalvar.setTextFill(Color.WHITE);
		btnSalvar.setPrefSize(100, 40);

		btnCancelar.setButtonType(ButtonType.RAISED);
		btnCancelar.setStyle("-fx-background-color: WHITE; -fx-cursor: hand");
		btnCancelar.setTextFill(Color.BLACK);
		btnCancelar.setPrefSize(100, 40);

		btnSalvar.setLayoutX(370);
		btnSalvar.setLayoutY(460);
		btnCancelar.setLayoutX(220);
		btnCancelar.setLayoutY(460);

		lblCadastroVeiculo.setStyle("-fx-background-color: #212121;-fx-padding:20");
		lblCadastroVeiculo.setTextFill(Color.WHITE);
		lblCadastroVeiculo.setPrefSize(700, 50);
		checkBoxVisita.setTextFill(Color.BLACK);
		checkBoxMorador.setTextFill(Color.BLACK);
		checkBoxVeiculo.setTextFill(Color.BLACK);
		checkBoxVisita.setUnCheckedColor(Color.BLACK);
		checkBoxMorador.setUnCheckedColor(Color.BLACK);
		checkBoxVeiculo.setUnCheckedColor(Color.BLACK);
		checkBoxVisita.setCheckedColor(Color.RED);
		checkBoxMorador.setCheckedColor(Color.BLUE);
		checkBoxVeiculo.setCheckedColor(Color.BLACK);

		lblCadastro.setLayoutX(290);
		lblCadastro.setLayoutY(70);
		lblMarca.setLayoutX(50);
		lblMarca.setLayoutY(220);
		lblModelo.setLayoutX(370);
		lblModelo.setLayoutY(220);
		lblPlaca.setLayoutX(50);
		lblPlaca.setLayoutY(280);
		lblRenavam.setLayoutX(370);
		lblRenavam.setLayoutY(280);
		lblAno.setLayoutX(50);
		lblAno.setLayoutY(340);

		checkBoxVisita.setLayoutX(210);
		checkBoxVisita.setLayoutY(110);
		checkBoxMorador.setLayoutX(310);
		checkBoxMorador.setLayoutY(110);
		checkBoxVeiculo.setLayoutX(410);
		checkBoxVeiculo.setLayoutY(110);

		txtMarca.setLayoutX(50);
		txtMarca.setLayoutY(240);
		txtModelo.setLayoutX(370);
		txtModelo.setLayoutY(240);
		txtRenavam.setLayoutX(370);
		txtRenavam.setLayoutY(300);
		txtAno.setLayoutX(50);
		txtAno.setLayoutY(360);
		txtPlaca.setLayoutX(50);
		txtPlaca.setLayoutY(300);

		txtMarca.setPrefWidth(250);
		txtModelo.setPrefWidth(250);
		txtRenavam.setPrefWidth(250);
		txtAno.setPrefWidth(90);
		txtPlaca.setPrefWidth(250);

		pane.getChildren().addAll(lblCadastro, btnSalvar, btnCancelar, txtMarca, txtModelo, txtRenavam, txtAno,
				txtPlaca, lblMarca, lblModelo, lblPlaca, lblRenavam, rippCVisita, lblAno, checkBoxVisita,
				checkBoxMorador, checkBoxVeiculo);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();

		btnCancelar.setOnAction(e -> stage.close());
		;

	}

}
