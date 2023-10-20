package interfaces;

import models.Cake;

import java.util.ArrayList;

public interface ISell {
    int displayAvailableCakes();
    void addCake(Cake cake);
    void removeCake(Cake cake);
    void sellCake(Cake cake);

}
