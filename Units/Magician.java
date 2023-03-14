public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician(String name, int hp, int speed, int mana, int maxMana) {
        super(name, hp, speed);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    @Override
    public String getInfo() {
        return "Magician";
    }

    @Override
    public void step() {
        System.out.println("Фокус");
    }
}