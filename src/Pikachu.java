package src;

public class Pikachu extends Monster{
    public Pikachu(int x, int y) {
        super(x, y);
        monsterImage = MonsterImageFactory.getInstance().getImage("src.Pikachu");
    }
}
