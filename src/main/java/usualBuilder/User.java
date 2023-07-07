package usualBuilder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class User {
    private final String username;  //required
    private final String password;  //required
    private int age;
    private double height;
    private String email;

    public static class Builder{
        private final String username;
        private final String password;
        private int age;
        private double height;
        private String email;

        public Builder(String username, String password){
            this.username = username;
            this.password = password;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setHeigt(double height){
            this.height = height;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
    private User(Builder builder){
        this.password = builder.password;
        this.email = builder.email;
        this.height= builder.height;
        this.username= builder.username;
        this.age= builder.age;
    }
}
