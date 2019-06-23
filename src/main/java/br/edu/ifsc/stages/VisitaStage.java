package br.edu.ifsc.stages;

import java.time.LocalDateTime;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton.ButtonType;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXTextField;

import br.edu.ifsc.util.Strings;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class VisitaStage {

	public VisitaStage(Stage stage) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(500, 550);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #BDBDBD;");

		Label lblTipo = new Label("TIPO DE CADASTRO");
		Label lblData = new Label("Data do Cadastro: ");
		Label lblHora = new Label("Horário Atual: ");
		Label lblNome = new Label("Nome Completo");
		Label lblCpf = new Label("CPF");
		Label lblNasc = new Label("Data de Nascimento");
		Label lblTelefone = new Label("Telefone");
		Label lblLocal = new Label("Local da Visita");
		Label lblObs = new Label("Observações");

		lblTipo.setTextFill(Color.BLACK);
		lblData.setTextFill(Color.BLACK);
		lblHora.setTextFill(Color.BLACK);
		lblNome.setTextFill(Color.BLACK);
		lblCpf.setTextFill(Color.BLACK);
		lblNasc.setTextFill(Color.BLACK);
		lblTelefone.setTextFill(Color.BLACK);
		lblLocal.setTextFill(Color.BLACK);
		lblObs.setTextFill(Color.BLACK);
		
		JFXButton btnSalvar = new JFXButton("SALVAR");
		JFXButton btnCancelar = new JFXButton("CANCELAR");

		JFXTextField txtNome = new JFXTextField();
		JFXTextField txtCpf = new JFXTextField();
		JFXTextField txtTel = new JFXTextField();
		JFXTextField txtLocal = new JFXTextField();
		JFXTextField txtObs = new JFXTextField();

		Label lblCadastroVisita = new Label("CADASTRO DE VISITANTE");
		JFXRippler rippCVisita = new JFXRippler(lblCadastroVisita);
		JFXCheckBox checkBoxVisita = new JFXCheckBox("VISITANTE");
		JFXCheckBox checkBoxMorador = new JFXCheckBox("MORADOR");
		JFXCheckBox checkBoxFuncionario = new JFXCheckBox("FUNCIONÁRIO");
		DatePicker dateNasc = new DatePicker();
		Label showData = new Label();
		Label showHora = new Label();
		LocalDateTime dt = LocalDateTime.now();
		String dataAtual = dt.getDayOfMonth() + "/" + dt.getMonth() + "/" + dt.getYear();
		String horaAtual = dt.getHour() + ":" + dt.getMinute();
		
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
		showData.setText(dataAtual);
		showHora.setText(horaAtual);
		lblCadastroVisita.setStyle("-fx-background-color: #212121;-fx-padding:20");
		lblCadastroVisita.setTextFill(Color.WHITE);
		lblCadastroVisita.setPrefSize(700, 50);
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
		lblHora.setLayoutX(370);
		lblHora.setLayoutY(190);
		lblNome.setLayoutX(50);
		lblNome.setLayoutY(250);
		lblCpf.setLayoutX(370);
		lblCpf.setLayoutY(250);
		lblNasc.setLayoutX(50);
		lblNasc.setLayoutY(310);
		lblTelefone.setLayoutX(370);
		lblTelefone.setLayoutY(310);
		lblLocal.setLayoutX(50);
		lblLocal.setLayoutY(370);
		lblObs.setLayoutX(370);
		lblObs.setLayoutY(370);
		lblTipo.setLayoutX(280);
		lblTipo.setLayoutY(80);
		lblTipo.setFont(Font.font(14));
		
		checkBoxVisita.setLayoutX(210);
		checkBoxVisita.setLayoutY(120);
		checkBoxMorador.setLayoutX(310);
		checkBoxMorador.setLayoutY(120);
		checkBoxFuncionario.setLayoutX(410);
		checkBoxFuncionario.setLayoutY(120);
		
		txtNome.setLayoutX(50);
		txtNome.setLayoutY(270);
		txtCpf.setLayoutX(370);
		txtCpf.setLayoutY(270);
		txtTel.setLayoutX(370);
		txtTel.setLayoutY(330);
		txtLocal.setLayoutX(50);
		txtLocal.setLayoutY(390);
		txtObs.setLayoutX(370);
		txtObs.setLayoutY(390);

		txtNome.setPrefWidth(250);
		txtCpf.setPrefWidth(250);
		txtTel.setPrefWidth(250);
		txtLocal.setPrefWidth(250);
		txtObs.setPrefWidth(250);

		dateNasc.setLayoutX(50);
		dateNasc.setLayoutY(330);
		dateNasc.setStyle("-fx-background-color: BLACK");
		showData.setTextFill(Color.BLACK);
		showHora.setTextFill(Color.BLACK);

		showData.setLayoutX(160);
		showData.setLayoutY(190);
		showHora.setLayoutX(460);
		showHora.setLayoutY(190);
		

		pane.getChildren().addAll(btnSalvar, btnCancelar, dateNasc, showData, showHora, txtNome, txtCpf, txtTel, txtLocal, txtObs, lblData, lblHora, lblNome,
				lblCpf, lblNasc, lblTelefone, rippCVisita, lblLocal, lblObs, checkBoxVisita, checkBoxMorador,
				checkBoxFuncionario);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();
	}

}
