package ua.rozborsky.sokolivka.interfaces;

/**
 * Created by roman on 14.10.2016.
 */
public interface Person {
    int getId();

    void setId(int id);

    String getLogin();

    void setLogin(String login);

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

    int getEnabled();

    void setEnabled(int enabled);
}
