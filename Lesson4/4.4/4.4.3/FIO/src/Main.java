import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
     public static void main (String args[]) throws IOException {
         Scanner scan = new Scanner(System.in);
         System.out.println("Введите фамилию, имя, отчество");
         String FIO = scan.nextLine();


         String lastName = FIO.substring(0, FIO.indexOf(' '));
         System.out.println("Фамилия: "+ lastName);

         String firstName = FIO.substring(FIO.indexOf(' ')+1,FIO.lastIndexOf(' '));
         System.out.println("Имя: "+ firstName);

         String fatherName = FIO.substring(FIO.lastIndexOf(' ')+1,FIO.length());
         System.out.println("Отчество: "+ fatherName);
     }
}
