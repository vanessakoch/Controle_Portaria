package br.edu.ifsc.stages;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXButton.ButtonType;
import com.jfoenix.controls.JFXSnackbar.SnackbarEvent;
import br.edu.ifsc.util.Strings;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MenuStage {

	public MenuStage(Stage stage) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(900, 500);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #757575;");

		JFXListView<JFXButton> list = new JFXListView<JFXButton>();
		JFXButton btnCadMorador = new JFXButton("CADASTRAR MORADOR");
		JFXButton btnLeitura = new JFXButton("CONFIGURAR LEITURAS");
		JFXButton btnDocumento = new JFXButton("DOCUMENTOS EMITIDOS");
		JFXButton btnCondominio = new JFXButton("EDITAR CONDOMÍNIO");
		JFXButton btnVagas = new JFXButton("VAGAS DE GARAGEM");
		JFXButton btnAgenda = new JFXButton("AGENDAMENTOS");
		JFXButton btnRelatorio = new JFXButton("RELATÓRIOS");
		JFXButton btnUnidade = new JFXButton("UNIDADES");
		JFXButton btnEventos = new JFXButton("EVENTOS");
		JFXButton btnConfig = new JFXButton("CONFIGURAÇÕES");
		JFXButton btnAjuda = new JFXButton("AJUDA - SUPORTE");
		JFXButton btnSair = new JFXButton("SAIR");

		btnCadMorador.setPrefSize(220, 25);
		btnLeitura.setPrefSize(220, 25);
		btnDocumento.setPrefSize(220, 25);
		btnCondominio.setPrefSize(220, 25);
		btnVagas.setPrefSize(220, 25);
		btnAgenda.setPrefSize(220, 25);
		btnRelatorio.setPrefSize(220, 25);
		btnUnidade.setPrefSize(220, 25);
		btnEventos.setPrefSize(220, 25);
		btnConfig.setPrefSize(220, 25);
		btnAjuda.setPrefSize(220, 25);
		btnSair.setPrefSize(220, 25);

		btnSair.setButtonType(ButtonType.RAISED);
		btnSair.setStyle("-fx-background-color: #FAFAFA; -fx-cursor: hand");
		btnAjuda.setButtonType(ButtonType.RAISED);
		btnAjuda.setStyle("-fx-background-color: #212121; -fx-cursor: hand");
		btnUnidade.setButtonType(ButtonType.RAISED);
		btnUnidade.setStyle("-fx-background-color: #212121; -fx-cursor: hand");
		btnEventos.setButtonType(ButtonType.RAISED);
		btnEventos.setStyle("-fx-background-color: #212121; -fx-cursor: hand");
		btnConfig.setButtonType(ButtonType.RAISED);
		btnConfig.setStyle("-fx-background-color: #212121; -fx-cursor: hand");
		btnVagas.setButtonType(ButtonType.RAISED);
		btnVagas.setStyle("-fx-background-color: #212121; -fx-cursor: hand");
		btnAgenda.setButtonType(ButtonType.RAISED);
		btnAgenda.setStyle("-fx-background-color: #212121; -fx-cursor: hand");
		btnRelatorio.setButtonType(ButtonType.RAISED);
		btnRelatorio.setStyle("-fx-background-color: #212121; -fx-cursor: hand");
		btnCadMorador.setButtonType(ButtonType.RAISED);
		btnCadMorador.setStyle("-fx-background-color: #212121; -fx-cursor: hand");
		btnLeitura.setButtonType(ButtonType.RAISED);
		btnLeitura.setStyle("-fx-background-color: #212121; -fx-cursor: hand");
		btnDocumento.setButtonType(ButtonType.RAISED);
		btnDocumento.setStyle("-fx-background-color: #212121; -fx-cursor: hand");
		btnCondominio.setButtonType(ButtonType.RAISED);
		btnCondominio.setStyle("-fx-background-color: #212121; -fx-cursor: hand");

		list.getItems().addAll(btnCadMorador, btnLeitura, btnDocumento, btnCondominio, btnVagas, btnAgenda,
				btnRelatorio, btnUnidade, btnEventos, btnConfig, btnAjuda, btnSair);
		list.setStyle("-fx-background-color: #212121 ; -fx-cursor: hand; -fx-base: #212121;");
		list.setPrefHeight(570);
		list.setLayoutY(70);
		list.setLayoutX(10);

		btnSair.setTextFill(Color.BLACK);

		Label lblVisit = new Label("REGISTRAR VISITANTE");
		lblVisit.setStyle("-fx-background-color: #00ACC1;-fx-padding:20;-fx-cursor: hand");
		lblVisit.setTextFill(Color.WHITE);
		JFXRippler rippVisit = new JFXRippler(lblVisit);

		Label lblCar = new Label("REGISTRAR VEÍCULO");
		lblCar.setStyle("-fx-background-color: #F9A825;-fx-padding:20;-fx-cursor: hand");
		lblCar.setTextFill(Color.WHITE);
		JFXRippler rippCar = new JFXRippler(lblCar);

		Label lblKey = new Label("CONTROLE DE CHAVES");
		lblKey.setStyle("-fx-background-color: #4CAF50;-fx-padding:20");
		lblKey.setTextFill(Color.WHITE);
		JFXRippler rippKey = new JFXRippler(lblKey);

		Label lblMural = new Label("MURAL");
		lblMural.setStyle("-fx-background-color: #E53935;-fx-padding:20;-fx-cursor: hand");
		lblMural.setTextFill(Color.WHITE);
		JFXRippler rippMural = new JFXRippler(lblMural);

		Label lblLost = new Label("ACHADOS E PERDIDOS");
		lblLost.setStyle("-fx-background-color: #EC407A;-fx-padding:20");
		lblLost.setTextFill(Color.WHITE);
		JFXRippler rippLost = new JFXRippler(lblLost);

		Label lblAssembleia = new Label("ASSEMBLÉIAS");
		lblAssembleia.setStyle("-fx-background-color: #4A148C;-fx-padding:20");
		lblAssembleia.setTextFill(Color.WHITE);
		JFXRippler rippAssembleia = new JFXRippler(lblAssembleia);

		Label lblCorrespondencia = new Label("CORRESPONDÊNCIAS");
		lblCorrespondencia.setStyle("-fx-background-color: #A1887F;-fx-padding:20");
		lblCorrespondencia.setTextFill(Color.WHITE);
		JFXRippler rippCorresp = new JFXRippler(lblCorrespondencia);

		Label lblMoradores = new Label("LISTA DE MORADORES");
		lblMoradores.setStyle("-fx-background-color: #E65100;-fx-padding:20;-fx-cursor: hand");
		lblMoradores.setTextFill(Color.WHITE);
		JFXRippler rippMoradores = new JFXRippler(lblMoradores);

		Label lblPhone = new Label("TELEFONES ÚTEIS");
		lblPhone.setStyle("-fx-background-color: #004D40;-fx-padding:20");
		lblPhone.setTextFill(Color.WHITE);
		JFXRippler rippPhone = new JFXRippler(lblPhone);

		Label lblMonitor = new Label("MONITORAMENTO");
		lblMonitor.setStyle("-fx-background-color: #3E2723;-fx-padding:20");
		lblMonitor.setTextFill(Color.WHITE);
		JFXRippler rippMonitor = new JFXRippler(lblMonitor);

		Label lblTitulo = new Label("CONTROLE DE PORTARIA");
		lblTitulo.setStyle("-fx-background-color: #212121;-fx-padding:20");
		lblTitulo.setTextFill(Color.WHITE);
		JFXRippler rippTitulo = new JFXRippler(lblTitulo);

		lblTitulo.setPrefSize(900, 50);

		rippVisit.setLayoutX(370);
		rippVisit.setLayoutY(160);
		lblVisit.setPrefSize(190, 50);

		rippCar.setLayoutX(370);
		rippCar.setLayoutY(230);
		lblCar.setPrefSize(190, 50);

		rippKey.setLayoutX(370);
		rippKey.setLayoutY(300);
		lblKey.setPrefSize(190, 50);

		rippMural.setLayoutX(370);
		rippMural.setLayoutY(370);
		lblMural.setPrefSize(190, 50);

		rippLost.setLayoutX(370);
		rippLost.setLayoutY(440);
		lblLost.setPrefSize(190, 50);

		rippAssembleia.setLayoutX(640);
		rippAssembleia.setLayoutY(160);
		lblAssembleia.setPrefSize(190, 50);

		rippCorresp.setLayoutX(640);
		rippCorresp.setLayoutY(230);
		lblCorrespondencia.setPrefSize(190, 50);

		rippMoradores.setLayoutX(640);
		rippMoradores.setLayoutY(300);
		lblMoradores.setPrefSize(190, 50);

		rippPhone.setLayoutX(640);
		rippPhone.setLayoutY(370);
		lblPhone.setPrefSize(190, 50);

		rippMonitor.setLayoutX(640);
		rippMonitor.setLayoutY(440);
		lblMonitor.setPrefSize(190, 50);

		JFXSnackbar bar = new JFXSnackbar(pane);
		bar.enqueue(new SnackbarEvent("Selecione uma opção"));

		rippMoradores.setOnMouseClicked(e -> {
		try {
			new MoradoresStage(new Stage());
			stage.close();
		} catch (Exception finaliza1) {
			finaliza1.printStackTrace();
		}
	});

		btnCadMorador.setOnMouseClicked(e -> new CadMoradorStage(new Stage()));

		rippCar.setOnMouseClicked(e -> new CadVeiculoStage(new Stage()));

		rippMural.setOnMouseClicked(e -> new MuralStage(new Stage()));
		
		rippVisit.setOnMouseClicked(e -> new CadVisitaStage(new Stage()));

		btnSair.setOnMouseClicked(finaliza -> {
			try {
				new LoginStage(new Stage());
				stage.close();
			} catch (Exception finaliza1) {
				finaliza1.printStackTrace();
			}
		});

		pane.getChildren().addAll(rippTitulo, list, rippVisit, rippCar, rippKey, rippMural, rippLost, rippAssembleia,
				rippCorresp, rippMoradores, rippPhone, rippMonitor);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();

	}

}
