import AbstractHeroes.AbstractHeroes;
import AbstractHeroes.Archers.*;
import AbstractHeroes.Healers.*;
import AbstractHeroes.Infantries.*;
import AbstractHeroes.NamesHeroes;
import AbstractHeroes.Supports.*;
import AbstractHeroes.Wizards.*;
import java.util.ArrayList;
import java.util.Random;

public class GameAbstractHeroes {
	static Random random = new Random();

	public static void main(String[] args) {

		ArrayList<AbstractHeroes> lightSide = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lightSide.add(newRandomHero(true));
		}
		System.out.println("Light Side: ");
		for (AbstractHeroes hero: lightSide) {
			System.out.println(">> " + hero.getTypeHero());
		}

		System.out.println("**********************************");

		ArrayList<AbstractHeroes> darkSide = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			darkSide.add(newRandomHero(false));
		}
		System.out.println("Dark Side: ");
		for (AbstractHeroes hero: darkSide) {
			System.out.println(">> " + hero.getTypeHero());
		}

		System.out.println("**********************************");
		System.out.println("Light Side: ");
		for (AbstractHeroes hero: lightSide) {
			hero.step(darkSide);
		}
		System.out.println("**********************************");
		System.out.println("Dark Side: ");
		for (AbstractHeroes hero: darkSide) {
			hero.step(lightSide);
		}
	}

	public static AbstractHeroes newRandomHero(boolean side) {
		return switch (random.nextInt(10)) {
			case 0 ->
					new ArchersCrossbowman(
							NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
							side ? 1 : 10,
							random.nextInt(1, 51));
			case 1 ->
					new ArchersSniper(
							NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
							side ? 1 : 10,
							random.nextInt(1, 51));
			case 2 ->
					new HealersApothecary(
							NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
							side ? 1 : 10,
							random.nextInt(1, 51));
			case 3 ->
					new HealersMonk(
							NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
							side ? 1 : 10,
							random.nextInt(1, 51));
			case 4 ->
					new InfantriesBandit(
							NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
							side ? 1 : 10,
							random.nextInt(1, 51));
			case 5 ->
					new InfantriesSpearman(
							NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
							side ? 1 : 10,
							random.nextInt(1, 51));
			case 6 ->
					new WizardsMage(
							NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
							side ? 1 : 10,
							random.nextInt(1, 51));
			case 7 ->
					new WizardsWitch(
							NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
							side ? 1 : 10,
							random.nextInt(1, 51));
			case 8 ->
					new SupportsPeasant(
							NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
							side ? 1 : 10,
							random.nextInt(1, 51));
			case 9 ->
					new SupportsWisp(
							NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
							side ? 1 : 10,
							random.nextInt(1, 51));
			default ->
					null;
		};
	}
}