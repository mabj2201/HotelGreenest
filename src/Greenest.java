import javax.swing.*;

public class Greenest {

    public static void main(String[] arg) {

        Palmer laura = new Palmer("Laura", 5);
        Palmer putte = new Palmer("Putte", 1);
        Köttätande meatloaf = new Köttätande("Meatloaf", 0.7);
        Kaktusar igge = new Kaktusar("Igge", 0.20);

        while (true) {
            try {

                String växtSomSkaHaVätska = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

                if (växtSomSkaHaVätska.equalsIgnoreCase(laura.getName())) {
                    JOptionPane.showMessageDialog(null, laura.vätska());
                } else if (växtSomSkaHaVätska.equalsIgnoreCase(meatloaf.vätska())) {
                    JOptionPane.showMessageDialog(null, meatloaf.vätska());
                } else if (växtSomSkaHaVätska.equalsIgnoreCase(igge.getName())) {
                    JOptionPane.showMessageDialog(null, igge.vätska());
                } else if (växtSomSkaHaVätska.equalsIgnoreCase(putte.getName())) {
                    JOptionPane.showMessageDialog(null, putte.vätska());
                } else if (växtSomSkaHaVätska.isBlank()){
                    JOptionPane.showMessageDialog(null,"Du lämnade blankt! Försök igen.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Det finns ingen växt med det namnet");
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Avslutar...");
                System.exit(0);
            }
        }
    }
}
