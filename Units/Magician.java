public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    // public Magician() {
    //     super(String.format("Hero_Magician #%d", ++Magician.number),
    //             Magician.r.nextInt(100, 200));
    //     this.maxMana = Magician.r.nextInt(50, 150);
    //     this.mana = maxMana;
    // }

    public Magician(String name, float hp, int speed, int damage, int mana, int maxMana) {
        super(name, hp, speed, damage);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    @Override
    public String getInfo() {
        return "Magician";
    }

    // @Override
    // public void step() {
    //     System.out.println("Фокус");
    //     // TODO Auto-generated method stub
    //     // throw new UnsupportedOperationException("Unimplemented method 'step'");
    // }
}