package br.edu.ifsc.stages;

import java.util.Date;

import com.jfoenix.controls.JFXTreeTableColumn;

import br.edu.ifsc.entities.User;
import br.edu.ifsc.util.Strings;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MoradoresStage {

	public MoradoresStage(Stage stage) {

		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(800, 750);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
		pane.getStyleClass().addAll("b");	
		pane.setStyle("-fx-background-color: #BDBDBD;");
		
		  TreeTableView<Morador> treeTableView = new TreeTableView<Morador>();

	        TreeTableColumn<Morador, String> nomeCol 
	        = new TreeTableColumn<Morador, String>("Nome");
	 
	        TreeTableColumn<Morador, String> cpfCol
	        = new TreeTableColumn<Morador, String>("CPF");
	 
	        TreeTableColumn<Morador, Date> nascCol 
	        = new TreeTableColumn<Morador, Date>("Data de Nascimento");
	 
	        TreeTableColumn<Morador, String> telefoneCol 
	        = new TreeTableColumn<Morador, String>("Telefone");
	        
	        TreeTableColumn<Morador, Integer> aptoCol 
            = new TreeTableColumn<Morador, Integer>("Apartamento");
	        
	        TreeTableColumn<Morador, Character> blocoCol 
            = new TreeTableColumn<Morador, Character>("Bloco");
	        
	        TreeTableColumn<Morador, Integer> qtdMoradorCol 
            = new TreeTableColumn<Morador, Integer>("Quantidade Moradores");
	        
	        TreeTableColumn<Morador, Date> entradaCol 
            = new TreeTableColumn<Morador, Date>("Data de Entrada");
	        
	        TreeTableColumn<Morador, Boolean> menorIdadeCol //
            = new TreeTableColumn<Morador, Boolean>("Menor de Idade");


	        nomeCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, String>("nome"));
	        cpfCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, String>("cpf"));
	        nascCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, Date>("nasc"));
	        telefoneCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, String>("telefone"));
	        aptoCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, Integer>("apto"));
	        blocoCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, Character>("bloco"));
	        qtdMoradorCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, Integer>("qtdMorador"));
	        entradaCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, Date>("entrada"));
	        menorIdadeCol.setCellValueFactory(new TreeItemPropertyValueFactory<Morador, Boolean>("menorIdade"));
	 
	        // Add columns to TreeTable.
	        treeTableView.getColumns().addAll(nomeCol, cpfCol,nascCol, telefoneCol, aptoCol, blocoCol, qtdMoradorCol, entradaCol, menorIdadeCol);
	 
	        // Data
	        Morador morador1 = new Morador("A", "B", null, "555", 1, 'b', 3, null, false);

	       
	 
	        // Root Item
	        TreeItem<Morador> itemRoot = new TreeItem<Morador>(morador1);
	       
	        treeTableView.setRoot(itemRoot);
	        
	        
	        StackPane root = new StackPane();
	        root.setPadding(new Insets(5));
	        root.getChildren().add(treeTableView);
	
		 

	
	
		pane.getChildren().addAll(root);
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);
		stage.show();
	
	
	}

}
