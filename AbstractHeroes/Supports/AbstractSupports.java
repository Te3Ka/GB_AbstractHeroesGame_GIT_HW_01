package AbstractHeroes.Supports;

import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;

public abstract class AbstractSupports extends AbstractHeroes {
    int maxEnergyPoints, currentEnergyPoints;
    int maxSupportPoints, currentSupportPoints;
    protected boolean busyness;


    public AbstractSupports(String nameHero, String typeHero, int maxHitPoints,
                            int minDamage, int maxDamage, int armor, int rangeAttack, int initiative,
                            int maxEnergyPoints, int maxSupportPoints, int coorX, int coorY) {
        super(nameHero, typeHero, maxHitPoints, minDamage, maxDamage,
                armor, rangeAttack, initiative, coorX, coorY);
        this.maxEnergyPoints = this.currentEnergyPoints = maxEnergyPoints;
        this.maxSupportPoints = this.currentSupportPoints = maxSupportPoints;
        this.busyness = false;
    }

    @Override
    public void step(ArrayList<AbstractHeroes> enemies, ArrayList<AbstractHeroes> allies) {
        if (this.dead || this.currentSupportPoints == 0 || this.currentEnergyPoints == 0 || this.currentHitPoints == 0)
            return;
        this.busyness = false;
    }

    public void setCurrentSupportPoints() {
        if (this.currentSupportPoints > 0)
            this.currentSupportPoints--;
    }

    public void setBusyness(boolean busyness) {
        this.busyness = busyness;
    }

    public boolean isBusyness() {
        return busyness;
    }
}