package AbstractHeroes.Archers;

import AbstractHeroes.AbstractHeroes;
import AbstractHeroes.Supports.AbstractSupports;
import AbstractHeroes.Supports.SupportsPeasant;

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

    /**
     * Порядок хода для класса Лучников
     * @param enemies
     */
    @Override
    public void step(ArrayList<AbstractHeroes> enemies, ArrayList<AbstractHeroes> allies) {
        //System.out.println("!! Ходит " + nameHero + " " + typeHero);
        if (this.dead || this.currentArrows == 0)
            return;
        AbstractHeroes nearestEnemy = super.findNearestEnemy(enemies);
        //System.out.println("Arrows: " + currentArrows);
        middleDamageShoot(nearestEnemy);
        for (AbstractHeroes peasant: allies) {
            if (peasant.getTypeHero().equals("Peasant") &&
                !peasant.isDead() &&
                !((AbstractSupports)(peasant)).isBusyness()) {
                    ((AbstractSupports)(peasant)).setCurrentSupportPoints();
                    ((AbstractSupports)(peasant)).setBusyness(true);
                    return;
            }
        }
        this.currentArrows--;
        //System.out.println("Arrows: " + currentArrows);
    }

    public void middleDamageShoot(AbstractHeroes enemy) {
        int middleDamage = (this.minDamage + this.maxDamage) / 2 - enemy.getArmor();
        //System.out.println("---" + nameHero + " " + typeHero + " Наносит урон в " + middleDamage + " " +
        //        enemy.getNameHero() + " " + enemy.getTypeHero());
        enemy.setCurrentHitPoints(enemy.getCurrentHitPoints(), middleDamage);
    }
}