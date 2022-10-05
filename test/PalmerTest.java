import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmerTest {

    Palmer p = new Palmer("Laura", 5);

    @Test
    void testuträkningPalm() {
        assert(p.uträkning() == 2.5);
        assert!(p.uträkning() == 2.6);
    }

}