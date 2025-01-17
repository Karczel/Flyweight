package src;

public class MonsterImageFactory {
    private static MonsterImageFactory instance;
    private PikachuImage pikachuImage;
    private MewTwoImage mewTwoImage;

    public static MonsterImageFactory getInstance(){
        if(instance == null){
            instance = new MonsterImageFactory();
        }
        return instance;
    }

    private MonsterImageFactory(){
        pikachuImage = new PikachuImage();
        mewTwoImage = new MewTwoImage();
    }

    public MonsterImage getImage(String key){
        if(key.equals("src.Pikachu")){
            return pikachuImage;
        } else if(key.equals("MewTwo")){
            return mewTwoImage;
        }
        return null;
    }
}
