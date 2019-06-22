package br.edu.ifsc.stages;

import java.awt.Font;

import javax.swing.GroupLayout.Alignment;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXPopup;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXRippler.RipplerMask;
import com.jfoenix.controls.JFXRippler.RipplerPos;
import com.jfoenix.controls.JFXScrollPane;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXSnackbar.SnackbarEvent;
import br.edu.ifsc.util.Strings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class MenuStage {

	public MenuStage(Stage stage, String username) throws Exception {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(800, 500);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #212121;");

		JFXListView<Label> list = new JFXListView<Label>();
		Label lblArq = new Label("ARQUIVOS / DOCUMENTOS");
		Label lblLeitura = new Label("CONFIGURAR LEITURAS");
		Label lblDoc = new Label("DOCUMENTOS EMITIDOS");
		Label lblCond = new Label("EDITAR CONDOMÍNIO");
		Label lblCob = new Label("VAGAS DE GARAGEM");
		Label lblMorador = new Label("LISTA DE MORADORES");
		Label lblUtil = new Label("TELEFONES ÚTEIS");
		Label lblUnidade = new Label("UNIDADES");
		Label lblFinanceiro = new Label("FINANCEIRO");
		Label lblConfig = new Label("CONFIGURAÇÕES");
		Label lblAjuda = new Label("AJUDA - SUPORTE");
		Label lblSair = new Label("SAIR");
		
		
		list.getItems().addAll(lblArq, lblLeitura, lblDoc, lblCond, lblCob, lblMorador, lblUtil, lblUnidade,
				lblFinanceiro, lblConfig, lblAjuda, lblSair);
		//list.getStyleClass().add("mylistview");
		list.setStyle("-fx-background-color: #EEEEEE; -fx-cursor: hand; -fx-base: #EEEEEE;");

		list.setLayoutY(70);

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

		rippVisit.setLayoutX(290);
		rippVisit.setLayoutY(90);
		lblVisit.setPrefSize(190, 50);

		rippCar.setLayoutX(290);
		rippCar.setLayoutY(160);
		lblCar.setPrefSize(190, 50);

		rippKey.setLayoutX(290);
		rippKey.setLayoutY(230);
		lblKey.setPrefSize(190, 50);

		rippMural.setLayoutX(290);
		rippMural.setLayoutY(300);
		lblMural.setPrefSize(190, 50);

		rippLost.setLayoutX(290);
		rippLost.setLayoutY(370);
		lblLost.setPrefSize(190, 50);
		
		rippAssembleia.setLayoutX(550);
		rippAssembleia.setLayoutY(90);
		lblAssembleia.setPrefSize(190, 50);

		rippCorresp.setLayoutX(550);
		rippCorresp.setLayoutY(160);
		lblCorrespondencia.setPrefSize(190, 50);

		rippMoradores.setLayoutX(550);
		rippMoradores.setLayoutY(230);
		lblMoradores.setPrefSize(190, 50);
		
		rippPhone.setLayoutX(550);
		rippPhone.setLayoutY(300);
		lblPhone.setPrefSize(190, 50);
		
		rippMonitor.setLayoutX(550);
		rippMonitor.setLayoutY(370);
		lblMonitor.setPrefSize(190, 50);

		JFXSnackbar bar = new JFXSnackbar(pane);
		bar.enqueue(new SnackbarEvent("Selecione uma opção"));

		pane.getChildren().addAll(list, rippVisit, rippCar, rippKey, rippMural, rippLost, rippAssembleia, rippCorresp, rippMoradores, rippPhone, rippMonitor);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();

	}

}
