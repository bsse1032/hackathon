import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializeToFile {

    private String personalFileName = "personal.txt";
    private String academicFileName = "academic.txt";

    public void writeSerializeObject(Person personal_Info){

        FileOutputStream fout = null;
        ObjectOutputStream ous = null;

        try {

            fout = new FileOutputStream(personalFileName,true);
            ous = new ObjectOutputStream(fout);

            ous.writeObject(personal_Info);
            ous.flush();

        } catch (FileNotFoundException ex) {
            System.out.println("FileOutputStream in " + ex.toString());
        } catch (IOException ex) {
            System.out.println("ObjectOutputStream in " + ex.toString());
        }

    }

    public void writeSerializeObject(Academic academic_Info){

        FileOutputStream fout = null;
        ObjectOutputStream ous1= null;

        try {

            fout = new FileOutputStream(academicFileName,true);
            ous1 = new ObjectOutputStream(fout);

            ous1.writeObject(academic_Info);
            ous1.flush();

        } catch (FileNotFoundException ex) {
            System.out.println("FileOutputStream in " + ex.toString());
        } catch (IOException ex) {
            System.out.println("ObjectOutputStream in " + ex.toString());
        }

    }

}

