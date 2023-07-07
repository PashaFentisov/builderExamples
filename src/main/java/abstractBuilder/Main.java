package abstractBuilder;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat.Builder("red", "Barsik", 13)
                .setSecondName("SecondName")  // not required
                .build();

        System.out.println(animal.getAge());
        System.out.println(animal.getSecondName());
        System.out.println(animal.getName());
        System.out.println(((Cat)animal).getColor());
    }
}
