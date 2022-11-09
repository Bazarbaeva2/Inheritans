public class Main {
    public static void main(String[] args) {
        Daystudent daystudent = new Daystudent("Jany","Oliver",25,"Single");
        daystudent.setName("Name: "+"Jany");
        daystudent.setSurName("Surname: "+"Olivier");
        daystudent.setAge(25);
        daystudent.setGroup("Name of Group: "+"Back end Developer");
        daystudent.setNumber(2022);
        University university = new University("Jany","Back end devoloper",2022,"Single");
        university.study();
        daystudent.setMaritalStatus("Single");
        daystudent.getMaritalStatus();

        System.out.println(daystudent.getName()+"\n"+daystudent.getSurName()+"\n"+daystudent.getAge()+"\n"+
                daystudent.getGroup()+"\n"+daystudent.getNumber()+"\n"+ daystudent.getMaritalStatus());
        System.out.println("---------------------------------------------------------------------------");

        Onlinestudent onlinestudent = new Onlinestudent();
        onlinestudent.setName("Name: "+"Emma");
        onlinestudent.setSurName("Surname: "+"Robberts");
        onlinestudent.setAge(30);
        onlinestudent.setGroup("Name of Group: "+"Front end Developer");
        onlinestudent.setNumber(2021);
        university.study();


        System.out.println(onlinestudent.getName()+"\n"+onlinestudent.getSurName()+"\n"+onlinestudent.getAge()+"\n"+
                onlinestudent.getGroup()+"\n"+onlinestudent.getNumber());




    }
}
