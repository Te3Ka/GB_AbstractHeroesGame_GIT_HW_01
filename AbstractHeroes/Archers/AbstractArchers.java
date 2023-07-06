package AbstractHeroes.Archers;

import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;

public abstract class AbstractArchers extends AbstractHeroes {
    protected int maxArrows, currentArrows;
    protected int maxEnergyPoints, currentEnergyPoints;

    public AbstractArchers(String nameHero, String typeHero, int maxHitPoints,
                           int minDamage, int maxDamage, int armor, int rangeAttack, int initiative,
                           int maxArrows, int maxEnergyPoints, int coorX, int coorY) {
        super(nameHero, typeHero, maxHitPoints, minDamage, maxDamage,
                armor, rangeAttack, initiative, coorX, coorY);
        this.maxArrows = this.currentArrows = maxArrows;
        this.maxEnergyPoints = this.currentEnergyPoints = maxEnergyPoints;
    }
    @Override
    public void step(ArrayList<AbstractHeroes> enemies) {
        super.findNearestEnemy(enemies);
    }
}