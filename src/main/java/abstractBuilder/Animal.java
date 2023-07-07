package abstractBuilder;

import lombok.Getter;

@Getter
public abstract class Animal {
    private final String name;  //required
    private final int age;      //required
    private String secondName;

    public abstract static class Builder<T extends Builder<T>> {
        private final String name;
        private final int age;
        private String secondName;

        Builder(int age, String name) {
            this.name = name;
            this.age = age;
        }

        public T setSecondName(String secondName) {
            this.secondName = secondName;
            return self();
        }

        abstract Animal build();

        protected abstract T self();
    }

    Animal(Builder<?> builder) {
        name = builder.name;
        age = builder.age;
        secondName = builder.secondName;
    }

}
