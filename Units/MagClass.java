public abstract class MagClass extends BaseHero{

    int mana;
    
    public MagClass(String name, int hp, int speed, int mana) {
        super(name, hp, speed);
        this.mana = mana;
    }
    
}
