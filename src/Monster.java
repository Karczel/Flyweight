import java.awt.*;

public class Monster {
    private Image image;
    private int x;
    private int y;

    public Monster(int x, int y) {
        try {
            this.image = ImageIO.read(new File("Monster.png"))
        } catch (IOException e) {
            System.out.println("Monster.png not found")
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
}