public class University extends Daystudent {
    private String fullName;
    private String groupName;
    private int Number;

    public University(String fullName, String groupName, int number) {

        super(fullName,groupName,number);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
   public void study(){
       System.out.println(fullName+"is study");
   }
}

