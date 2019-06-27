package br.edu.ifsc.stages;

import java.time.LocalDate;
import java.util.Date;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton.ButtonType;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;

import br.edu.ifsc.entities.Morador;
import br.edu.ifsc.exceptions.CadastroException;
import br.edu.ifsc.util.DB;
import br.edu.ifsc.util.Strings;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CadMoradorStage {

	public CadMoradorStage(Stage stage) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(500, 550);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #BDBDBD;");

		Label lblData = new Label("Data de Entrada");
		Label lblNome = new Label("Nome Completo");
		Label lblCpf = new Label("CPF");
		Label lblTelefone = new Label("Telefone");
		Label lblApartamento = new Label("Apartamento");
		Label lblBloco = new Label("Bloco");
		Label lblVagaGaragem = new Label("Vaga de Garagem");
		Label lblMoradores = new Label("Nº Moradores");
		Label lblMenorIdade = new Label("Morador menor de idade?");
		Label lblNasc = new Label("Data Nascimento");
		Label lblCadastro = new Label("TIPO DE CADASTRO");

		lblData.setTextFill(Color.BLACK);
		lblNome.setTextFill(Color.BLACK);
		lblNasc.setTextFill(Color.BLACK);
		lblCpf.setTextFill(Color.BLACK);
		lblTelefone.setTextFill(Color.BLACK);
		lblApartamento.setTextFill(Color.BLACK);
		lblVagaGaragem.setTextFill(Color.BLACK);
		lblBloco.setTextFill(Color.BLACK);
		lblMoradores.setTextFill(Color.BLACK);
		lblMenorIdade.setTextFill(Color.BLACK);
		lblCadastro.setTextFill(Color.BLACK);
		
		JFXButton btnSalvar = new JFXButton("SALVAR");
		JFXButton btnCancelar = new JFXButton("CANCELAR");

		JFXTextField txtNome = new JFXTextField();
		JFXTextField txtCpf = new JFXTextField();
		JFXTextField txtTel = new JFXTextField();
		JFXTextField txtApartamento = new JFXTextField();
		JFXTextField txtVagaGaragem = new JFXTextField();
		JFXTextField txtBloco = new JFXTextField();
		JFXTextField txtMoradores = new JFXTextField();

		Label lblCadastroMorador = new Label("CADASTRO DE MORADOR");
		JFXRippler rippCVisita = new JFXRippler(lblCadastroMorador);
		JFXCheckBox checkBoxVisita = new JFXCheckBox("VISITANTE");
		JFXCheckBox checkBoxMorador = new JFXCheckBox("MORADOR");
		JFXCheckBox checkBoxVeiculo = new JFXCheckBox("VEÍCULO");
		JFXDatePicker dateEntrada = new JFXDatePicker();
		JFXDatePicker dateNasc = new JFXDatePicker();
		JFXToggleButton simNao = new JFXToggleButton();

		checkBoxVeiculo.getStyleClass().add("custom-jfx-check-box");
		checkBoxVisita.getStyleClass().add("custom-jfx-check-box");
		checkBoxMorador.getStyleClass().add("custom-jfx-check-box");
		checkBoxMorador.setFont(Font.font(10));
		checkBoxMorador.setSelected(true);
		checkBoxVisita.setFont(Font.font(10));
		checkBoxVeiculo.setFont(Font.font(10));
		
		checkBoxVisita.setOnMousePressed(e -> {
			try {
				new CadVisitaStage(new Stage());
				stage.close();
			} catch (Exception finaliza1) {
				finaliza1.printStackTrace();
			}
		});
		
		checkBoxVeiculo.setOnMousePressed(e -> {
			try {
				new CadVeiculoStage(new Stage());
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
		lblCadastroMorador.setStyle("-fx-background-color: #212121;-fx-padding:20");
		lblCadastroMorador.setTextFill(Color.WHITE);
		lblCadastroMorador.setPrefSize(700, 50);
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
		lblData.setLayoutX(50);
		lblData.setLayoutY(190);
		lblNome.setLayoutX(50);
		lblNome.setLayoutY(230);
		lblCpf.setLayoutX(370);
		lblCpf.setLayoutY(230);
		lblBloco.setLayoutX(220);
		lblBloco.setLayoutY(360);
		lblMoradores.setLayoutX(50);
		lblMoradores.setLayoutY(290);
		lblNasc.setLayoutX(525);
		lblNasc.setLayoutY(190);
		lblTelefone.setLayoutX(370);
		lblTelefone.setLayoutY(290);
		lblApartamento.setLayoutX(50);
		lblApartamento.setLayoutY(360);
		lblVagaGaragem.setLayoutX(370);
		lblVagaGaragem.setLayoutY(360);
		lblMenorIdade.setLayoutX(160);
		lblMenorIdade.setLayoutY(290);
		simNao.setLayoutX(200);
		simNao.setLayoutY(300);
		checkBoxVisita.setLayoutX(210);
		checkBoxVisita.setLayoutY(110);
		checkBoxMorador.setLayoutX(310);
		checkBoxMorador.setLayoutY(110);
		checkBoxVeiculo.setLayoutX(410);
		checkBoxVeiculo.setLayoutY(110);

		txtNome.setLayoutX(50);
		txtNome.setLayoutY(245);
		txtCpf.setLayoutX(370);
		txtCpf.setLayoutY(245);
		txtTel.setLayoutX(370);
		txtTel.setLayoutY(310);
		txtApartamento.setLayoutX(50);
		txtApartamento.setLayoutY(380);
		txtVagaGaragem.setLayoutX(370);
		txtVagaGaragem.setLayoutY(380);
		txtMoradores.setLayoutX(50);
		txtMoradores.setLayoutY(310);
		txtBloco.setLayoutX(220);
		txtBloco.setLayoutY(380);
		txtMoradores.setPrefWidth(80);
		txtApartamento.setPrefWidth(80);
		txtNome.setPrefWidth(250);
		txtCpf.setPrefWidth(250);
		txtTel.setPrefWidth(250);
		txtBloco.setPrefWidth(35);
		txtVagaGaragem.setPrefWidth(250);

		dateEntrada.setLayoutX(150);
		dateEntrada.setLayoutY(185);
		dateEntrada.setPrefWidth(150);
		dateNasc.setPrefWidth(150);
		dateNasc.setLayoutX(370);
		dateNasc.setLayoutY(185);
	
		dateEntrada.setDefaultColor(Color.valueOf("#311B92"));
		dateNasc.setDefaultColor(Color.valueOf("#311B92"));
	
		btnSalvar.setOnMouseClicked(e ->{
			try {
				DB.moradores.addMorador(txtNome.getText(), txtCpf.getText(), dateNasc.getPromptText().toString(), txtTel.getText(), 
						Integer.parseInt(txtApartamento.getText()), txtBloco.getText(), Integer.parseInt(txtMoradores.getText()), 
						txtVagaGaragem.getText(), dateEntrada.getPromptText(),
						Boolean.parseBoolean(simNao.getText()));
				stage.close();
				showConfirmation();
			}catch(Exception a){
				try {
					showError();
					throw new CadastroException();
				} catch (CadastroException e1) {
					e1.printStackTrace();
				}
			}
			
		});
		
		pane.getChildren().addAll(lblCadastro,lblNasc, dateNasc, simNao, lblMenorIdade, lblMoradores, lblBloco, txtMoradores,
				txtBloco, btnSalvar, btnCancelar, dateEntrada, txtNome, txtCpf, txtTel, txtApartamento, txtVagaGaragem,
				lblData, lblNome, lblCpf, lblTelefone, rippCVisita, lblApartamento, lblVagaGaragem, checkBoxVisita,
				checkBoxMorador, checkBoxVeiculo);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();
		
		btnCancelar.setOnAction(e -> stage.close());;
	}
	private void showConfirmation() {
		Alert dialogoAcerto = new Alert(Alert.AlertType.INFORMATION);
		dialogoAcerto.initStyle(StageStyle.TRANSPARENT);
		dialogoAcerto.setHeaderText("\t\t\tSALVO COM SUCESSO");
		dialogoAcerto.showAndWait();
	}
	
	private void showError() {
		Alert dialogoAcerto = new Alert(Alert.AlertType.ERROR);
		dialogoAcerto.initStyle(StageStyle.TRANSPARENT);
		dialogoAcerto.setHeaderText("\t\t\tDADOS INCORRETOS");
		dialogoAcerto.showAndWait();
	}

}