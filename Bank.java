import java.util.Scanner;

class Bank implements java.io.Serializable
{
    private String accno;
    private String name;
    private long balance;
    private String regNo,father_name,mother_name,nid,password;
    private String dateOfBirth;

    Scanner KB=new Scanner(System.in);

    public Bank()
    {

    }

    //method to open an account
    void openAccount()
    {
        System.out.print("Enter Account No: ");
        accno=KB.next();
        System.out.print("Enter Student Name: ");
        name=KB.next();
        System.out.print("Enter Balance: ");
        balance=KB.nextLong();
        System.out.println("Enter Fathers Name: ");
        father_name = KB.next();
        System.out.println("Enter Mothers Name: ");
        mother_name = KB.next();
        System.out.println("Enter Nationl Id card no: ");
        nid = KB.next();
        System.out.println("Enter your account password: ");
        password = KB.next();
        System.out.println("Enter your birth date: ");
        dateOfBirth = KB.next();
        System.out.println("Enter your varsity Registration No: ");
        regNo = KB.next();

    }


    void showAccount()
    {
        System.out.println("Bank{" +
                "accno='" + accno + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", regNo='" + regNo + '\'' +
                ", father_name='" + father_name + '\'' +
                ", mother_name='" + mother_name + '\'' +
                ", nid='" + nid + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", KB=" + KB +
                '}');
    }


    void deposit()
    {
        long amt;
        System.out.println("Enter Amount U Want to Deposit : ");
        amt=KB.nextLong();
        balance=balance+amt;
    }


    void withdrawal()
    {
        long amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt=KB.nextLong();
        if(balance>=amt)
        {
            balance=balance-amt;
        }
        else
        {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }

    boolean search(String acn)
    {
        if(accno.equals(acn))
        {
            showAccount();
            return(true);
        }
        return(false);
    }
}