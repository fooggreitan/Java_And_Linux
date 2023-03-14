public class Peasant extends BaseHero{

    public Peasant(String name, int hp, int speed) {
        super(name, hp, speed);
    }

    @Override
    public String getInfo() {
        return "Peasant";
    }


    @Override
    public void step() {
        System.out.println("Шаг.");
    }

}