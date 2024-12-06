package Org.howard.edu.lsp.finalexam.question2;

public class CustomRandomStrategy implements RandomNumberStrategy {
	private long seed = System.currentTimeMillis();

    @Override
    public int generateRandomNumber() {
        seed = (seed * 1103515245 + 12345) & 0x7fffffff;
        return (int) seed;
    }

}
