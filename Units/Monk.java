public class Monk extends BaseHero{
    public Monk(String name, float hp, int speed, int damage) {
        super(name, hp, speed, damage);
    }
    
    @Override
    public String getInfo() {
        return "Monk";
    }
}
