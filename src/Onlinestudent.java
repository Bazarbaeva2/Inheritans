public class Onlinestudent {
    private String name;
    private String surName;
    private int age;
    private String group;
    private int number;

    public Onlinestudent(String name, String surName, int age, String group, int number) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.group = group;
        this.number = number;
    }

    public Onlinestudent(String name, String surName, int age) {
    }

    public Onlinestudent() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
