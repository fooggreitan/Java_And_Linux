public class Crossbowman extends ShooterClass {

    private int ammo;
    private int maxAmmo;

    public Crossbowman(String name, int hp, int speed, int ammo, int maxAmmo) {
        super(name, hp, speed);
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }
    
    @Override // переобпределение
    public String getInfo() {
        return "Crossbowman";
    }

    @Override
    public void step() {
        System.out.println("Выстрел");
    }
}
