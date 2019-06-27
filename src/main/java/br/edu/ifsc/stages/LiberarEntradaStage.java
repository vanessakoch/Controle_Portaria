package br.edu.ifsc.stages;

import java.time.LocalDateTime;

import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton.ButtonType;
import com.jfoenix.controls.JFXProgressBar;

import br.edu.ifsc.util.Strings;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class LiberarEntradaStage {
	public LiberarEntradaStage(Stage stage, String nome) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(620, 550);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #BDBDBD;");

		Label lblLiberaçao = new Label("LIBERAÇÃO DE VISITA");
		lblLiberaçao.setStyle("-fx-background-color: #212121;-fx-padding:20");
		lblLiberaçao.setTextFill(Color.WHITE);
		lblLiberaçao.setPrefSize(620, 50);
		Label lblSeguranca = new Label("SEGURANÇA");
		lblSeguranca.setStyle("-fx-background-color: #9C27B0;-fx-padding:20;-fx-cursor: hand");
		lblSeguranca.setTextFill(Color.WHITE);
		JFXRippler rippSeguranca = new JFXRippler(lblSeguranca);

		Label lblCamera = new Label("CAMERAS");
		lblCamera.setStyle("-fx-background-color: #2196F3;-fx-padding:20;-fx-cursor: hand");
		lblCamera.setTextFill(Color.WHITE);
		JFXRippler rippCamera = new JFXRippler(lblCamera);

		Label lblRastrear = new Label("RASTREAMENTO VEICULAR");
		lblRastrear.setStyle("-fx-background-color: #00ACC1;-fx-padding:20;-fx-cursor: hand");
		lblRastrear.setTextFill(Color.WHITE);
		JFXRippler rippRastrea = new JFXRippler(lblRastrear);

		Label lblAudVid = new Label("AÚDIO E VÍDEO");
		lblAudVid.setStyle("-fx-background-color: #E91E63;-fx-padding:20;-fx-cursor: hand");
		lblAudVid.setTextFill(Color.WHITE);
		JFXRippler rippAudVid = new JFXRippler(lblAudVid);

		Label lblNoticias = new Label("NOTÍCIAS");
		lblNoticias.setStyle("-fx-background-color: #009688;-fx-padding:20;-fx-cursor: hand");
		lblNoticias.setTextFill(Color.WHITE);
		JFXRippler rippNoticias = new JFXRippler(lblNoticias);
		Label lblId = new Label("VISITA SE IDENTIFICOU COMO: ");
		Label showData = new Label();
		Label showHora = new Label();
		Label data = new Label("DATA: ");
		Label hora = new Label("HORA: ");
		LocalDateTime dt = LocalDateTime.now();
		String dataAtual = dt.getDayOfMonth() + "/" + dt.getMonth() + "/" + dt.getYear();
		String horaAtual = dt.getHour() + ":" + dt.getMinute();
		showData.setText(dataAtual);
		showHora.setText(horaAtual);
		showData.setLayoutX(100);
		showData.setLayoutY(350);
		showData.setTextFill(Color.BLUE);
		showHora.setLayoutX(100);
		showHora.setLayoutY(400);
		showHora.setTextFill(Color.BLUE);
		data.setLayoutX(50);
		data.setLayoutY(350);
		hora.setLayoutX(50);
		hora.setLayoutY(400);
		Label lblNome = new Label(nome);
		lblNome.setTextFill(Color.BLUE);
		lblNome.getText().toUpperCase();
		lblNome.setLayoutX(50);
		lblNome.setLayoutY(220);
		lblId.setLayoutX(50);
		lblId.setLayoutY(200);
		lblId.setTextFill(Color.BLACK);
		Label lblSolicita = new Label("VISITA SOLICITADA EM: ");
		lblSolicita.setLayoutX(50);
		lblSolicita.setTextFill(Color.BLACK);
		lblSolicita.setLayoutY(300);
		JFXButton btnAceitar = new JFXButton("ACEITAR");
		JFXButton btnRecusar = new JFXButton("RECUSAR");
		btnAceitar.setButtonType(ButtonType.RAISED);
		btnAceitar.setStyle("-fx-background-color: #C2185B; -fx-cursor: hand");
		btnAceitar.setTextFill(Color.WHITE);
		btnAceitar.setPrefSize(150, 80);
		btnAceitar.setLayoutX(400);
		btnAceitar.setLayoutY(230);
		btnRecusar.setButtonType(ButtonType.RAISED);
		btnRecusar.setStyle("-fx-background-color: WHITE; -fx-cursor: hand");
		btnRecusar.setTextFill(Color.BLACK);
		btnRecusar.setPrefSize(150, 80);
		btnRecusar.setLayoutX(400);
		btnRecusar.setLayoutY(330);
		rippSeguranca.setLayoutY(60);
		rippNoticias.setLayoutX(100);
		rippNoticias.setLayoutY(60);
		rippRastrea.setLayoutX(190);
		rippRastrea.setLayoutY(60);
		rippCamera.setLayoutX(390);
		rippCamera.setLayoutY(60);
		rippAudVid.setLayoutX(490);
		rippAudVid.setLayoutY(60);
		JFXProgressBar jfxBar = new JFXProgressBar();
		jfxBar.setPrefWidth(500);
		JFXProgressBar jfxBarInf = new JFXProgressBar();
		jfxBarInf.setPrefWidth(500);
		jfxBarInf.setProgress(-1.0f);
		Timeline timeline = new Timeline(
				new KeyFrame(Duration.ZERO, new KeyValue(jfxBarInf.progressProperty(), 0),
						new KeyValue(jfxBar.progressProperty(), 0)),
				new KeyFrame(Duration.seconds(2), new KeyValue(jfxBarInf.progressProperty(), 1),
						new KeyValue(jfxBar.progressProperty(), 1)));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

		jfxBar.setLayoutY(180);
		jfxBarInf.setLayoutY(460);

		pane.getChildren().addAll(jfxBarInf, jfxBar, lblNome, btnRecusar, btnAceitar, lblSolicita, data, hora, showData,
				showHora, lblId, lblLiberaçao, rippSeguranca, rippNoticias, rippRastrea, rippCamera, rippAudVid);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();

		btnAceitar.setOnMouseClicked(e -> {
			showConfirmation();
			stage.close();
		});
		btnRecusar.setOnAction(e -> {
			showError();
			stage.close();
		});
	}

	private void showConfirmation() {
		Alert dialogoAcerto = new Alert(Alert.AlertType.INFORMATION);
		dialogoAcerto.initStyle(StageStyle.TRANSPARENT);
		dialogoAcerto.setHeaderText("\t\t\tVISITA CONFIRMADA!");
		dialogoAcerto.showAndWait();
	}

	private void showError() {
		Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
		dialogoErro.initStyle(StageStyle.TRANSPARENT);
		dialogoErro.setHeaderText("\t\t\t\tRECUSADO!");
		dialogoErro.showAndWait();
	}
}
