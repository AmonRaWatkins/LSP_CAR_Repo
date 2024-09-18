package Org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class assignment2 {

    public static void main(String[] args) {
        // Ensure a filename is provided
        if (args.length != 1) {
            System.out.println("Usage: java WordCount <filename>");
            return;
        }

        String filename = args[0];
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Reading the file
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            // Process each line
            while ((line = br.readLine()) != null) {
                // Convert the line to lower case and split it into words
                String[] words = line.toLowerCase().split("\\W+");

                // Count each word
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Display the word counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
