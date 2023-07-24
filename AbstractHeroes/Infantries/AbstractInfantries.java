package AbstractHeroes.Infantries;
import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;

public abstract class AbstractInfantries extends AbstractHeroes {
    int maxRagePoints;
    int maxEnergyPoints;

    public AbstractInfantries(String nameHero, String typeHero, int maxHitPoints,
                              int minDamage, int maxDamage, int armor, int rangeAttack, int initiative,
                              int maxRagePoints, int maxEnergyPoints, int coorX, int coorY) {
        super(nameHero, typeHero, maxHitPoints, minDamage, maxDamage,
                armor, rangeAttack, initiative, coorX, coorY);
        this.maxRagePoints = maxRagePoints;
        this.maxEnergyPoints = maxEnergyPoints;
    }

    @Override
    public void step(ArrayList<AbstractHeroes> enemies, ArrayList<AbstractHeroes> allies) {
        if (this.isDead() || this.currentHitPoints == 0)
            return;

        AbstractHeroes enemy = super.findNearestEnemy(enemies);
        // Если рядом враг, то атакуем
        if (this.place.calcDistance(enemy.getPlace()) < 2) {
            setDamage(this.minDamage, this.maxDamage, enemy);
            return;
        }

        if (Math.abs(this.coorX() - enemy.coorX()) >= Math.abs(this.coorY() - enemy.coorY())) {
            if (this.coorX() < enemy.coorX()) {
                boolean flag = true;
                int tempX = coorX() + 1;
                for (AbstractHeroes allie : allies) {
                    if (tempX == allie.coorX() && this.coorY() == allie.coorY()) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    this.place.setCoorX(this.coorX(), +1);
            } else if (this.coorX() > enemy.coorX()) {
                boolean flag = true;
                int tempX = coorX() - 1;
                for (AbstractHeroes allie : allies) {
                    if (tempX == allie.coorX() && this.coorY() == allie.coorY()) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    this.place.setCoorX(this.coorX(), -1);
            }
        } else if (this.coorY() < enemy.coorY()) {
            boolean flag = true;
            int tempX = coorY() + 1;
            for (AbstractHeroes allie : allies) {
                if (tempX == allie.coorY() && this.coorX() == allie.coorX()) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                this.place.setCoorY(this.coorY(), +1);
        } else {
            boolean flag = true;
            int tempX = coorY() - 1;
            for (AbstractHeroes allie : allies) {
                if (tempX == allie.coorY() && this.coorX() == allie.coorX()) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                this.place.setCoorY(this.coorY(), -1);
        }
    }
}