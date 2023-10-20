import models.CarrotCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarrotCakeTest {
    CarrotCake carrotCake;

    @BeforeEach
    public void setUp(){
        carrotCake = new CarrotCake("Carrot Cake", "all-purpose flour", 3, true, "cream cheese frosting");
    }
    @Test
    public void getName(){
        assertThat(carrotCake.getName()).isEqualTo("Carrot Cake");

    }
    @Test
    public void getBaseFlour(){
        assertThat(carrotCake.getBaseFlour()).isEqualTo("all-purpose flour");

    }
    @Test
    public void getCost(){
        assertThat(carrotCake.getCost()).isEqualTo(3);

    }

    @Test
    public void checkIfHealthier(){
        assertThat(carrotCake.isHealthier()).isEqualTo(true);

    }
    @Test
    public void hasTopping(){
        assertThat(carrotCake.hasTopping()).isEqualTo("cream cheese frosting");

    }
//    @Test
//    public void addTopping(){
//        assertThat(carrotCake.hasTopping()).isEqualTo(carrotCake)
//
//    }
}
