public class Palmer extends Växter implements IVäxter {

    private final double kranvatten = 0.5; // inkaplsling
    final VäxtVätska palmVätska = VäxtVätska.KRANVATTEN; //Enums

    public Palmer(String name, double längdiMeter) {
        super(name, längdiMeter);
    }
    public double getKranvatten() {
        return kranvatten;
    }

    @Override
    public double uträkning(){ //polymorfism
        return getKranvatten()*getLängdiMeter();
    }

    @Override //Interface
    public String vätska() {
        return "Växten " + getName() + " Vill ha " + uträkning() + " liter " + palmVätska.toString().toLowerCase();
    }
}
