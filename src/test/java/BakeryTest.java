import models.Bakery;
import models.Cake;
import models.CarrotCake;
import models.ChocolateCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat; // Use assertThat from AssertJ
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BakeryTest {
    Bakery bakery;
    CarrotCake carrotCake;
    ChocolateCake chocolateCake;

    @BeforeEach
    public void setUp() {
        bakery = new Bakery("Annie's Bakes");
        carrotCake = new CarrotCake("Carrot Delight", "carrot flour", 6, false, "carrot zest shavings");
        chocolateCake = new ChocolateCake("Choco Feast", "fiery flour", 8, "chocolate brownie fondant");
    }

    @Test
    public void canDisplayAvailableCakes() {
        // Check if the displayAvailableCakes() method returns 0
        assertThat(bakery.displayAvailableCakes()).isEqualTo(0);
    }

    @Test
    public void canAddAndDisplayCakes() {
        bakery.addCake(carrotCake);
        bakery.addCake(chocolateCake);

        ArrayList<Cake> cakesInBakery = bakery.getStock();

        assertTrue(cakesInBakery.contains(chocolateCake));
        assertTrue(cakesInBakery.contains(carrotCake));
    }

    @Test
    public void canSellCakeAndUpdateTill() {
        Cake chocolateCake = new ChocolateCake("Double Chocolate", "Chocolate Flour", 15, "Chocolate Fudge");
        bakery.addCake(chocolateCake);

        bakery.sellCake(chocolateCake);

        assertEquals(15, bakery.getTill());
    }
}
