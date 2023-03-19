import java.util.ArrayList;

public abstract class ShooterClass extends BaseHero{
    
   int arrows; 

    public ShooterClass(String name, float hp, int speed, int damage, int arrows) {
        super(name, hp, speed, damage);
        this.arrows = arrows;
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends) {
        if(this.arrows > 0 && this.hp > 0) {
            System.out.println("Могу стрелять!");
            for (BaseHero unit : team) {
                if(hp > 0){
                    this.attack(unit, this.damage);
                    // this.arrows--;
                    break;
                }
                else{
                    System.out.println("Нет жизни!");
                }
            }
        }
        
        // else {
        //     System.out.println("Не могу стрелять!");
        // }

        // System.out.println("Осталось стрел:" + String.valueOf(this.arrows));
        System.out.println(toString());
        for (BaseHero unit : friends) {
            if (unit.getInfo().equals("Peasant")) {
                this.arrows--;
                break;
            }
        }
        System.out.println(toString());
    }

        @Override
        public String toString() {
            return "Осталось стрел: " + String.valueOf(this.arrows);
        }

}