public abstract class InfantClass extends BaseHero{
    
    int stamina;

    public InfantClass(String name, float hp, int speed, int damage, int stamina) {
        super(name, hp, speed, damage);
        this.stamina = stamina;
    }

    
}