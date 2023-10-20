import models.ChocolateCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChocolateCakeTest {
    ChocolateCake chocolateCake;

    @BeforeEach
    public void setUp(){
        chocolateCake = new ChocolateCake("Chocolate Cake", "self-raising flour", 5, "chocolate goulash");
    }

    @Test
    public void getName(){
        assertThat(chocolateCake.getName()).isEqualTo("Chocolate Cake");

    }
    @Test
    public void getBaseFlour(){
        assertThat(chocolateCake.getBaseFlour()).isEqualTo("self-raising flour");

    }
    @Test
    public void getCost(){
        assertThat(chocolateCake.getCost()).isEqualTo(5);

    }

    @Test
    public void getFilling(){
        assertThat(chocolateCake.getFilling()).isEqualTo("chocolate goulash");
    }
}
