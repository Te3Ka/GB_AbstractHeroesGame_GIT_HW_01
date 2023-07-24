package AbstractHeroes.Healers;

import AbstractHeroes.AbstractHeroes;
import AbstractHeroes.Supports.AbstractSupports;
import AbstractHeroes.Supports.SupportsWisp;

import java.util.ArrayList;

public abstract class AbstractHealers extends AbstractHeroes {
    int maxManaPoints, currentManaPoints;
    int healing;

    public AbstractHealers(String nameHero, String typeHero, int maxHitPoints,
                           int minDamage, int maxDamage, int armor, int rangeAttack, int initiative,
                           int maxManaPoints, int healing, int coorX, int coorY) {
        super(nameHero, typeHero, maxHitPoints, minDamage, maxDamage,
                armor, rangeAttack, initiative, coorX, coorY);
        this.maxManaPoints = currentManaPoints = maxManaPoints;
        this.healing = healing;
    }

    @Override
    public void step(ArrayList<AbstractHeroes> enemies, ArrayList<AbstractHeroes> allies) {
        if (this.isDead() || this.currentManaPoints == 0)
            return;

        if (this.currentManaPoints < this.maxManaPoints) {
            if (this.currentManaPoints + 1 >= this.maxManaPoints)
                this.currentManaPoints = this.maxManaPoints;
            else
                this.currentManaPoints += 1;
        }

        AbstractHeroes allayMinHitPoints = findAllyMinHitPoints(allies);
        allayMinHitPoints.setHeal(healing, healing, allayMinHitPoints);
        for (AbstractHeroes wisp : allies) {
            if (wisp.getTypeHero().equals("Wisp") &&
                    !wisp.isDead() &&
                    !((AbstractSupports) (wisp)).isBusyness()) {
                ((AbstractSupports) (wisp)).setCurrentSupportPoints();
                ((AbstractSupports) (wisp)).setBusyness(true);
            }
        }
        this.currentManaPoints -= this.healing / 2;
    }

    public AbstractHeroes findAllyMinHitPoints(ArrayList<AbstractHeroes> allies) {
        int maxDifferenceHitPoints = 0;
        int index = 0;
        for (AbstractHeroes hero : allies) {
            if (hero.isDead() || hero.getCurrentHitPoints() <= 0)
                break;
            else if (!hero.isDead() || hero.getCurrentHitPoints() > 0) {
                if (maxDifferenceHitPoints < hero.getMaxHitPoints() - hero.getCurrentHitPoints()) {
                    index = allies.indexOf(hero);
                    maxDifferenceHitPoints = hero.getMaxHitPoints() - hero.getCurrentHitPoints();
                }
            }
        }
        if (maxDifferenceHitPoints == 0) {
            return this;
        }
        return allies.get(index);
    }
}