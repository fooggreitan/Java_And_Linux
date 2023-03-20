public class Peasant extends BaseHero{

    public Peasant(String name, float hp, int speed, int damage, int x, int y) {
        super(name, hp, speed, damage, x, y);
    }

    @Override
    public String getInfo() {
        return "Peasant";
    }


    // @Override
    // public void step() {
    //     System.out.println("Шаг.");
    //     // TODO Auto-generated method stub
    //     // throw new UnsupportedOperationException("Unimplemented method 'step'");
    // }

}