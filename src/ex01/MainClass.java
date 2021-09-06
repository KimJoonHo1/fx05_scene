package ex01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Document.fxml"));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		
		Controller ct1 = loader.getController();
		ct1.setRoot(root);
		
		arg0.setScene(scene);
		arg0.show();
	}

}
