public class SniperHero extends ShooterClass {

    private int ammo;
    private int maxAmmo;

    public SniperHero(String name, int hp, int speed, int ammo, int maxAmmo) {
        super(name, hp, speed);
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }
    
    @Override
    public String getInfo() {
        return "SniperHero";
    }

    @Override
    public void step() {
        System.out.println("Выстрел");
    }
}
