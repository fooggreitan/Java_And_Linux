import java.util.ArrayList;

public class SniperHero extends ShooterClass {

    private int ammo;
    private int maxAmmo;

    // public SniperHero(int ammo, int maxAmmo) {
    //     super(String.format("Hero_Sniper #%d", ++SniperHero.number),
    //             SniperHero.r.nextInt(100, 200));
    //     this.maxAmmo = SniperHero.r.nextInt(50, 150);
    //     this.ammo = maxAmmo;
    // }

    public SniperHero(String name, float hp, int speed, int damage, int arrows, int ammo, int maxAmmo) {
        super(name, hp, speed, damage, arrows);
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }
    
    @Override
    public String getInfo() {
        return "SniperHero";
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
