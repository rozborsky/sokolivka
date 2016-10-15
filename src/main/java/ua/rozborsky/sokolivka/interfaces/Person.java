package ua.rozborsky.sokolivka.interfaces;

/**
 * Created by roman on 14.10.2016.
 */
public interface Person {
    String getName();

    void setName(String name);

    String getSecondName();

    void setSecondName(String secoundName);

    String geteMail();

    void seteMail(String eMail);

    String getPassword();

    void setPassword(String password);

    String getConfirmPassword() ;

    void setConfirmPassword(String confirmPassword);

    boolean isEqualsPasswords();
}
