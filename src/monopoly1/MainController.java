package monopoly1;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class MainController implements Initializable {

    @FXML
    private AnchorPane nabila;
    @FXML
    private Circle parash;
    @FXML
    private ImageView dice;

    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void move(MouseEvent event) {
        parash.relocate(100,100);
    }

    @FXML
    private void rolldie(ActionEvent event) {
        Random rand = new Random(); //instance of random class
      int upperbound = 6;
        //generate random values from 0-24
      int int_random = rand.nextInt(upperbound); 
      
      System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ (int_random+1));

   
    }

    
    
}
