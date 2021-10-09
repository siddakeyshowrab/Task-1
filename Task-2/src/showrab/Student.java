package showrab;

public class Student {
    /*  Name :  Jamil siddakey showrab
        Id   : 2012020119
        Section : C
        E-mail : cse_2012020119@lus.ac.bd
        Date : 08/08/2021
    */
    String name;
    int id;
    static String universityName;

    Student()
    {
        System.out.println("Default constructor");
    }
    Student (String name)
    {
        this.name = name;
        System.out.println("Name: "+this.name);

    }

    Student (int id)
    {
        this.id = id;
        System.out.println("Id: "+this.id);
    }

    void display(){
        System.out.println("University Name: "+universityName);
    }

}
