package showrab;

public class Main {

    public static void main(String[] args) {

    /*  Name : Jamil siddakey showrab
        Id   : 2012020119
        Section : C
        E-mail : cse_2012020119@lus.ac.bd
        Date : 08/08/2021
    */
        Student st1 = new Student();
        Student.universityName="Leading University";

        Student st2 = new Student("Jamil siddakey showrab");
        Student st3 = new Student (2012020119);
        st1.display();

    }
}