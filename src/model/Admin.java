package model;

public class Admin {
    private int personalId;
    private String name;
    private int age;
    private int phoneNumber;
    private String email;

    public Admin() {}

    public Admin(int personalId, String name, int age, int phoneNumber, String email, String username, String passWord) {
        this.personalId = personalId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
