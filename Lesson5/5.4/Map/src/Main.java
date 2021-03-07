import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main (String args[]) {
        String name = null;
        String phone = null;

        TreeMap<String, String> tm = new TreeMap<String, String>();
        System.out.println("Телефонная книга");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя абонента");
        name = scanner.nextLine();
        //phone = scanner.nextLine();
        tm.put(name, phone);

        for (; ; ) {


            /*System.out.println("Введите имя абонента");
            name = scanner.nextLine();
            phone = scanner.nextLine();
            tm.put(name, phone);*/

            if(name.equals(tm))
            {
                System.out.println("Имя абонента внесено в телефонную книгу. Введите номер телефона абонента");
                Scanner scanner1 = new Scanner(System.in);
                phone = scanner1.nextLine();
                tm.put(name, phone);
            }
            else {
                if (phone.equals(tm)) {
                    System.out.println("Номер телефона внесен в телефонную книгу. Введите имя абонента");
                    Scanner scanner1 = new Scanner(System.in);
                    name = scanner1.nextLine();
                    tm.put(name, phone);
                }
            }


            /*System.out.println("Введите номер телефона абонента");
            phone = scanner.nextLine();
            tm.put(name, phone);


            if (name.equals(tm) && phone == "") {
                System.out.println("Имя абонента внесено в телефонную книгу. Введите номер телефона абонента");
                Scanner scanner1 = new Scanner(System.in);
                phone = scanner1.nextLine();
                tm.put(name, phone);
            } else {
                if (phone.equals(tm) && name == null) {
                    System.out.println("Введите имя абонента");
                    Scanner scanner1 = new Scanner(System.in);
                    name = scanner1.nextLine();
                    tm.put(name, phone);
                }
            }*/

        String phoneBook = scanner.nextLine();

        if (phoneBook.contains("LIST")) {
            for (String key : tm.keySet()) {
                System.out.println(key);
            }
            continue;
        }
    }

        }
    }


