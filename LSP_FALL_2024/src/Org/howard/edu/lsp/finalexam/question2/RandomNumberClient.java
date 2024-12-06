package Org.howard.edu.lsp.finalexam.question2;

public class RandomNumberClient {
	 public static void main(String[] args) {
	        RandomNumberService service = RandomNumberService.getInstance();

	        // Using Java's built-in random number generator
	        service.setStrategy(new JavaRandomStrategy());
	        System.out.println("Java Random: " + service.getRandomNumber());

	        // Using custom random number generator
	        service.setStrategy(new CustomRandomStrategy());
	        System.out.println("Custom Random: " + service.getRandomNumber());
	    }
}