package AbstractHeroes.Supports;

import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;

public abstract class AbstractSupports extends AbstractHeroes {
    int maxEnergyPoints;
    int maxSupportPoints;

    public AbstractSupports(String nameHero, String typeHero, int maxHitPoints,
                            int minDamage, int maxDamage, int armor, int rangeAttack, int initiative,
                            int maxEnergyPoints, int maxSupportPoints, int coorX, int coorY) {
        super(nameHero, typeHero, maxHitPoints, minDamage, maxDamage,
                armor, rangeAttack, initiative, coorX, coorY);
        this.maxEnergyPoints = maxEnergyPoints;
        this.maxSupportPoints = maxSupportPoints;
    }

    @Override
    public void step(ArrayList<AbstractHeroes> enemies, ArrayList<AbstractHeroes> allies) {
        super.findNearestEnemy(enemies);
    }
}