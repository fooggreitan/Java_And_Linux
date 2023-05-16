public class Prizent extends BaseHero {
    public Prizent(int iD, String name, int count, int probabilityLoss) {
        super(iD, name, count, probabilityLoss);
    }

    @Override
    public String toString() {
        return "Prizent [ID=" + toyId + ", name=" + toyName + ", count=" + toyCount + ", probabilityLoss=" + toyFrequency + "%" +"]";
    }
}
