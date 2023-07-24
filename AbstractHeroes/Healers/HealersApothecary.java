package AbstractHeroes.Healers;

import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;

public class HealersApothecary extends AbstractHealers {
	String special;
	
	public HealersApothecary(String name, int coorX, int coorY) {
		super(name, "Apothecary", 50, 0, 3, 0,
				1, 5, 70, 15, coorX, coorY);
		this.special = "Fog of Healing";
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