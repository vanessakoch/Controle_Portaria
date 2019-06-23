package br.edu.ifsc;

import br.edu.ifsc.stages.LoginStage;
import br.edu.ifsc.stages.MenuStage;
import br.edu.ifsc.stages.VisitaStage;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		new VisitaStage(primaryStage);
	}
}
