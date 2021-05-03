package models;

import java.util.Objects;

public class User {
    private int id;
    private String username;
    private String first_name;
    private String last_name;
    private String password;

    public User(String username, String first_name, String last_name, String password){
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password =password;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() && Objects.equals(getUsername(), user.getUsername()) && Objects.equals(getFirst_name(), user.getFirst_name()) && Objects.equals(getLast_name(), user.getLast_name()) && Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getFirst_name(), getLast_name(), getPassword());
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}