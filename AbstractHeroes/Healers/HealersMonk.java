package AbstractHeroes.Healers;

import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;

public class HealersMonk extends AbstractHealers {
	String special;
	
	public HealersMonk(String name, int coorX, int coorY) {
		super(name, "Monk", 30, 1, 5, 2,
				1, 6, 100, 10, coorX, coorY);
		this.special = "Meditation";
	}

	public void printParameters() {
		System.out.println("Type hero: " + typeHero);
		System.out.println("Name hero: " + nameHero);
		System.out.println("Max hit points: " + maxHitPoints);
		System.out.println("Max mana points: " + maxManaPoints);
		System.out.println("Damage: " + maxDamage);
		System.out.println("Armor: " + armor);
		System.out.println("Range attack: " + rangeAttack);
		System.out.println("Initiative: " + initiative);
		System.out.println("Special movement: " + special);
		System.out.println("Position: X: " + coorX() + " Y: " + coorY());
	}
}