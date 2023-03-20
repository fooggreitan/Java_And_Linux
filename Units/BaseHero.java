import java.util.ArrayList;
import java.util.Random;
 
public abstract class BaseHero implements UnitInterface {
    // protected static int number;
    // protected static Random r;
    protected Random rnd = new Random();
    
    protected String name;
    protected float hp;
    protected int speed;
    protected int maxHp;
    protected int damage;
    protected Position position;
    // protected final String NAME; 

    // static {
    //     BaseHero.number = 0;
    //     BaseHero.r = new Random();
    // }

    // public void getNAME() {
    //     System.out.println(NAME);
    // }

    public BaseHero(String name, float hp, int speed, int damage, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        position = new Position(x, y);
        // this.maxHp = hp;
    }

    // public BaseHero() {
    //     this(String.format("Hero_Priest #%d", ++BaseHero.number),
    //             BaseHero.r.nextInt(100, 200));
    // }

    // public String getInfo() {
    //     return String.format("Name: %s  Hp: %d  Type: %s",
    //             this.name, this.hp, this.getClass().getSimpleName());
    // }

    public BaseHero(String name2, Float hp2, int speed2, int damage2) {
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> team2) {
    }

    @Override
    public String getInfo() {
        return "";
    }

    public int getSpeed() {
        return this.speed;
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } 
        else this.hp = 0;
    }

    public void attack(BaseHero target, int damage) {
        int causedDamage = rnd.nextInt(1, damage);
        System.out.printf("%s attack %s\t", this.getClass().getSimpleName(), target.getClass().getSimpleName());
        System.out.printf("Power of knock = %d\n", causedDamage);
        System.out.printf("%s hp= %.2f\n", target.getClass().getSimpleName(), target.hp);
        target.getDamage(causedDamage);
    }
    // public String getName() {
    //     return name;
    // }

    // public Random getRnd() {
    //     return rnd;
    // }

    public String getName() {
        return name;
    }

    public float getHp() {
        return hp;
    }

    // public int getMaxHp() {
    //     return maxHp;
    // }

    // public int getDamage() {
    //     return damage;
    // }

    // public int getHp() {
    //     return hp;
    // }

    // public void healed(int Hp) {
    //     this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    // }

    // public void GetDamage(int damage) {
    //     if (this.hp - damage > 0) {
    //         this.hp -= damage;
    //     }
    //     // else { die(); }
    // }

    // public void Attack(BaseHero target) {
    //     int damage = BaseHero.r.nextInt(10, 20);
    //     target.GetDamage(damage);
    // }
}
