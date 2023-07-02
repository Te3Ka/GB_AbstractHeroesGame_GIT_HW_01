import AbstractHeroes.AbstractHeroes;
import AbstractHeroes.Archers.*;
import AbstractHeroes.Healers.*;
import AbstractHeroes.Infantries.*;
import AbstractHeroes.NamesHeroes;
import AbstractHeroes.Supports.*;
import AbstractHeroes.Wizards.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class GameAbstractHeroes {
	static Random random = new Random();

	public static void main(String[] args) {

		ArrayList<AbstractHeroes> lightSide = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lightSide.add(newRandomHero());
		}
		System.out.println("Light Side: ");
		for (AbstractHeroes hero: lightSide) {
			System.out.println(">> " + hero.getTypeHero());
		}

		System.out.println("**********************************");

		ArrayList<AbstractHeroes> darkSide = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			darkSide.add(newRandomHero());
		}
		System.out.println("Dark Side: ");
		for (AbstractHeroes hero: darkSide) {
			System.out.println(">> " + hero.getTypeHero());
		}
	}

	public static AbstractHeroes newRandomHero() {
		return switch (random.nextInt(10)) {
			case 0 ->
					new ArcherCrossbowman(NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString());
			case 1 ->
					new ArcherSniper(NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString());
			case 2 ->
					new HealersApothecary(NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString());
			case 3 ->
					new HealersMonk(NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString());
			case 4 ->
					new InfantriesBandit(NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString());
			case 5 ->
					new InfantriesSpearman(NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString());
			case 6 ->
					new WizardsMage(NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString());
			case 7 ->
					new WizardsWitch(NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString());
			case 8 ->
					new SupportPeasant(NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString());
			case 9 ->
					new SupportWisp(NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString());
			default ->
					null;
		};
	}
}