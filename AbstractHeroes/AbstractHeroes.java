package AbstractHeroes;

import Grid.Grid;

import java.util.ArrayList;

public abstract class AbstractHeroes implements InGame {
    protected String nameHero;
    protected String typeHero;
    protected int maxHitPoints, currentHitPoints;
    protected int minDamage;
    protected int maxDamage;
    protected int armor;
    protected int rangeAttack;
    protected int initiative;
    protected boolean dead = false;

    protected Grid place;

    public AbstractHeroes(String nameHero, String typeHero, int maxHitPoints,
                          int minDamage, int maxDamage, int armor, int rangeAttack, int initiative,
                          int coorX, int coorY) {
        this.nameHero = nameHero;
        this.typeHero = typeHero;
        this.maxHitPoints = this.currentHitPoints = maxHitPoints;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.armor = armor;
        this.rangeAttack = rangeAttack;
        this.initiative = initiative;
        place = new Grid(coorX, coorY);
    }

    public void step(ArrayList<AbstractHeroes> enemies, ArrayList<AbstractHeroes> allies) {
    }

    /**
     * Поиск ближайшего противника среди всех противников
     * @param enemies
     */
    public AbstractHeroes findNearestEnemy(ArrayList<AbstractHeroes> enemies) {
        double[] distance = new double[enemies.size()];
        double minDistance = Math.sqrt(Math.pow(10, 2) + Math.pow(50, 2)); // Максимальная дистанция по диагонале сетки
        int minEnemy = 0;
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Math.sqrt(Math.pow(enemies.get(i).coorX() - place.getCoorX(), 2) +
                    Math.pow(enemies.get(i).coorY() - place.getCoorY(), 2));
            if (distance[i] < minDistance) {
                minDistance = distance[i];
                minEnemy = i;
            }
        }
        System.out.println("Ближайший противник для " + getSimpleDescription() +
                "\n>>: " + enemies.get(minEnemy).getSimpleDescription());
        return enemies.get(minEnemy);
    }

    public String getSimpleDescription() {
        return nameHero + " " + typeHero + " HP: " + currentHitPoints + "/" + maxHitPoints + " ";
    }
    @Override
    public int coorX() {
        return place.getCoorX();
    }
    @Override
    public int coorY() {
        return place.getCoorY();
    }

    public void setCurrentHitPoints(int currentHitPoints, int changesHitPoints) {
        if (currentHitPoints - changesHitPoints >= this.maxHitPoints)
            this.currentHitPoints = this.maxHitPoints;
        else
            this.currentHitPoints = currentHitPoints - changesHitPoints;
        if (this.currentHitPoints <= 0) {
            this.currentHitPoints = 0;
            this.dead = true;
        }
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    @Override
    public String getTypeHero() {
        return typeHero;
    }

    public String getNameHero() {
        return nameHero;
    }
    public int getArmor() {
        return armor;
    }

    public int getInitiative() {
        return initiative;
    }

    public boolean isDead() {
        return dead;
    }

    public Grid getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return super.getClass().getSimpleName();
    }
}

