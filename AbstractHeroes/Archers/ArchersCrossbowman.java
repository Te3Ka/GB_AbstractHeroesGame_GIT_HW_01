package AbstractHeroes.Archers;

import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;

public class ArchersCrossbowman extends AbstractArchers {
	protected String special;
	
	public ArchersCrossbowman(String name, int coorX, int coorY) {
		super(name, "Crossbowman", 40, 15, 30, 0,
				10, 8, 50, 15, coorX, coorY);
		this.special = "Fast reload";
	}

	public void printParameters() {
		System.out.println("Type hero: " + typeHero);
		System.out.println("Name hero: " + nameHero);
		System.out.println("Max hit points: " + maxHitPoints);
		System.out.println("Current hit points: " + currentHitPoints);
		System.out.println("Max energy points: " + maxEnergyPoints);
		System.out.println("Current energy points: " + currentEnergyPoints);
		System.out.println("Damage: " + minDamage + " -> " + maxDamage);
		System.out.println("Armor: " + armor);
		System.out.println("Range attack: " + rangeAttack);
		System.out.println("Initiative: " + initiative);
		System.out.println("Max Arrows: " + maxArrows);
		System.out.println("Current Arrows: " + currentArrows);
		System.out.println("Special movement: " + special);
		System.out.println("Position: X: " + coorX() + " Y: " + coorY());
	}
}