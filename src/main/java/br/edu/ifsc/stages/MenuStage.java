package br.edu.ifsc.stages;

import javax.swing.Icon;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXMasonryPane;
import com.jfoenix.controls.JFXPopup;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXRippler.RipplerMask;
import com.jfoenix.controls.JFXRippler.RipplerPos;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXSnackbar.SnackbarEvent;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import com.jfoenix.controls.JFXToggleNode;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import com.jfoenix.validation.RequiredFieldValidator;

import br.edu.ifsc.util.Strings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MenuStage {

	public MenuStage(Stage stage, String username) throws Exception {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(800, 500);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #616161;");

      
		JFXListView<Label> list = new JFXListView<Label>();
		list.getItems().add(new Label("Arquivos/Documentos"));
		list.getItems().add(new Label("Configurar Leituras"));
		list.getItems().add(new Label("Documentos Emitidos"));
		list.getItems().add(new Label("Editar Condomínio"));
		list.getItems().add(new Label("Formas de Cobrança"));
		list.getItems().add(new Label("Lista de Moradores"));
		list.getItems().add(new Label("Telefones Úteis"));
		list.getItems().add(new Label("Unidades"));
		list.getItems().add(new Label("Financeiro"));
		list.getItems().add(new Label("Configurações"));
		list.getItems().add(new Label("Ajuda - Suporte"));
        list.getStyleClass().add("mylistview");
        list.setStyle("-fx-cursor: hand; -fx-base: #616161; ");
		list.setLayoutY(50);
		
		Label label = new Label("REGISTRAR VISITANTE");
		label.setStyle("-fx-background-color: #E91E63;-fx-padding:20");
		JFXRippler rippler = new JFXRippler(label);
		
		rippler.setLayoutX(250);
		rippler.setLayoutY(50);
		
//		JFXHamburger h1 = new JFXHamburger();
//		HamburgerSlideCloseTransition burgerTask = new HamburgerSlideCloseTransition(h1);
//		burgerTask.setRate(-1);
//		h1.addEventHandler(MouseEvent.MOUSE_PRESSED, (e)->{
//		    burgerTask.setRate(burgerTask.getRate()*-1);
//		    burgerTask.play();
//		});
		
		JFXSnackbar bar = new JFXSnackbar(pane);
		bar.enqueue(new SnackbarEvent("Selecione uma opção"));

    	pane.getChildren().addAll(list,rippler);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();
        
	}

}
