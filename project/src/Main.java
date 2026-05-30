public class Main {
    public static void main(String[] args) {
        IO.println("Hello, World!");

        User user = new User("Alice", "alice@example.com");
        IO.println("User: " + user.getName() + ", Email: " + user.getEmail());
    }
}