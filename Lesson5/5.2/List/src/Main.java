import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String a;
        int b;
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Дело №1");
        newList.add("Дело №2");
        newList.add("Дело №3");
        for (; ; )
        {
        System.out.println("Выберите опреацию:" + "\n" +
                "LIST"+"  Вывести весь список" + "\n" +
                "ADD" +"  Добавить дело в конец списка" + "\n" +
                "ADD_PLACE" + "   Добавить дело в определенное место списка" + "\n" +
                "EDIT" + "   Заменить дело с указанным номером" +"\n" +
                "DELETE" + "   Удалить дело");
        Scanner scan = new Scanner(System.in);
        String element = scan.nextLine();



            switch (element) {
                case "LIST": {
                    if (newList != null) {
                        System.out.println(newList);
                    } else {
                        System.out.println("Список пуст");
                    }
                    ;
                    break;
                }

                case "ADD": {
                    Scanner count = new Scanner(System.in);
                    System.out.println("Сколько дел вы хотите ввести?");
                    int num = count.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.println("Введите новое дело");
                        Scanner scan1 = new Scanner(System.in);
                        newList.add(String.valueOf(scan1.nextLine()));

                    }
                    System.out.println("Весь список: " + newList);
                    break;
                }

                case "ADD_PLACE": {
                    System.out.println("Введите номер позиции дела в списке");
                    Scanner scan2 = new Scanner(System.in);
                    int element2 = Integer.valueOf(scan2.nextLine());
                    System.out.println("Введите наименование дела");
                    Scanner scan3 = new Scanner(System.in);
                    String element3 = scan3.nextLine();
                    if (element2 <= newList.size()) {
                        newList.add(element2, element3);
                        System.out.println("Весь список: " + newList);
                    } else {
                        System.out.println("Введенная позиция элемента больше максимального размера списка");
                        System.out.println("Весь список: " + newList);
                    }
                }
                ;
                break;

                case "EDIT": {
                    System.out.println("Введите номер позиции дела, которую нужно заменить в списке");
                    Scanner scan2 = new Scanner(System.in);
                    int element2 = Integer.valueOf(scan2.nextLine());
                    System.out.println("Введите наименование дела");
                    Scanner scan3 = new Scanner(System.in);
                    String element3 = scan3.nextLine();
                    newList.set(element2, element3);
                    System.out.println("Весь список: " + newList);
                }
                ;
                break;

                case "DELETE": {
                    System.out.println("Введите номер позиции дела, котор нужно заменить в списке");
                    Scanner scan2 = new Scanner(System.in);
                    int element2 = Integer.valueOf(scan2.nextLine());
                    System.out.println("Введите наименование дела");
                    Scanner scan3 = new Scanner(System.in);
                    String element3 = scan3.nextLine();
                    newList.set(element2, element3);
                    System.out.println("Весь список: " + newList);
                }

            }
        }
    }
}
