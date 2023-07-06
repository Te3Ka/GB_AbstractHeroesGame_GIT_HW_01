package AbstractHeroes;

import java.util.ArrayList;

public interface InGame {
    void step(ArrayList<AbstractHeroes> enemies);
    String getTypeHero();
    int coorX();
    int coorY();
}
