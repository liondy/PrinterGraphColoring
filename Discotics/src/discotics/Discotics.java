/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotics;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Michael Liondy
 */
public class Discotics extends Application {
    
    static Stage stages;
    static Pane rootPane;
    static AnchorPane aboutPane;
    
    @Override
    public void start(Stage stage) throws Exception {
        rootPane = FXMLLoader.load(getClass().getResource("Root.fxml"));
        stages = stage;
        Scene scene1 = new Scene(rootPane);
        stage.setScene(scene1);
        stage.setResizable(true);
        stage.setTitle("Discotics 2018");
        stage.getIcons().add(new Image("/Images/Logo.jpg"));
        stage.show();
        tes();
    }
    
    private void tes() throws IOException {
        aboutPane = FXMLLoader.load(getClass().getResource("frmAbout.fxml"));
        rootPane.getChildren().setAll(aboutPane);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
