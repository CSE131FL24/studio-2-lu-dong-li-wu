package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The amount of money you start with
		double startAmount = 500;
		// The win probability, or the probability you win a single play
		double winChance = 0.5;
		// If you reach this amount of money you have a successful day and leave
		double winLimit = 1000;
		// Play until ruin or success
		// Record number of plays
		int totalPlays = 0;
		int losetimes = 0;
		int wintimes = 0;
		for (int i = 1; i <= 10; i++) {
			double currentAmount = startAmount;
			while (currentAmount != winLimit && currentAmount != 0) {

				// Play the game
				Math.random();
				if (Math.random() > 0.5) {
					currentAmount--;
					totalPlays++;

				} else {
					currentAmount++;
					totalPlays++;
				}
			}
			// Whether win or ruin

			if (currentAmount == 0) {
				System.out.println("Number of plays: " + totalPlays + " Number of days: " + i);
				System.out.println("you lose");
				losetimes++;
			} else {
				System.out.println("Number of plays: " + totalPlays + "Number of days: " + i);
				System.out.println("you win");
				wintimes++;
			}

		}
		double ruinRate = 0;
		System.out.println(ruinRate = losetimes / 10.0);
	}
}
