package inputOutputTask;
/*Write program that open a text file so that you can read the file one line at a time.
Read each line as a String and place that String object into a LinkedList.
Print all of the lines in the LinkedList in reverse order.*/

import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3_1 {

public static void main(String args[])throws IOException{
    String content = new String();
    int count=1;
    File file = new File("C:\\Users\\nakopyuk_i\\IdeaProjects\\INakopyuk_HW6\\src\\main\\resources\\soneth.txt");
    LinkedList<String> list = new LinkedList<String>();

    try {
        Scanner sc = new Scanner(new FileInputStream(file));
        while (sc.hasNextLine()){
            content = sc.nextLine();
            list.add(content);

        }
        sc.close();
    }catch(FileNotFoundException fnf){
        fnf.printStackTrace();
    }
    catch (Exception e) {
        e.printStackTrace();
        System.out.println("\nProgram terminated Safely...");
    }
// print line in right order
    Iterator j = list.iterator();
       while (j.hasNext()) {
        System.out.print("Line " + (count++) + " : ");
        System.out.println(j.next());
    }
    System.out.println("------------------------");
//print line in revers order
    Collections.reverse(list);
    Iterator i = list.iterator();
    int revCount=list.size();
    while (i.hasNext()) {
        System.out.print("Line " + (revCount--) + " : ");
        System.out.println(i.next());
    }
}
}

