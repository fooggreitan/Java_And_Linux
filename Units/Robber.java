public class Robber extends InfantClass {

    private int poisons;
    private int maxPoisons;

    // public SniperHero(int ammo, int maxAmmo) {
    //     super(String.format("Hero_Sniper #%d", ++SniperHero.number),
    //             SniperHero.r.nextInt(100, 200));
    //     this.maxAmmo = SniperHero.r.nextInt(50, 150);
    //     this.ammo = maxAmmo;
    // }

    public Robber(String name, float hp, int speed, int damage, int stamina, int poisons, int maxPoisons) {
        super(name, hp, speed, damage, stamina);
        this.poisons = poisons;
        this.maxPoisons = maxPoisons;
    }
    
    @Override
    public String getInfo() {
        return "Robber";
    }

    // @Override
    // public void step() {
    //     System.out.println("Выстрел");
    //     // TODO Auto-generated method stub
    //     // throw new UnsupportedOperationException("Unimplemented method 'step'");
    // }
}
