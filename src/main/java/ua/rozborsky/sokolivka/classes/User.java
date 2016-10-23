package ua.rozborsky.sokolivka.classes;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;
import ua.rozborsky.sokolivka.interfaces.Person;

import javax.persistence.*;

/**
 * Created by roman on 14.10.2016.
 */

@Entity
@Table(name = "users")
@Component
public class User{

    public void setValues(Person person) {
        this.login = person.getLogin();
        this.name = person.getName();
        this.secondName = person.getSecondName();
        this.eMail = person.geteMail();
        this.password = encrypt(person.getPassword());
        this.enabled = person.getEnabled();
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username")
    private String login;

    @Column(name = "name")
    private String name;

    @Column(name = "secondName")
    private String secondName;

    @Column(name = "eMail")
    private String eMail;

    @Column(name = "password")
    private  String password;

    @Column(name = "enabled")
    private  int enabled;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

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

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public String encrypt(String password){
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
