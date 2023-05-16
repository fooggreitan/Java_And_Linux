import java.util.ArrayList;
import java.util.Random;
 
public abstract class BaseHero{
    protected Random rnd = new Random();
    
    protected int toyId;
    protected String toyName;
    protected int toyCount;
    protected int toyFrequency;

    public BaseHero(int toyId, String toyName, int toyCount, int toyFrequency) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.toyCount = toyCount;
        this.toyFrequency = toyFrequency;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rnd == null) ? 0 : rnd.hashCode());
        result = prime * result + toyId;
        result = prime * result + ((toyName == null) ? 0 : toyName.hashCode());
        result = prime * result + toyCount;
        result = prime * result + toyFrequency;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BaseHero other = (BaseHero) obj;
        if (rnd == null) {
            if (other.rnd != null)
                return false;
        } else if (!rnd.equals(other.rnd))
            return false;
        if (toyId != other.toyId)
            return false;
        if (toyName == null) {
            if (other.toyName != null)
                return false;
        } else if (!toyName.equals(other.toyName))
            return false;
        if (toyCount != other.toyCount)
            return false;
        if (toyFrequency != other.toyFrequency)
            return false;
        return true;
    }

    public Random getRnd() {
        return rnd;
    }

    public int getToyId() {
        return toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public int getToyCount() {
        return toyCount;
    }

    public int getToyFrequency() {
        return toyFrequency;
    }
}
