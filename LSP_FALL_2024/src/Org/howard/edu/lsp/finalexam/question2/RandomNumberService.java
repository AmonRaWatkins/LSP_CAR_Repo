package Org.howard.edu.lsp.finalexam.question2;

public class RandomNumberService {
	private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    private RandomNumberService() {}

    /**
     * Gets the singleton instance of RandomNumberService.
     * @return The singleton instance.
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the random number generation strategy.
     * @param strategy The strategy to use for random number generation.
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the current strategy.
     * @return A positive random integer.
     */
    public int getRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Random number strategy not set");
        }
        return strategy.generateRandomNumber();
    }
}
