import AbstractHeroes.AbstractHeroes;
import AbstractHeroes.Archers.*;
import AbstractHeroes.Healers.*;
import AbstractHeroes.Infantries.*;
import AbstractHeroes.NamesHeroes;
import AbstractHeroes.Supports.*;
import AbstractHeroes.Wizards.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class GameAbstractHeroes {
    static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<AbstractHeroes> lightSide = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lightSide.add(newRandomHero(true));
        }
        System.out.println("Light Side: ");
        for (AbstractHeroes hero : lightSide) {
            System.out.println(">> " + hero.getSimpleDescription());
        }
        System.out.println("**********************************");
        ArrayList<AbstractHeroes> darkSide = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            darkSide.add(newRandomHero(false));
        }
        System.out.println("Dark Side: ");
        for (AbstractHeroes hero : darkSide) {
            System.out.println(">> " + hero.getSimpleDescription());
        }

        // Сортировка по инициативе
        ArrayList<AbstractHeroes> initiativeSortArray = new ArrayList<>();
        initiativeSortArray.addAll(lightSide);
        initiativeSortArray.addAll(darkSide);
        initiativeSortArray.sort((Comparator<AbstractHeroes>) (o1, o2) -> {
            if (o2.getInitiative() == o1.getInitiative()) {
                int o2d100 = d100();
                int o1d100 = d100();
                if (o2d100 > o1d100) {
                    return o2.getInitiative() - o1.getInitiative();
                } else {
                    return o1.getInitiative() - o2.getInitiative();
                }
            }
            return o2.getInitiative() - o1.getInitiative();
        });

        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));

        for (AbstractHeroes hero : initiativeSortArray) {
            if (lightSide.contains(hero)) {
                System.out.println("Light Side: ");
                hero.step(darkSide, lightSide);
            } else {
                System.out.println("Dark Side: ");
                hero.step(lightSide, darkSide);
            }
        }

        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));

        System.out.println("Light Side: ");
        for (AbstractHeroes hero : lightSide) {
            System.out.println(">> " + hero.getSimpleDescription());
        }
        System.out.println("*".repeat(30));
        System.out.println("Dark Side: ");
        for (AbstractHeroes hero : darkSide) {
            System.out.println(">> " + hero.getSimpleDescription());
        }
    }

    public static AbstractHeroes newRandomHero(boolean side) {
        return switch (random.nextInt(10)) {
            case 0 -> new ArchersCrossbowman(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    random.nextInt(1, 51));
            case 1 -> new ArchersSniper(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    random.nextInt(1, 51));
            case 2 -> new HealersApothecary(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    random.nextInt(1, 51));
            case 3 -> new HealersMonk(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    random.nextInt(1, 51));
            case 4 -> new InfantriesBandit(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    random.nextInt(1, 51));
            case 5 -> new InfantriesSpearman(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    random.nextInt(1, 51));
            case 6 -> new WizardsMage(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    random.nextInt(1, 51));
            case 7 -> new WizardsWitch(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    random.nextInt(1, 51));
            case 8 -> new SupportsPeasant(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    random.nextInt(1, 51));
            case 9 -> new SupportsWisp(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    random.nextInt(1, 51));
            default -> null;
        };
    }

    public static int d100() {
        return random.nextInt(10) * 10 + random.nextInt(10);
    }
}