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

    public void step(ArrayList<AbstractHeroes> enemies) {
    }

    public void findNearestEnemy(ArrayList<AbstractHeroes> enemies) {
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
        System.out.println("Ближайший противник для " + getTypeHero() +
                "\n>>: " + enemies.get(minEnemy).getTypeHero());
    }

    public String getTypeHero() {
        return nameHero + " " + typeHero + " " + place.printCoordinates();
    }

    @Override
    public int coorX() {
        return place.getCoorX();
    }

    @Override
    public int coorY() {
        return place.getCoorY();
    }
}

