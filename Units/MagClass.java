public abstract class MagClass extends BaseHero{

    int mana;
    
    public MagClass(String name, float hp, int speed, int damage, int mana) {
        super(name, hp, speed, damage);
        this.mana = mana;
    }
    
}
