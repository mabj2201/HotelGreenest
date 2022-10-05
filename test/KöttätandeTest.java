import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeTest {

    Köttätande k = new Köttätande("Meatloaf", 0.7);

    @Test
    void uträkning() {
        assert(k.uträkning() == 0.24);
        assert!(k.uträkning() == 0.267);
    }
}