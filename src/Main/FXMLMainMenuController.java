/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

/**
 *
 * @author XPC
 */
public class FXMLMainMenuController implements Initializable {
    
    private Label label;
    @FXML
    private BorderPane bp;
    @FXML
    private Button btnHome;
    @FXML
    private Button btnExit;
    @FXML
    private AnchorPane ap;
    @FXML
    private Text textMsg;
    @FXML
    private Button btnDivideandConquer;
    @FXML
    private Button btnDynamic;
    @FXML
    private Button btnProbabilistic;
    @FXML
    private Button btnVector;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void loadPage(String page){
        
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(page+".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }//end catch
        
        this.bp.setCenter(root);
        
    }//end loadpage
    @FXML
    private void onMouseClickedExit(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void onMouseClickedDivideAndConquer(MouseEvent event) {
        loadPage("FXMLDivideAndConquer");
    }

    @FXML
    private void onMouseClickedDynamic(MouseEvent event) {
    }

    @FXML
    private void onMouseClickedProbabilistic(MouseEvent event) {
    }

    @FXML
    private void onMouseClickedVector(MouseEvent event) {
    }

    @FXML
    private void onMouseClickedHome(MouseEvent event) {
    }
    
}
