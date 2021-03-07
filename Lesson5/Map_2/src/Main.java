import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String args[]) {
        String name = null;
        String phone = null;

        TreeMap<String, String> tm = new TreeMap<>();
        System.out.println("Телефонная книга");

        tm.put("Андрей", "89604966623");
        tm.put("Валерия", "2215773");
        tm.put("Александр", null);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя абонента");
        name = scanner.nextLine();
        //phone = scanner.nextLine();
        //tm.put(name, phone);

            for ( ; ; ) {
                if (tm.containsKey(name)) {
                    System.out.println("Имя абонента внесено в телефонную книгу. Введите номер телефона абонента");
                    Scanner scanner1 = new Scanner(System.in);
                    phone = scanner1.nextLine();
                    tm.put(name, phone);
                    break;
                } else {
                    if (tm.containsValue(phone)) {
                        System.out.println("Номер телефона внесен в телефонную книгу. Введите имя абонента");
                        Scanner scanner1 = new Scanner(System.in);
                        name = scanner1.nextLine();
                        tm.put(name, phone);
                        break;
                    }
                }
            }

    }
}