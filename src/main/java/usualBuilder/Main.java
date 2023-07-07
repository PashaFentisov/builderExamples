package usualBuilder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("pasha", "password")
                .setAge(12)
                .setEmail("pasha16.ua@gmail.com")
                .setHeigt(175.4)
                .build();
        System.out.println(user);
    }
}
