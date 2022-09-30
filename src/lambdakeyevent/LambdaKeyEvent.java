/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lambdakeyevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usu2dam
 */
public class LambdaKeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text movableText = new Text(20,20,"A");
        movableText.setFocusTraversable(true);
               
        Pane root = new Pane();
        root.getChildren().add(movableText);
        movableText.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.UP)
                movableText.setY(movableText.getY()-10);
            else if(e.getCode() == KeyCode.DOWN)
                movableText.setY(movableText.getY()+10);
            else if(e.getCode() == KeyCode.RIGHT)
                movableText.setX(movableText.getX()+10);
            else if(e.getCode() == KeyCode.LEFT)
                movableText.setX(movableText.getX()-10);
            else
                try {
                    if(Character.isLetterOrDigit(e.getText().charAt(0)))
                    movableText.setText(e.getText());
                } 
                catch(StringIndexOutOfBoundsException r) {
                }                
        });
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
