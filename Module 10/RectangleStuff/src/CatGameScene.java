import Interfaces.LabelStyles;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CatGameScene extends Application implements LabelStyles {
    public void start(Stage stage) {
        //Declare main pane that would contain all other pains
        BorderPane mainPane = new BorderPane();

        //Declare selection menu
        ComboBox<String> catSelectionMenu = new ComboBox<>();
        catSelectionMenu.getItems().addAll(CatPaneClass.CAT_NAMES);

        //Set up Label
        Label catSelection = new Label("Select your hero:", catSelectionMenu);
        catSelection.setContentDisplay(ContentDisplay.RIGHT);
        catSelection.setStyle(LABEL_STYLE);
        StackPane labelPane = new StackPane(catSelection);
        labelPane.setAlignment(Pos.CENTER);
        labelPane.setPadding(new Insets(50, 0, 50, 0));

        //Set up game part
        HBox gamePane = new HBox();

        CatClass box = new CatClass();
        CatClass box2 = new CatClass();

        box.displayBox();
        box2.displayBox();

        gamePane.getChildren().addAll(box, box2);

        //Set up panes in main pane
        mainPane.setBottom(labelPane);
        mainPane.setCenter(gamePane);

        Scene scene = new Scene(mainPane, 500, 500);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
