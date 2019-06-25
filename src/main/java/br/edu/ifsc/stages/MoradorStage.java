package br.edu.ifsc.stages;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton.ButtonType;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import br.edu.ifsc.util.Strings;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MoradorStage {

	public MoradorStage(Stage stage) {

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
		JFXCheckBox checkBoxFuncionario = new JFXCheckBox("FUNCIONÁRIO");
		DatePicker dateEntrada = new DatePicker();
		DatePicker dateNasc = new DatePicker();
		JFXToggleButton simNao = new JFXToggleButton();

		checkBoxFuncionario.getStyleClass().add("custom-jfx-check-box");
		checkBoxVisita.getStyleClass().add("custom-jfx-check-box");
		checkBoxMorador.getStyleClass().add("custom-jfx-check-box");
		checkBoxMorador.setFont(Font.font(10));
		checkBoxVisita.setFont(Font.font(10));
		checkBoxFuncionario.setFont(Font.font(10));

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
		checkBoxFuncionario.setTextFill(Color.BLACK);
		checkBoxVisita.setUnCheckedColor(Color.BLACK);
		checkBoxMorador.setUnCheckedColor(Color.BLACK);
		checkBoxFuncionario.setUnCheckedColor(Color.BLACK);
		checkBoxVisita.setCheckedColor(Color.RED);
		checkBoxMorador.setCheckedColor(Color.BLUE);
		checkBoxFuncionario.setCheckedColor(Color.BLACK);

		lblData.setLayoutX(50);
		lblData.setLayoutY(190);
		lblNome.setLayoutX(50);
		lblNome.setLayoutY(240);
		lblCpf.setLayoutX(370);
		lblCpf.setLayoutY(240);
		lblBloco.setLayoutX(220);
		lblBloco.setLayoutY(360);
		lblMoradores.setLayoutX(50);
		lblMoradores.setLayoutY(300);
		lblNasc.setLayoutX(525);
		lblNasc.setLayoutY(190);
		lblTelefone.setLayoutX(370);
		lblTelefone.setLayoutY(300);
		lblApartamento.setLayoutX(50);
		lblApartamento.setLayoutY(360);
		lblVagaGaragem.setLayoutX(370);
		lblVagaGaragem.setLayoutY(360);
		lblMenorIdade.setLayoutX(160);
		;
		lblMenorIdade.setLayoutY(300);
		simNao.setLayoutX(200);
		simNao.setLayoutY(310);
		checkBoxVisita.setLayoutX(210);
		checkBoxVisita.setLayoutY(100);
		checkBoxMorador.setLayoutX(310);
		checkBoxMorador.setLayoutY(100);
		checkBoxFuncionario.setLayoutX(410);
		checkBoxFuncionario.setLayoutY(100);

		txtNome.setLayoutX(50);
		txtNome.setLayoutY(260);
		txtCpf.setLayoutX(370);
		txtCpf.setLayoutY(260);
		txtTel.setLayoutX(370);
		txtTel.setLayoutY(320);
		txtApartamento.setLayoutX(60);
		txtApartamento.setLayoutY(380);
		txtVagaGaragem.setLayoutX(370);
		txtVagaGaragem.setLayoutY(380);
		txtMoradores.setLayoutX(60);
		txtMoradores.setLayoutY(320);
		txtBloco.setLayoutX(215);
		txtBloco.setLayoutY(380);
		txtMoradores.setPrefWidth(50);
		txtApartamento.setPrefWidth(50);
		txtNome.setPrefWidth(250);
		txtCpf.setPrefWidth(250);
		txtTel.setPrefWidth(250);
		txtBloco.setPrefWidth(50);
		txtVagaGaragem.setPrefWidth(250);

		dateEntrada.setLayoutX(150);
		dateEntrada.setLayoutY(185);
		dateEntrada.setPrefWidth(150);
		dateEntrada.setStyle("-fx-background-color: BLACK");
		dateNasc.setPrefWidth(150);
		dateNasc.setLayoutX(370);
		dateNasc.setLayoutY(185);
		dateNasc.setStyle("-fx-background-color: BLACK");
		simNao.setToggleColor(Color.DARKBLUE);

		pane.getChildren().addAll(lblNasc, dateNasc, simNao, lblMenorIdade, lblMoradores, lblBloco, txtMoradores,
				txtBloco, btnSalvar, btnCancelar, dateEntrada, txtNome, txtCpf, txtTel, txtApartamento, txtVagaGaragem,
				lblData, lblNome, lblCpf, lblTelefone, rippCVisita, lblApartamento, lblVagaGaragem, checkBoxVisita,
				checkBoxMorador, checkBoxFuncionario);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();
	}

}
