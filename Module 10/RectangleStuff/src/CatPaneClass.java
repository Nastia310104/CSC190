import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Scale;

public class CatPaneClass extends Pane{
    public static final String[] CAT_NAMES = {
            "Black", "Brown", "Ginger", "Gray", "Light Brown", "Light Gray", "Pink", "White"
    };

    public static final int BOXED_CAT = 12;
    public static final int HANGING_CAT = 4;
    public static final int WALKING_CAT = 0;
    public static final int IDLING_CAT = 5;

    private static final int FRAME_SIZE = 32;

    public static final String IMAGE_PATH = "src/images/cats/";
    public static final String IMAGE_TYPE_PNG = ".png";

    public final String BOX_PATH = "src/images/cats/Box.png";

    public boolean isSelected = false;

    public CatPaneClass(String name) {
        this.setMinSize(100, 100);

        ImageView spritesheet = new ImageView(new Image(IMAGE_PATH + name + IMAGE_TYPE_PNG));
        displayCat(spritesheet);
    }

    public CatPaneClass() {
        this("Black");
    }

    public void displayCat(ImageView spritesheet) {
        Rectangle2D view = new Rectangle2D(0, IDLING_CAT * FRAME_SIZE, FRAME_SIZE, FRAME_SIZE);
        Rectangle2D hangView = new Rectangle2D(0, HANGING_CAT * FRAME_SIZE, FRAME_SIZE, FRAME_SIZE);

        spritesheet.setViewport(view);
        spritesheet.setScaleX(4);
        spritesheet.setScaleY(4);

        spritesheet.setOnMouseClicked(e -> {
            spritesheet.setViewport(hangView);
        });

        this.getChildren().clear();
        this.getChildren().add(spritesheet);
    }

    public static void dragCat(ImageView spritesheet) {
        Rectangle2D hangView = new Rectangle2D(0, HANGING_CAT * FRAME_SIZE, FRAME_SIZE, FRAME_SIZE);
    }

    public static void selectCat(String name) {

    }
}
