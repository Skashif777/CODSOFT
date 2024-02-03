import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class WordCounter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to input text or '2' to provide a file:");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String inputText;
        if (choice == 1) {
            System.out.println("Enter a sentence or phrase:");
            inputText = scanner.nextLine();
        } else if (choice == 2) {
            System.out.println("Enter the path of the file:");
            String filePath = scanner.nextLine();
            try {
                inputText = readFromFile(filePath);
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
                return;
            }
        } else {
            System.err.println("Invalid choice. Exiting program.");
            return;
        }

        int totalWords = countWords(inputText);
        System.out.println("Total number of words: " + totalWords);

        // Additional features
        displayUniqueWords(inputText);
        displayWordFrequency(inputText);

        scanner.close();
    }

    private static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("[\\s\\p{Punct}]+");
        return words.length;
    }

    private static String readFromFile(String filePath) throws IOException {
        File file = new File(filePath);
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded);
    }

    private static void displayUniqueWords(String input) {
        String[] words = input.split("[\\s\\p{Punct}]+");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Number of unique words: " + uniqueWords.size());
    }

    private static void displayWordFrequency(String input) {
        String[] words = input.split("[\\s\\p{Punct}]+");
        Map<String, Long> wordFrequency = Arrays.stream(words)
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        System.out.println("Word frequency:");
        wordFrequency.forEach((word, frequency) ->
                System.out.println(word + ": " + frequency));
    }
}
