package src;

public abstract class Monster {
    protected MonsterImage monsterImage;
    private int x;
    private int y;

    public Monster(int x, int y) {
        this.x = x;
        this.y = y;
        monsterImage = MonsterImageFactory.getInstance().getImage(getClass().getName());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public MonsterImage getMonsterImage() {
        return monsterImage;
    }


}