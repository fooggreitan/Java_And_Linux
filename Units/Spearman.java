// import java.util.ArrayList;

public class Spearman extends ShooterClass {
    public Spearman(String name, float hp, int speed, int damage, int arrows, int x, int y) {
        super(name, hp, speed, damage, arrows, x, y);
    }

    @Override
    public String getInfo() {
       return "Spearman";
    }

    // @Override
    // public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends) {
    //     // Если жизнь равна нулю или стрел нет, завершить обработку.
    //     // if (this.hp > 0 || this.arrows > 0) {
    //     //     return;
    //     // }
    // }
}
