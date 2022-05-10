/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Duran Family
 */
public class FXMLDivideAndConquerController implements Initializable {

    @FXML
    private Pane Pane;
    @FXML
    private TextField TEXTFIELDSIZEARRAY;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public int GetSizeArray (){
        int SizeArray = Integer.parseInt(TEXTFIELDSIZEARRAY.getText());
        return SizeArray;
    }
    
}
