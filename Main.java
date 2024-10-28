package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	private static Stage primaryStage;

    @Override
    public void start(Stage primary) {
    	primaryStage = primary; 
        loginPage loginPage = new loginPage();

        Scene scene = new Scene(loginPage, 800, 400);
        loginPage.setStyle("-fx-background-color: #F5DEB3;");
        primary.setTitle("ASU Bookstore");
        primary.setScene(scene);
        primary.show();
    }
    
    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}