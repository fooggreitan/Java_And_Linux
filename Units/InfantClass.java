public abstract class InfantClass extends BaseHero{
    
    int stamina;

    public InfantClass(String name, float hp, int speed, int damage, int stamina,  int x, int y) {
        super(name, hp, speed, damage, x, y);
        this.stamina = stamina;
    }

    
}