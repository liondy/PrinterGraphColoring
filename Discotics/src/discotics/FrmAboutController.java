/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotics;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Michael Liondy
 */
public class FrmAboutController implements Initializable {

    @FXML
    private Button btnProceed;
    
    static AnchorPane documentPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proceed(ActionEvent event) throws IOException {
        documentPane = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Discotics.rootPane.getChildren().removeAll(Discotics.aboutPane);
        Discotics.rootPane.getChildren().addAll(documentPane);
    }
    
}
