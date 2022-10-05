public class Köttätande extends Växter implements IVäxter {

    private final double proteindryckBas = 0.1; //inkapsling
    private final double proteindryck = 0.2; // inkapsling

    final VäxtVätska köttätandeVätska = VäxtVätska.PROTEINDRYCK; //Enums

    public Köttätande(String name, double längdiMeter) {
        super(name, längdiMeter);
    }
    public double getProteindryckBas() {
        return proteindryckBas;
    }
    public double getProteindryck() {
        return proteindryck;
    }

    @Override
    public double uträkning(){ //polymorfism
        return getProteindryckBas() + getProteindryck() *getLängdiMeter();
    }

    @Override //interface
    public String vätska() {
        return "Växten " + getName() + " Vill ha " + uträkning() + " liter " + köttätandeVätska.toString().toLowerCase();
    }
}
