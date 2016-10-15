package ua.rozborsky.sokolivka.classes;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import ua.rozborsky.sokolivka.interfaces.Person;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by roman on 14.10.2016.
 */

@Component
public class User implements Person {

    @NotEmpty(message = "введіть ім'я")
    @Size(min=2, max = 20, message = "ім'я повинно бути від 2 до 20 символів")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "неправильний формат імені")
    private String name;

    @NotEmpty(message = "введіть прізвище")
    @Size(min=2, max = 20, message = "прізвище повинно бути від 2 до 20 символів")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "неправильний формат прізвища")
    private String secondName;

    @NotEmpty(message = "введіть e-mail")
    @Email(message = "e-mail неправильного формату")
    private String eMail;

    @NotEmpty(message = "введіть пароль")
    @Size(min=6, max = 12, message = "пароль повинен бути від 10 до 20 символів")
    private  String password;
    private  String confirmPassword;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public boolean isEqualsPasswords() {
        return password.equals(confirmPassword);
    }
}
