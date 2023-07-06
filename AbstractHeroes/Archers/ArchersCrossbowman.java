package AbstractHeroes.Archers;

import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;

public class ArchersCrossbowman extends AbstractArchers {
	protected String special;
	
	public ArchersCrossbowman(String name, int coorX, int coorY) {
		super(name, "Crossbowman", 40, 15, 30, 10,
				10, 2, 5, 15, coorX, coorY);
		this.special = "Fast reload";
	}

	public void printParameters() {
		System.out.println("Type hero: " + typeHero);
		System.out.println("Name hero: " + nameHero);
		System.out.println("Max hit points: " + maxHitPoints);
		System.out.println("Max energy points: " + maxEnergyPoints);
		System.out.println("Damage: " + minDamage + " -> " + maxDamage);
		System.out.println("Armor: " + armor);
		System.out.println("Range attack: " + rangeAttack);
		System.out.println("Initiative: " + initiative);
		System.out.println("Special movement: " + special);
		System.out.println("Position: X: " + coorX() + " Y: " + coorY());
	}
}