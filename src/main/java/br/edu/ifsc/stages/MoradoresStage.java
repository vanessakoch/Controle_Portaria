package br.edu.ifsc.stages;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton.ButtonType;
import com.jfoenix.controls.cells.editors.TextFieldEditorBuilder;
import com.jfoenix.controls.cells.editors.base.GenericEditableTreeTableCell;

import br.edu.ifsc.entities.Morador;
import br.edu.ifsc.util.Strings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MoradoresStage {

	@SuppressWarnings("unchecked")
	public MoradoresStage(Stage stage) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(1030, 550);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");
		pane.setStyle("-fx-background-color: #BDBDBD;");
		Label lblListaMoradores = new Label("LISTA DE MORADORES");

		JFXButton btnSair = new JFXButton("SAIR");

		TreeTableView<Morador> treeTableView = new TreeTableView<Morador>();
		TreeTableColumn<Morador, String> nomeCol = new TreeTableColumn<Morador, String>("Nome Completo");
		TreeTableColumn<Morador, String> cpfCol = new TreeTableColumn<Morador, String>("CPF");
		TreeTableColumn<Morador, String> nascCol = new TreeTableColumn<Morador, String>("Data de Nascimento");
		TreeTableColumn<Morador, String> telefoneCol = new TreeTableColumn<Morador, String>("Telefone");
		TreeTableColumn<Morador, Integer> aptoCol = new TreeTableColumn<Morador, Integer>("Apartamento");
		TreeTableColumn<Morador, String> blocoCol = new TreeTableColumn<Morador, String>("Bloco");
		TreeTableColumn<Morador, Integer> qtdMoradorCol = new TreeTableColumn<Morador, Integer>("Nº Moradores");
		TreeTableColumn<Morador, String> vagaGaragemCol = new TreeTableColumn<Morador, String>("Vaga de Garagem");
		TreeTableColumn<Morador, String> entradaCol = new TreeTableColumn<Morador, String>("Data de Entrada");
		TreeTableColumn<Morador, Boolean> menorIdadeCol = new TreeTableColumn<Morador, Boolean>("Menor de Idade");

		nomeCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, String>("nome"));
		cpfCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, String>("cpf"));
		nascCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, String>("dataNasc"));
		telefoneCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, String>("telefone"));
		aptoCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, Integer>("apartamento"));
		blocoCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, String>("bloco"));
		qtdMoradorCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, Integer>("qtdMoradores"));
		vagaGaragemCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, String>("vagaGaragem"));
		entradaCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, String>("entrada"));
		menorIdadeCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, Boolean>("menorIdade"));

		nomeCol.setCellFactory(
				(TreeTableColumn<Morador, String> param) -> new GenericEditableTreeTableCell<Morador, String>(
						new TextFieldEditorBuilder()));
		telefoneCol.setCellFactory(
				(TreeTableColumn<Morador, String> param) -> new GenericEditableTreeTableCell<Morador, String>(
						new TextFieldEditorBuilder()));
		aptoCol.setCellFactory(
				(TreeTableColumn<Morador, Integer> param) -> new GenericEditableTreeTableCell<Morador, Integer>(
						new TextFieldEditorBuilder()));
		blocoCol.setCellFactory(
				(TreeTableColumn<Morador, String> param) -> new GenericEditableTreeTableCell<Morador, String>(
						new TextFieldEditorBuilder()));
		qtdMoradorCol.setCellFactory(
				(TreeTableColumn<Morador, Integer> param) -> new GenericEditableTreeTableCell<Morador, Integer>(
						new TextFieldEditorBuilder()));
		vagaGaragemCol.setCellFactory(
				(TreeTableColumn<Morador, String> param) -> new GenericEditableTreeTableCell<Morador, String>(
						new TextFieldEditorBuilder()));
		menorIdadeCol.setCellFactory(
				(TreeTableColumn<Morador, Boolean> param) -> new GenericEditableTreeTableCell<Morador, Boolean>(
						new TextFieldEditorBuilder()));

		treeTableView.getColumns().addAll(nomeCol, cpfCol, nascCol, telefoneCol, aptoCol, blocoCol, qtdMoradorCol,
				vagaGaragemCol, entradaCol, menorIdadeCol);

		Morador morador1 = new Morador("Vanessa", "0000000000", "15/10/1992", "555", 11, "b", 3, "4A", "01/01/2000", false);
		Morador morador2 = new Morador("Aline", "11111111", "15/11/1999", "1", 2, "c", 0, "4B", "10/10/2000", true);

		TreeItem<Morador> itemRoot = new TreeItem<Morador>(morador1);

		treeTableView.setRoot(itemRoot);

		treeTableView.setCenterShape(true);
		treeTableView.setEditable(true);
		treeTableView.setShowRoot(true);
		lblListaMoradores.setStyle("-fx-background-color: #212121;-fx-padding:20");
		lblListaMoradores.setTextFill(Color.WHITE);
		lblListaMoradores.setPrefSize(1030, 50);
		btnSair.setButtonType(ButtonType.RAISED);
		btnSair.setStyle("-fx-background-color: #C2185B; -fx-cursor: hand");
		btnSair.setTextFill(Color.WHITE);
		btnSair.setPrefSize(100, 40);
		btnSair.setLayoutX(470);
		btnSair.setLayoutY(500);
		
		StackPane root = new StackPane();
		root.setPadding(new Insets(5));
		root.getChildren().add(treeTableView);

		root.setPrefSize(960, 300);
		root.setLayoutY(80);
		root.setLayoutX(40);

		pane.getChildren().addAll(btnSair,root, lblListaMoradores);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();

		btnSair.setOnMouseClicked(e ->{
			try {
				new MenuStage(new Stage());
				stage.close();
			} catch (Exception finaliza1) {
				finaliza1.printStackTrace();
			}
		});
		
	}

}
