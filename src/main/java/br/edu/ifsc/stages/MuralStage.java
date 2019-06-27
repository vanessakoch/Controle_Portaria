package br.edu.ifsc.stages;

import com.jfoenix.controls.JFXAlert;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton.ButtonType;
import com.jfoenix.controls.JFXDialogLayout;

import br.edu.ifsc.util.Strings;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MuralStage {

	public MuralStage(Stage stage) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(600, 500);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #BDBDBD;");

		Label lblMural = new Label("MURAL DE AVISOS");
		JFXButton btnSair = new JFXButton("SAIR");
		JFXButton btnVisita = new JFXButton("AOS VISITANTES");
		JFXButton btnMorador = new JFXButton("AOS MORADORES");
		JFXButton btnAssembleia = new JFXButton("SOBRE ASSEMBLEIAS");
		btnMorador.setButtonType(ButtonType.RAISED);
		btnMorador.setStyle("-fx-background-color: #8BC34A; -fx-cursor: hand");
		btnMorador.setTextFill(Color.WHITE);
		btnAssembleia.setButtonType(ButtonType.RAISED);
		btnAssembleia.setStyle("-fx-background-color: #03A9F4; -fx-cursor: hand");
		btnAssembleia.setTextFill(Color.WHITE);
		btnVisita.setButtonType(ButtonType.RAISED);
		btnVisita.setStyle("-fx-background-color: #FFEB3B; -fx-cursor: hand");
		btnVisita.setTextFill(Color.BLACK);
		btnAssembleia.setPrefHeight(50);
		btnAssembleia.setLayoutX(220);
		btnAssembleia.setLayoutY(180);
		btnMorador.setPrefHeight(50);
		btnMorador.setLayoutX(100);
		btnMorador.setLayoutY(270);
		btnVisita.setPrefHeight(50);
		btnVisita.setLayoutX(350);
		btnVisita.setLayoutY(270);
		lblMural.setTextFill(Color.BLACK);
		lblMural.setFont(Font.font(16));
		lblMural.setLayoutX(220);
		lblMural.setLayoutY(70);
		btnSair.setLayoutX(250);
		btnSair.setLayoutY(400);
		btnSair.setButtonType(ButtonType.RAISED);
		btnSair.setStyle("-fx-background-color: WHITE; -fx-cursor: hand");
		btnSair.setTextFill(Color.BLACK);
		btnSair.setPrefSize(100, 40);

		btnSair.setOnMouseClicked(finaliza -> stage.close());

		btnAssembleia.setOnAction(action -> {
			@SuppressWarnings("rawtypes")
			JFXAlert alert = new JFXAlert((Stage) btnMorador.getScene().getWindow());
			alert.initModality(Modality.APPLICATION_MODAL);
			alert.setOverlayClose(false);
			JFXDialogLayout layout = new JFXDialogLayout();
			layout.setHeading(new Label("À Respeito das Assembléias"));
			layout.setBody(new Label(
					"As decisões tomadas em assembleia são soberanas, ou seja, valem para todos os condôminos. "
							+ "Participando da assembleia, você tem voz sobre as decisões e também evita que elas sejam tomadas por "
							+ "um pequeno grupo de moradores. "
							+ "Os condôminos ausentes de votações ficam submetidos ao que foi decidido. "
							+ "Suas ideia podem ser importantes para o bem comum. "
							+ "Você fica sabendo a destinação do seu dinheiro e a dos demais moradores que contribuem com o condomínio."));
			JFXButton closeButton = new JFXButton("ACCEPT");
			closeButton.getStyleClass().add("dialog-accept");
			closeButton.setOnAction(event -> alert.hideWithAnimation());
			layout.setActions(closeButton);
			alert.setContent(layout);
			alert.show();
		});

		btnVisita.setOnAction(action -> {
			@SuppressWarnings("rawtypes")
			JFXAlert alert = new JFXAlert((Stage) btnMorador.getScene().getWindow());
			alert.initModality(Modality.APPLICATION_MODAL);
			alert.setOverlayClose(false);
			JFXDialogLayout layout = new JFXDialogLayout();
			layout.setHeading(new Label("À Senhores Visitantes"));
			layout.setBody(new Label("Só será permitida a entrada de visitantes perante a autorização do morador."));
			JFXButton closeButton = new JFXButton("ACCEPT");
			closeButton.getStyleClass().add("dialog-accept");
			closeButton.setOnAction(event -> alert.hideWithAnimation());
			layout.setActions(closeButton);
			alert.setContent(layout);
			alert.show();
		});

		btnMorador.setOnAction(action -> {
			@SuppressWarnings("rawtypes")
			JFXAlert alert = new JFXAlert((Stage) btnMorador.getScene().getWindow());
			alert.initModality(Modality.APPLICATION_MODAL);
			alert.setOverlayClose(false);
			JFXDialogLayout layout = new JFXDialogLayout();
			layout.setHeading(new Label("À Senhores Condôminos"));
			layout.setBody(new Label("Na qualidade de síndico do (nome do condomínio), "
					+ "venho por meio da presente comunicar a todos os condôminos que a piscina da área de lazer estará "
					+ "indisponível para uso entre os dias (data) e (data) em razão da reforma programada para melhoria daquelas "
					+ "instalações.Aproveito o ensejo para renovar expressões de elevada estima e consideração. Ass:Síndico"));
			JFXButton closeButton = new JFXButton("ACCEPT");
			closeButton.getStyleClass().add("dialog-accept");
			closeButton.setOnAction(event -> alert.hideWithAnimation());
			layout.setActions(closeButton);
			alert.setContent(layout);
			alert.show();
		});

		pane.getChildren().addAll(btnAssembleia, btnSair, lblMural, btnMorador, btnVisita);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();
	}
}
