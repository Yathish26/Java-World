import java.util.Scanner;

public class SimpleChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I am ChatBot. How can I assist you today?");
        System.out.println("Type 'exit' to end the chat.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            // Exit condition
            if (userInput.equals("exit")) {
                System.out.println("ChatBot: Goodbye! Have a great day!");
                break;
            }

            // Process user input and respond
            String response = getResponse(userInput);
            System.out.println("ChatBot: " + response);
        }

        scanner.close();
    }

    // Method to generate responses based on user input
    public static String getResponse(String input) {
        if (input.contains("hello") || input.contains("hi")) {
            return "Hi there! How can I help you?";
        } else if (input.contains("how are you")) {
            return "I'm just a bot, but I'm doing great! Thanks for asking.";
        } else if (input.contains("weather")) {
            return "I don't have live weather updates, but it looks like a great day!";
        } else if (input.contains("time")) {
            return "I'm sorry, I can't tell the time yet. Maybe in my next version!";
        } else if (input.contains("help")) {
            return "Sure! I'm here to assist you. Ask me anything!";
        } else {
            return "I'm not sure I understand. Could you please rephrase?";
        }
    }
}
