package br.edu.ifsc.stages;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton.ButtonType;

import br.edu.ifsc.db.MoradorJson;
import br.edu.ifsc.entities.Morador;
import br.edu.ifsc.util.DB;
import br.edu.ifsc.util.Strings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.converter.BooleanStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class MoradoresStage {

	@SuppressWarnings("unchecked")
	public MoradoresStage(Stage stage) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(1330, 550);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #BDBDBD;");
		Label lblListaMoradores = new Label("LISTA DE MORADORES");

		JFXButton btnSair = new JFXButton("SAIR");

		TableView<Morador> table = new TableView<Morador>();
		TableColumn<Morador, String> nomeCol = new TableColumn<Morador, String>("Nome Completo");
		TableColumn<Morador, String> cpfCol = new TableColumn<Morador, String>("CPF");
		TableColumn<Morador, String> nascCol = new TableColumn<Morador, String>("Data de Nascimento");
		TableColumn<Morador, String> telefoneCol = new TableColumn<Morador, String>("Telefone");
		TableColumn<Morador, Integer> aptoCol = new TableColumn<Morador, Integer>("Apartamento");
		TableColumn<Morador, String> blocoCol = new TableColumn<Morador, String>("Bloco");
		TableColumn<Morador, Integer> qtdMoradorCol = new TableColumn<Morador, Integer>("N� Moradores");
		TableColumn<Morador, String> vagaGaragemCol = new TableColumn<Morador, String>("Vaga de Garagem");
		TableColumn<Morador, String> entradaCol = new TableColumn<Morador, String>("Data de Entrada");
		TableColumn<Morador, Boolean> menorIdadeCol = new TableColumn<Morador, Boolean>("Menor de Idade");

		nomeCol.setCellValueFactory(new PropertyValueFactory<Morador, String>("nome"));
		nomeCol.setCellFactory(TextFieldTableCell.forTableColumn());
		nomeCol.setMinWidth(200);
		cpfCol.setCellValueFactory(new PropertyValueFactory<Morador, String>("cpf"));
		cpfCol.setMinWidth(150);
		nascCol.setCellValueFactory(new PropertyValueFactory<Morador, String>("dataNasc"));
		nascCol.setMinWidth(150);
		telefoneCol.setCellValueFactory(new PropertyValueFactory<Morador, String>("telefone"));
		telefoneCol.setCellFactory(TextFieldTableCell.forTableColumn());
		telefoneCol.setMinWidth(120);
		aptoCol.setCellValueFactory(new PropertyValueFactory<Morador, Integer>("apartamento"));
		aptoCol.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		aptoCol.setMinWidth(100);
		blocoCol.setCellValueFactory(new PropertyValueFactory<Morador, String>("bloco"));
		blocoCol.setCellFactory(TextFieldTableCell.forTableColumn());
		blocoCol.setMinWidth(50);
		qtdMoradorCol.setCellValueFactory(new PropertyValueFactory<Morador, Integer>("qtdMoradores"));
		qtdMoradorCol.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		qtdMoradorCol.setMinWidth(100);
		vagaGaragemCol.setCellValueFactory(new PropertyValueFactory<Morador, String>("vagaGaragem"));
		vagaGaragemCol.setCellFactory(TextFieldTableCell.forTableColumn());
		vagaGaragemCol.setMinWidth(150);
		entradaCol.setCellValueFactory(new PropertyValueFactory<Morador, String>("entrada"));
		entradaCol.setCellFactory(TextFieldTableCell.forTableColumn());
		entradaCol.setMinWidth(100);
		menorIdadeCol.setCellValueFactory(new PropertyValueFactory<Morador, Boolean>("menorIdade"));
		menorIdadeCol.setMinWidth(100);
		menorIdadeCol.setCellFactory(TextFieldTableCell.forTableColumn(new BooleanStringConverter()));

		table.getColumns().addAll(nomeCol, cpfCol, nascCol, telefoneCol, aptoCol, blocoCol, qtdMoradorCol,
				vagaGaragemCol, entradaCol, menorIdadeCol);

		
		table.setItems(DB.moradores.getMoradores());
		table.setLayoutX(80);
		table.setLayoutY(40);
		table.setPrefSize(1500, 420);
		table.setEditable(true);

		lblListaMoradores.setStyle("-fx-background-color: #212121;-fx-padding:20");
		lblListaMoradores.setTextFill(Color.WHITE);
		lblListaMoradores.setPrefSize(1330, 50);
		btnSair.setButtonType(ButtonType.RAISED);
		btnSair.setStyle("-fx-background-color: #C2185B; -fx-cursor: hand");
		btnSair.setTextFill(Color.WHITE);
		btnSair.setPrefSize(100, 40);
		btnSair.setLayoutX(600);
		btnSair.setLayoutY(500);

		StackPane root = new StackPane();
		root.setPadding(new Insets(5));
		root.getChildren().add(table);

		root.setPrefSize(1230, 400);
		root.setLayoutY(80);
		root.setLayoutX(40);

		pane.getChildren().addAll(btnSair, root, lblListaMoradores);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();

		btnSair.setOnMouseClicked(e -> {
			try {
				new MenuStage(new Stage());
				stage.close();
			} catch (Exception finaliza1) {
				finaliza1.printStackTrace();
			}
		});

	}

}
