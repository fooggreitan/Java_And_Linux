// import java.util.ArrayList;

public class Crossbowman extends ShooterClass {

    private int ammo;
    private int maxAmmo;

    // public SniperHero(int ammo, int maxAmmo) {
    //     super(String.format("Hero_Sniper #%d", ++SniperHero.number),
    //             SniperHero.r.nextInt(100, 200));
    //     this.maxAmmo = SniperHero.r.nextInt(50, 150);
    //     this.ammo = maxAmmo;
    // }

    public Crossbowman(String name, float hp, int speed, int damage, int arrows, int ammo, int maxAmmo, int x, int y) {
        super(name, hp, speed, damage, arrows, x, y);
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }
    
    @Override // переобпределение
    public String getInfo() {
        return "Crossbowman";
    }

    // @Override
    // public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends) {
    //     // Если жизнь равна нулю или стрел нет, завершить обработку.
    //     if (this.hp <= 0 || this.arrows <= 0) {
    //         return;
    //     }
    // }

    // @Override
    // public void step() {
    //     System.out.println("Выстрел");
    //     // TODO Auto-generated method stub
    //     // throw new UnsupportedOperationException("Unimplemented method 'step'");
    // }
}
