package AbstractHeroes.Wizards;

import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;
import java.util.Random;

public abstract class AbstractWizards extends AbstractHeroes {
    int maxMana, currentMana;
    int numSpells;

    public AbstractWizards(String nameHero, String typeHero, int maxHitPoints,
                           int minDamage, int maxDamage, int armor, int rangeAttack, int initiative,
                           int maxMana, int numSpells, int coorX, int coorY) {
        super(nameHero, typeHero, maxHitPoints, minDamage, maxDamage,
                armor, rangeAttack, initiative, coorX, coorY);
        this.maxMana = this.currentMana = maxMana;
        this.numSpells = numSpells;
    }

    @Override
    public void step(ArrayList<AbstractHeroes> enemies, ArrayList<AbstractHeroes> allies) {
        if (this.dead || this.currentHitPoints == 0)
            return;
        if (this.armor >= 2)
            this.armor -= 5;
        setCurrentMana(3);
        AbstractHeroes enemy = super.findNearestEnemy(enemies);
        if (this.typeHero.equals("Mage")) {
            switch (new Random().nextInt(this.numSpells)) {
                case 0: {
                    // Телепорт
                    break;
                }
                case 1: {
                    // Огненный шар
                    setDamage(enemy.getCurrentHitPoints() / 8, enemy.getMaxHitPoints() / 8, enemy);
                    this.setCurrentMana(-8);
                    break;
                }
                case 2: {
                    // Ледяной шар
                    setDamage(enemy.getCurrentHitPoints() / 10, enemy.getMaxHitPoints() / 10, enemy);
                    this.setCurrentMana(-5);
                    break;
                }
                case 3: {
                    // Ветряное копьё
                    setDamage(enemy.getCurrentHitPoints() / 15,
                            enemy.getMaxHitPoints() / 15,
                            enemy);
                    this.setCurrentMana(-5);
                    // добавить смещение
                    break;
                }
                case 4: {
                    // Землятресение
                    // Добавить урон по нескольким противникам, стоящими рядом.
                    setDamage(enemy.getCurrentHitPoints() / 20, enemy.getMaxHitPoints() / 20, enemy);
                    this.setCurrentMana(-10);
                    break;
                }
                case 5: {
                    // Магическая броня
                    this.armor += 10;
                    this.setCurrentMana(-10);
                    break;
                }
                case 6: {
                    // Усиление
                    // Реализовать усиление союзника
                    break;
                }
                case 7: {
                    // Невидимость
                    // Маг не может получить урон в следующий ход.
                    break;
                }
            }
        } else if (this.typeHero.equals("Witch")) {
            switch (new Random().nextInt(this.numSpells)) {
                case 0: {
                    // Полёт летучей мыши
                    // Пермещеяется на 3 клетки подальше от противника
                    break;
                }
                case 1: {
                    // Укус вампира
                    setDamage(5, 10, enemy);
                    setHeal(5, 10, this);
                    this.setCurrentMana(-3);
                    break;
                }
                case 2: {
                    // Ослабление
                    // Реализовать ослабление атаки противника на пару ходов.
                    break;
                }
                case 3: {
                    // Молния
                    // Реализовать цепную молнию на 3 цели с уменьшением урона каждой последующей цели.
                    break;
                }
            }
        }
        return;
    }

    public void setCurrentMana(int currentMana) {
        if (this.currentMana + currentMana > this.maxMana)
            this.currentMana = this.maxMana;
        else
            this.currentMana += currentMana;
    }
}