public abstract class MagClass extends BaseHero{

    int mana;
    
    public MagClass(String name, float hp, int speed, int damage, int mana, int x, int y) {
        super(name, hp, speed, damage, x, y);
        this.mana = mana;
    }
    
}
