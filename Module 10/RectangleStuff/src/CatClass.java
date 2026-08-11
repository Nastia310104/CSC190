import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CatClass extends Pane {
    public final String BOX_PATH = "src/images/cats/Box.png";

    public CatClass() {
    }

    public void displayBox() {
        ImageView emptyBox = new ImageView(new Image(BOX_PATH));
        emptyBox.setScaleX(4);
        emptyBox.setScaleY(4);

        this.getChildren().clear();
        this.getChildren().add(emptyBox);
    }
}
