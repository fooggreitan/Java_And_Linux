public abstract class BaseHero implements UnitInterface {

    protected String name;
    protected int hp;
    protected int speed;
    protected int maxHp;

    public BaseHero(String name, int hp, int speed) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.maxHp = hp;
    }

    @Override
    public void step() {
    }

    @Override
    public String getInfo() {
        return "";
    }
}
