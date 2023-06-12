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
    void detectAllLettersAreCapitals(){
        myString.setString("TEST");
        assertTrue((myString.detectCapitalUse()));
    }

    @Test
    void detectAllLettersAreNOTCapitals(){
        myString.setString("test");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    void detectOnlyFirstLetterIsCapital1() {
        myString.setString("Test");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    void detectOnlyFirstLetterIsCapital2() {
        myString.setString("TeSt");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    void detectOnlyFirstLetterIsCapital3() {
        myString.setString("teSt");
        assertFalse(myString.detectCapitalUse());
    }

}