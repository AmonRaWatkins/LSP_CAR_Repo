package Org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

public class JavaRandomStrategy implements RandomNumberStrategy {
	 private Random random = new Random();
	 	@Override
	    public int generateRandomNumber() {
	        return Math.abs(random.nextInt()) + 1;
	    }

}
