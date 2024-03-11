package se2203b.ipayroll;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 *
 * @author Abdelkader
 */
public class IPayrollController implements Initializable {
    @FXML
    private MenuBar mainMenu;

    public void showAbout() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("about-view.fxml"));
        Parent About = (Parent) fxmlLoader.load();
        Scene scene = new Scene(About);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/main/resources/se2203b/ipayroll/WesternLogo.png"));
        stage.setTitle("About Us");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void exit() {
        Stage stage = (Stage) mainMenu.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
