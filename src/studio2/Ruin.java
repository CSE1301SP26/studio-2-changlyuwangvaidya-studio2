import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of simulations: ");
        int simulationDayNumber = in.nextInt();

        System.out.print("Enter starting amount: ");
        int startAmount = in.nextInt();

        System.out.print("Enter win chance (0.0 - 1.0): ");
        // the winChance should be a double from 0.0 to 1.0
        double winChance = in.nextDouble();

        System.out.print("Enter win limit: ");
        int winLimit = in.nextInt();

        // Basic validation
        if (winChance < 0.0 || winChance > 1.0) {
            System.out.println("Error: win chance must be between 0.0 and 1.0");
            in.close();
            return;
        }
        if (simulationDayNumber <= 0 || startAmount <= 0 || winLimit <= 0) {
            System.out.println("Error: numbers must be positive");
            in.close();
            return;
        }

        for (int i = 1; i <= simulationDayNumber; i++) {
            int currentAmount = startAmount; // reset for each simulation
            while (currentAmount < winLimit && currentAmount > 0) {
                if (Math.random() <= winChance) {
                    currentAmount++;
                } else {
                    currentAmount--;
                }
            }

            if (currentAmount == 0) {
                System.out.println("Simulation " + i + ": LOSE");
            } else {
                System.out.println("Simulation " + i + ": WIN");
            }
        }
    }


}
