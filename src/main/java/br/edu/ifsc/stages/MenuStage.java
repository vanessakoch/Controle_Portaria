package br.edu.ifsc.stages;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXSnackbar.SnackbarEvent;
import br.edu.ifsc.util.Strings;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MenuStage {

	public MenuStage(Stage stage, String username) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(800, 500);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #616161;");

		JFXListView<JFXButton> list = new JFXListView<JFXButton>();
		JFXButton btnArquivo = new JFXButton("ARQUIVOS / DOCUMENTOS");
		JFXButton btnLeitura = new JFXButton("CONFIGURAR LEITURAS");
		JFXButton btnDocumento = new JFXButton("DOCUMENTOS EMITIDOS");
		JFXButton btnCondominio = new JFXButton("EDITAR CONDOMÍNIO");
		JFXButton btnVagas = new JFXButton("VAGAS DE GARAGEM");
		JFXButton btnAgenda = new JFXButton("AGENDAMENTOS");
		JFXButton btnRelatorio = new JFXButton("RELATÓRIOS");
		JFXButton btnUnidade = new JFXButton("UNIDADES");
		JFXButton btnFinanceiro = new JFXButton("FINANCEIRO");
		JFXButton btnConfig = new JFXButton("CONFIGURAÇÕES");
		JFXButton btnAjuda = new JFXButton("AJUDA - SUPORTE");
		JFXButton btnSair = new JFXButton("SAIR");

		btnArquivo.setPrefSize(220, 25);
		btnLeitura.setPrefSize(220, 25);
		btnDocumento.setPrefSize(220, 25);
		btnCondominio.setPrefSize(220, 25);
		btnVagas.setPrefSize(220, 25);
		btnAgenda.setPrefSize(220, 25);
		btnRelatorio.setPrefSize(220, 25);
		btnUnidade.setPrefSize(220, 25);
		btnFinanceiro.setPrefSize(220, 25);
		btnConfig.setPrefSize(220, 25);
		btnAjuda.setPrefSize(220, 25);
		btnSair.setPrefSize(220, 25);

		list.getItems().addAll(btnArquivo, btnLeitura, btnDocumento, btnCondominio, btnVagas, btnAgenda, btnRelatorio,
				btnUnidade, btnFinanceiro, btnConfig, btnAjuda, btnSair);
		list.setStyle("-fx-background-color: #212121 ; -fx-cursor: hand; -fx-base: #212121;");
		list.setPrefHeight(570);
		list.setLayoutY(70);

		Label lblUsuario = new Label("Bem vindo(a) " + username);
		lblUsuario.setLayoutX(620);
		lblUsuario.setLayoutY(60);
	
		Label lblVisit = new Label("REGISTRAR VISITANTE");
		lblVisit.setStyle("-fx-background-color: #00ACC1;-fx-padding:20");
		lblVisit.setTextFill(Color.WHITE);
		JFXRippler rippVisit = new JFXRippler(lblVisit);

		Label lblCar = new Label("REGISTRAR VEÍCULO");
		lblCar.setStyle("-fx-background-color: #F9A825;-fx-padding:20");
		lblCar.setTextFill(Color.WHITE);
		JFXRippler rippCar = new JFXRippler(lblCar);

		Label lblKey = new Label("CONTROLE DE CHAVES");
		lblKey.setStyle("-fx-background-color: #4CAF50;-fx-padding:20");
		lblKey.setTextFill(Color.WHITE);
		JFXRippler rippKey = new JFXRippler(lblKey);

		Label lblMural = new Label("MURAL");
		lblMural.setStyle("-fx-background-color: #E53935;-fx-padding:20");
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
		lblMoradores.setStyle("-fx-background-color: #E65100;-fx-padding:20");
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

		lblTitulo.setPrefSize(800, 50);

		rippVisit.setLayoutX(290);
		rippVisit.setLayoutY(150);
		lblVisit.setPrefSize(190, 50);

		rippCar.setLayoutX(290);
		rippCar.setLayoutY(220);
		lblCar.setPrefSize(190, 50);

		rippKey.setLayoutX(290);
		rippKey.setLayoutY(290);
		lblKey.setPrefSize(190, 50);

		rippMural.setLayoutX(290);
		rippMural.setLayoutY(360);
		lblMural.setPrefSize(190, 50);

		rippLost.setLayoutX(290);
		rippLost.setLayoutY(430);
		lblLost.setPrefSize(190, 50);

		rippAssembleia.setLayoutX(550);
		rippAssembleia.setLayoutY(150);
		lblAssembleia.setPrefSize(190, 50);

		rippCorresp.setLayoutX(550);
		rippCorresp.setLayoutY(220);
		lblCorrespondencia.setPrefSize(190, 50);

		rippMoradores.setLayoutX(550);
		rippMoradores.setLayoutY(290);
		lblMoradores.setPrefSize(190, 50);

		rippPhone.setLayoutX(550);
		rippPhone.setLayoutY(360);
		lblPhone.setPrefSize(190, 50);

		rippMonitor.setLayoutX(550);
		rippMonitor.setLayoutY(430);
		lblMonitor.setPrefSize(190, 50);

		JFXSnackbar bar = new JFXSnackbar(pane);
		bar.enqueue(new SnackbarEvent("Selecione uma opção"));

//		rippVisit.setOnMouseClicked(e->{
//			
//		});
//		
		
		btnSair.setOnMouseClicked(finaliza -> {
			try {
				new LoginStage(new Stage());
			} catch (Exception finaliza1) {
				finaliza1.printStackTrace();
			}
			stage.close();
		});

		btnSair.setOnKeyPressed(e -> {
			try {
				new LoginStage(new Stage());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		pane.getChildren().addAll(lblUsuario, rippTitulo, list, rippVisit, rippCar, rippKey, rippMural, rippLost,
				rippAssembleia, rippCorresp, rippMoradores, rippPhone, rippMonitor);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();

	}

}
