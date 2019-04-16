import java.util.*;

public class Admin {

    String name,father_name,mother_name,date_of_birth,address,reg,phn,session,sem,year,hall,roll,
            nid,password;



    public void insert_personal_info()
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your name : ");
        name=input.nextLine();

        System.out.println("Enter your father's name : ");
        father_name=input.nextLine();

        System.out.println("Enter your mother's name : ");
        mother_name=input.nextLine();

        System.out.println("Enter your date of birth : ");
        date_of_birth=input.nextLine();

        System.out.println("Enter your address : ");
        address=input.nextLine();

        System.out.println("Enter your phone number : ");
        phn=input.nextLine();

        Person person=new Person(name, father_name, mother_name, date_of_birth, address, reg, phn);
        SerializeToFile serializeToFile=new SerializeToFile();
        serializeToFile.writeSerializeObject(person);
    }

    public void academicInfo()
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your regestration number : ");
        reg=input.nextLine();

        System.out.println("Enter your roll number : ");
        roll=input.nextLine();

        System.out.println("Enter your session : ");
        session=input.nextLine();

        System.out.println("Enter your current year : ");
        year=input.nextLine();

        System.out.println("Enter your current semester : ");
        sem=input.nextLine();

        Academic academic_Info=new Academic();

        SerializeToFile serializeToFile=new SerializeToFile();
        serializeToFile.writeSerializeObject(academic_Info);

    }
}
