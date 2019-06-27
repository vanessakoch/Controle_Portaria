package br.edu.ifsc;

import br.edu.ifsc.stages.LoginStage;
import br.edu.ifsc.stages.MenuStage;
import br.edu.ifsc.stages.MoradoresStage;
import br.edu.ifsc.stages.MuralStage;
import br.edu.ifsc.stages.CadMoradorStage;
import br.edu.ifsc.stages.CadVeiculoStage;
import br.edu.ifsc.stages.CadVisitaStage;
import br.edu.ifsc.stages.CorrespondenciaStage;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		new MenuStage(primaryStage);
	}
}
