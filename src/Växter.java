public class Växter{

    private String name; //inkapsling
    private double längdiMeter; //inkapsling

    public Växter(String name, double längdiMeter) {
        this.name = name;
        this.längdiMeter = längdiMeter;
    }


    public String getName() {
        return name;
    }

    public double getLängdiMeter() {
        return längdiMeter;
    }

    public double uträkning(){ //polymorfism
        return -1;
    }

}
