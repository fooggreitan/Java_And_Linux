public class Peasant extends BaseHero{

    public Peasant(String name, float hp, int speed, int damage) {
        super(name, hp, speed, damage);
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