public class GameAbstractHeroes {
	public static void main(String[] args) {
		ArcherSniper sniper = new ArcherSniper("Legolas");
		ArcherCrossbowman crossbowman = new ArcherCrossbowman("Persival");
		
		InfantriesBandit bandit = new InfantriesBandit("Robin Hood");
		InfantriesSpearman spearman = new InfantriesSpearman("Lancelot");
		
		HealersMonk monk = new HealersMonk("Buddha");
		HealersApothecary apothecary = new HealersApothecary("Dr. Stone");
		
		WizardsWitch witch = new WizardsWitch("Morgana");
		WizardsMage mage = new WizardsMage("Merlin");

		SupportPeasant peasant = new SupportPeasant("John Stonewall");
		SupportWisp wisp = new SupportWisp("Spark");

		sniper.printParameters();
		System.out.println("************************");
		crossbowman.printParameters();
		System.out.println("************************");
		bandit.printParameters();
		System.out.println("************************");
		spearman.printParameters();
		System.out.println("************************");
		monk.printParameters();
		System.out.println("************************");
		apothecary.printParameters();
		System.out.println("************************");
		witch.printParameters();
		System.out.println("************************");
		mage.printParameters();
		System.out.println("************************");
		peasant.printParameters();
		System.out.println("************************");
		wisp.printParameters();
	}
}