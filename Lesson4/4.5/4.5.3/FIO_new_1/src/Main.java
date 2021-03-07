import java.io.IOException;
import java.util.Scanner;

public class Main {
     public static void main (String args[]) throws IOException {
         Scanner scan = new Scanner(System.in);
         System.out.println("Введите фамилию, имя, отчество");
         String FIO = scan.nextLine();

         String[] mas=FIO.trim().split(" ");

            if(mas.length==1)
             {
                 System.out.println("Фамилия: " + mas[0]);
             }
             else
             {
                 if(mas.length==2)
                 {
                     System.out.println("Фамилия: " + mas[0]);
                     System.out.println("Имя: "+mas[1]);
                 }
                 else
                 {
                     System.out.println("Фамилия: " + mas[0]);
                     System.out.println("Имя: "+mas[1]);
                     System.out.println("Отчество: "+mas[2]);
                 }
             }
         }

     }
