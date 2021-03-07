import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main (String args[])
    {
        HashSet<String> eMails = new HashSet<>();
        eMails.add("inga@mail.ru");
        eMails.add("1307_vasya@yandex.ru");
        eMails.add("potapov.k@bk.ru");

        System.out.println("Добавить новый e-mail в список?");
        System.out.println("y/n");

        Scanner scan = new Scanner(System.in);
        String element = scan.nextLine();

        if(element!="n")
        {
            System.out.println("Введите новый e-mail");
            Scanner scan1 = new Scanner(System.in);
            String element1 = scan1.nextLine();
            eMails.add(element1);
        }

       for(String el: eMails) {
           System.out.println(el);
       }
    }
}
