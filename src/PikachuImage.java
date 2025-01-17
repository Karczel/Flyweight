package src;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class PikachuImage extends MonsterImage{
    public PikachuImage() {
        try {
            imageData = ImageIO.read(new File("Pikachu.png"));
        } catch (IOException e) {
            System.out.println("src.Pikachu.png not found");
        }
    }
}
