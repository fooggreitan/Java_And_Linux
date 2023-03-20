public class Monk extends BaseHero{
    public Monk(String name, float hp, int speed, int damage, int x, int y) {
        super(name, hp, speed, damage, x, y);
    }
    
    @Override
    public String getInfo() {
        return "Monk";
    }
}
