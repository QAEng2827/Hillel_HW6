package inputOutputTask;
/*Write program that counts the number of times a particular character, such as e, appears in a file.
The character can be specified at the command line. Use next text as example of txt file


To be, or not to be: that is the question:
Whether 'tis nobler in the mind to suffer
The slings and arrows of outrageous fortune,
Or to take arms against a sea of troubles,
And by opposing end them? To die: to sleep;
No more; and by a sleep to say we end
The heart-ache and the thousand natural shocks
That flesh is heir to, 'tis a consummation
*/



import javax.swing.table.TableRowSorter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3_2 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        int b = 0;

        try {
            fileInputStream = new FileInputStream("C:\\Users\\nakopyuk_i\\Documents\\myFolder\\hi.txt");
            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            while ((b = inputStreamReader.read()) != -1) {
                System.out.println((char) b);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
//            try {
//                fileInputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                inputStreamReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}
