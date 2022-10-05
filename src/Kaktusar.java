public class Kaktusar extends Växter implements IVäxter {
    private final double mineralvatten = 0.2; // inkapsling

    final VäxtVätska kaktusvätska = VäxtVätska.MINERALVATTEN; //Enums

    public Kaktusar(String name, double längdiMeter) {
        super(name, längdiMeter);
    }

    public double getMineralvatten() {
        return mineralvatten;
    }

    @Override //Interface
    public String vätska() {
        return "Växten " + getName() + " Vill ha " + getMineralvatten() + " liter " + kaktusvätska.toString().toLowerCase();
    }
}
