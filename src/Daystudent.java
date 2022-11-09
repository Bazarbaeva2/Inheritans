public class Daystudent extends Onlinestudent {

    private String name;
    private String surName;
    private int age;
    private String maritalStatus;

    public Daystudent(String name, String surName, int age,String maritalStatus) {
        super(name,surName,age);
        this.maritalStatus=maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
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
}

