package Org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class assignment2 {
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: Java WordCounter <filename>");
			return;
		}
		
		String filename = args[0];
		Map<String, Integer> wordCounts = new HashMap<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
			String line;
			while((line = reader.readLine())!= null) {
				String[] words = line.toLowerCase().split("[^a-zA-Z]+");
				for (String word : words) {
					if (word.length() > 3) {
						wordCounts.put(word,  wordCounts.getOrDefault(words, 0) + 1);
					}
				}
			}
		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		}
		
		for (Map.Entry<String,Integer> entry : wordCounts.entrySet()) {
			System.out.println(entry.getKey() + "" +entry.getValue());
		}
	}

}
