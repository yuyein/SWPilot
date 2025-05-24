package project_X.process3.ex4;

public class EnergyManager {
    private int energy;

    public int addAll(int s, int w, int g){
        setEnergy(s+w+g);
        return getEnergy();
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }
}
