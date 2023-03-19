public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    // public Priest() {
    //     super(String.format("Hero_Priest #%d", ++Magician.number),
    //             Magician.r.nextInt(100, 200));
    //     this.maxElixir = Magician.r.nextInt(50, 150);
    //     this.elixir = maxElixir;
    // }

    public Priest(String name, float hp, int speed, int damage, int elixir, int maxElixir) {
        super(name, hp, speed, damage);
        this.elixir = elixir;
        this.maxElixir = maxElixir;
    }
    
    @Override
    public String getInfo() {
        return "Priest";
    }

    // @Override
    // public void step() {
    //     System.out.println("Шаг.");
    //     // TODO Auto-generated method stub
    //     // throw new UnsupportedOperationException("Unimplemented method 'step'");
    // }

}
