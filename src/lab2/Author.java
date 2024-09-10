package lab2;

import java.lang.*;

public class Author {
    private String name;
    private String email;
    private String gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public String getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Author with name: " + this.name + ", e-mail: " + this.email + ", gender: " + this.gender;
    }
}
