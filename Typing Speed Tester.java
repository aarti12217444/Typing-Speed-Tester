import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is a powerful programming language.",
            "Practice makes a person perfect.",
            "Typing speed is fun to test.",
            "Coding helps improve logical thinking.",
            "Consistency is the key to success."
        };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("⌨️ Welcome to Typing Speed Tester!");

        // Select random sentence
        String sentence = sentences[random.nextInt(sentences.length)];
        System.out.println("\nType the following sentence as fast as you can:");
        System.out.println("👉 " + sentence);
        System.out.println("\nPress Enter when you're ready to start...");
        scanner.nextLine(); // wait for enter

        long startTime = System.currentTimeMillis();

        // User types the sentence
        System.out.println("Start typing:");
        String userInput = scanner.nextLine();

        long endTime = System.currentTimeMillis();

        // Calculate typing speed
        double timeTakenInSeconds = (endTime - startTime) / 1000.0;
        int wordCount = sentence.split(" ").length;
        double wpm = (wordCount / timeTakenInSeconds) * 60;

        // Accuracy check
        if (userInput.equals(sentence)) {
            System.out.println("✅ Perfect! Accuracy: 100%");
        } else {
            System.out.println("⚠️ Text didn't match exactly.");
        }

        System.out.printf("⏱️ Time Taken: %.2f seconds\n", timeTakenInSeconds);
        System.out.printf("🚀 Typing Speed: %.2f WPM\n", wpm);
    }
}
