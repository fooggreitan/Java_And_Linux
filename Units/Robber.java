public class Robber extends InfantClass {

    private int poisons;
    private int maxPoisons;

    public Robber(String name, int hp, int speed, int stamina, int poisons, int maxPoisons) {
        super(name, hp, speed, stamina);
        this.poisons = poisons;
        this.maxPoisons = maxPoisons;
    }
    
    @Override
    public String getInfo() {
        return "Robber";
    }

    @Override
    public void step() {
        System.out.println("Выстрел");
    }
}
