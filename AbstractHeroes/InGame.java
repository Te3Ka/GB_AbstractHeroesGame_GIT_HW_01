package AbstractHeroes;

import java.util.ArrayList;

public interface InGame {
    void step(ArrayList<AbstractHeroes> enemies, ArrayList<AbstractHeroes> allies);
    String getTypeHero();
    int coorX();
    int coorY();
}
