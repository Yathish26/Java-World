public class Lime {
    public static void main(String args[]){
        User("Yathish",24);
    }

    public static void User(String name, int age){
        System.out.printf("Enter your name: ");
        name = System.console().readLine();
        System.out.printf("Enter your age: ");
        age = Integer.parseInt(System.console().readLine());

        System.out.printf("Hello your name is %s and you are %d years old",name,age);
    }
}
