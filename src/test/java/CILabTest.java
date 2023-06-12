import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CILabTest {

    private  CILabInterface myString;

    @BeforeEach
    void setUp() {
        myString = new CILab();
    }

    @AfterEach
    void tearDown() {
        myString = null;
    }

    @Test
    void detectCapitalUse() {
        fail("Not yet implemented.");
    }
}