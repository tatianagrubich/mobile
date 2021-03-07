import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
     public static void main (String args[]) throws IOException {
         Scanner scan = new Scanner(System.in);
         System.out.println("Введите фамилию, имя, отчество");
         String FIO = scan.nextLine();


         int count=0; //счетчик слов в троке
         int count1=0; //счетчик пробелов, если в строке одни пробелы
         int count2=0; //флаг

         for (int i = 0; i < FIO.length(); i++) {
             if (FIO.charAt(i) == ' ') {
                 count1++;
             }
         }
         if(count1==FIO.length() && FIO.length()!=0)
         {
             System.out.println("Строка состоит только из пробелов");
         }

         if(FIO.length() != 0 && FIO.length()!=' ')
         {
             count++;
             for (int i = 0; i < FIO.length(); i++) {
                 if (FIO.charAt(i) == ' ') {
                     count++;
                 }
             }
             System.out.println("Количество слов в строке: "+ count);
         }
         else {
             if (FIO.length() == 0) {
                 count = 0;
                 System.out.println("Количество слов в строке: " + count);
             }
         }
                 for (int i=0; i<FIO.length(); i++) {
                     if (FIO.charAt(i) == '!' || FIO.charAt(i) == '@' || FIO.charAt(i) == '#' || FIO.charAt(i) == '$' || FIO.charAt(i) == '%' || FIO.charAt(i) == '^' || FIO.charAt(i) == '&' || FIO.charAt(i) == '*' || FIO.charAt(i) ==
                             '(' || FIO.charAt(i) == ')') {
                         count2 = -1;

                     }
                 }

                 if (count2==-1)
                 {
                     System.out.println("Строка содержит недопустимые символы. Проверьте строку на правильность написания");
                 }


         if (count==1 && count2==0)
         {
             String lastName = FIO.substring(0, FIO.length());
             System.out.println("Фамилия: "+ lastName);
         }
         else
         {
             if (count==2 && count2==0)
             {
                 String lastName = FIO.substring(0, FIO.indexOf(' '));
                 System.out.println("Фамилия: "+ lastName);

                 String firstName = FIO.substring(FIO.indexOf(' ')+1,FIO.length());
                 System.out.println("Имя: "+ firstName);
             }
             else {
                 if (count == 3 && count2 == 0) {
                     String lastName = FIO.substring(0, FIO.indexOf(' '));
                     System.out.println("Фамилия: " + lastName);

                     String firstName = FIO.substring(FIO.indexOf(' ') + 1, FIO.lastIndexOf(' '));
                     System.out.println("Имя: " + firstName);

                     String fatherName = FIO.substring(FIO.lastIndexOf(' ') + 1, FIO.length());
                     System.out.println("Отчество: " + fatherName);
                 } else {
                     if (count > 3 && count2 == 0) {
                         System.out.println("Неверный формат строки. Проверьте строку на правильность написания");
                     }
                 }
             }

         }





     }
}
