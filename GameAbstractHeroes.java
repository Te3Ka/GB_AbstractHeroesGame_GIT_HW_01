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
import java.util.Scanner;

public class GameAbstractHeroes {
    public static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<AbstractHeroes> lightSide = new ArrayList<>();
    static ArrayList<AbstractHeroes> darkSide = new ArrayList<>();
    public static ArrayList<AbstractHeroes> initiativeSortArray = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            lightSide.add(newRandomHero(true, i + 1));
        }
        for (int i = 0; i < 10; i++) {
            darkSide.add(newRandomHero(false, i + 1));
        }
        // Сортировка по инициативе
        initiativeSortArray.addAll(lightSide);
        initiativeSortArray.addAll(darkSide);
        initiativeSortArray.sort((Comparator<AbstractHeroes>) (o1, o2) -> {
            if (o2.getInitiative() == o1.getInitiative()) {
                int o2d100 = d100();
                int o1d100 = d100();
                return o2d100 - o1d100;
            }
            return o2.getInitiative() - o1.getInitiative();
        });

        View.view();
        
        int deadLightSide = 0, deadDarkSide = 0;
        boolean nextStep = true;
        while (nextStep) {
            scanner.nextLine();
            for (AbstractHeroes hero : initiativeSortArray) {
                deadLightSide = 0;
                deadDarkSide = 0;
                for (AbstractHeroes heroIsDead : lightSide) {
                    if (heroIsDead.isDead()) {
                        deadLightSide++;
                    }
                }
                for (AbstractHeroes heroIsDead : darkSide) {
                    if (heroIsDead.isDead()) {
                        deadDarkSide++;
                    }
                }
                if (deadLightSide == 10 || deadDarkSide == 10)
                    nextStep = false;
                if (lightSide.contains(hero)) {
                    hero.step(darkSide, lightSide);
                } else {
                    hero.step(lightSide, darkSide);
                }
            }
            System.out.println("Light Sight dead = " + deadLightSide);
            System.out.println("Dark Sight dead = " + deadDarkSide);
            View.view();
        }
        if (deadLightSide == 10)
            System.out.println("Победила Тёмная Сторона");
        else
            System.out.println("Победила Светлая Сторона");
    }

    public static AbstractHeroes newRandomHero(boolean side, int coor) {
        return switch (random.nextInt(10)) {
            case 0 -> new ArchersCrossbowman(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    coor);
            case 1 -> new ArchersSniper(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    coor);
            case 2 -> new HealersApothecary(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    coor);
            case 3 -> new HealersMonk(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    coor);
            case 4 -> new InfantriesBandit(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    coor);
            case 5 -> new InfantriesSpearman(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    coor);
            case 6 -> new WizardsMage(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    coor);
            case 7 -> new WizardsWitch(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    coor);
            case 8 -> new SupportsPeasant(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    coor);
            case 9 -> new SupportsWisp(
                    NamesHeroes.values()[random.nextInt(NamesHeroes.values().length)].toString(),
                    side ? 1 : 10,
                    coor);
            default -> null;
        };
    }

    public static int d100() {
        return random.nextInt(10) * 10 + random.nextInt(10);
    }
}