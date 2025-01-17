package src;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class MewTwoImage extends MonsterImage{
    public MewTwoImage() {
        try {
            imageData = ImageIO.read(new File("MewTwo.png"));
        } catch (IOException e) {
            System.out.println("MewTwo.png not found");
        }
    }
}
