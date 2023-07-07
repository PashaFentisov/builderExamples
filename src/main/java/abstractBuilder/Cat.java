package abstractBuilder;

import lombok.Getter;

@Getter
public class Cat extends Animal{
    private final String color;

    public static class Builder extends Animal.Builder<Builder>{
        private final String color;

        public Builder(String color, String name, int age){
            super(age, name);
            this.color = color;
        }

        @Override
        Animal build() {
            return new Cat(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
    Cat(Builder builder){
        super(builder);
        color = builder.color;
    }



}
