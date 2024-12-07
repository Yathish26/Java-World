
public class Wire {
    public static void main(String[] args) {
        String result = greet("Yathish");
        System.out.println(result.toLowerCase());
    }

    public static String greet(String name) {
        return String.format("Hello, %s!", name);
    }

}


