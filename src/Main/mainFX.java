/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author XPC
 */
public class mainFX extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
       
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMainMenu.fxml"));
        Scene scene = new Scene(root);
        
        
        stage.setScene(scene);  
        stage.setTitle("Laboratory No.1 1-2022");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

  
    public static void main(String[] args) {
        launch(args);
    }
    
}
