import java.util.Scanner;

public class Academic {
    private String name,fathersName,mothersName;
    private double cgpa;
    private String homeTOwn;
    private String dBo;
    private String department,session;

    Scanner KB=new Scanner(System.in);

    public Academic(String name, String fathersName, String mothersName, double cgpa, String homeTOwn,
                    String dBo,String department,String session)
    {
        this.name = name;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.cgpa = cgpa;
        this.homeTOwn = homeTOwn;
        this.dBo = dBo;
        this.department = department;
        this.session = session;
    }



    public String getMothersName() {
        return mothersName;
    }
    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getHomeTOwn() {
        return homeTOwn;
    }

    public void setHomeTOwn(String homeTOwn) {
        this.homeTOwn = homeTOwn;
    }

    public String getName() {
        return name;
    }

    public String getdBo() {
        return dBo;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public void setdBo(String dBo) {
        this.dBo = dBo;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Academic{" +
                "name='" + name + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", cgpa=" + cgpa +
                ", homeTOwn='" + homeTOwn + '\'' +
                ", dBo='" + dBo + '\'' +
                ", department='" + department + '\'' +
                ", session='" + session + '\'' +
                '}';
    }
    public Academic()
    {

    }

}
