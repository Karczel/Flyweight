import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Monster {
    private Image image;
    private int x;
    private int y;

    public Monster(int x, int y) {
        try {
            this.image = ImageIO.read(new File("Monster.png"));
        } catch (IOException e) {
            System.out.println("Monster.png not found");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }


}