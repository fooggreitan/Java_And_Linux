public abstract class InfantClass extends BaseHero{
    
    int stamina;

    public InfantClass(String name, int hp, int speed, int stamina) {
        super(name, hp, speed);
        this.stamina = stamina;
    }

    
}