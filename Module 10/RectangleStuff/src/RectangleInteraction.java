import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class RectangleInteraction extends Application {
    //TODO: make an interface

    public void start(Stage stage) {

        ComboBox<String> catSelectionMenu = new ComboBox<>();
        catSelectionMenu.getItems().addAll(CatPaneClass.CAT_NAMES);

        Label catSelection = new Label("Select your hero:", catSelectionMenu);
        catSelection.setContentDisplay(ContentDisplay.RIGHT);
        catSelection.setMinHeight(100);

        BorderPane pane = new BorderPane();

        CatPaneClass catPane = new CatPaneClass();


//        catSelectionMenu.setOnAction(e -> {
//            flowPane.getChildren().add(new CatPaneClass(catSelectionMenu.getValue()));
//        });

        if (!catPane.isSelected) {
            catSelectionMenu.setOnAction(e -> {

            });
        }

//        pane.setTop(flowPane);
        pane.setBottom(catSelection);
        BorderPane.setAlignment(catSelection, Pos.TOP_CENTER);

        Scene scene = new Scene(pane, 500,500);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}