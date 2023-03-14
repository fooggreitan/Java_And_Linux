public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest(String name, int hp, int speed, int elixir, int maxElixir) {
        super(name, hp, speed);
        this.elixir = elixir;
        this.maxElixir = maxElixir;
    }
    
    @Override
    public String getInfo() {
        return "Priest";
    }

    @Override
    public void step() {
        System.out.println("Шаг.");
    }

}
