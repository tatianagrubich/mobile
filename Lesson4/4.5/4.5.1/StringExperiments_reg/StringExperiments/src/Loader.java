
public class Loader
{
    public static void main(String[] args)
    {
        int sum=0;
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text.trim());
        String[] mas=text.trim().split("\\D+");
        for(int i=1; i<mas.length; i++) {
            System.out.println(mas[i].trim());
            int a= Integer.parseInt(mas[i].trim());
            sum=sum+a;
        }
       System.out.println("Сумма заработка равна "+sum+ " руб.");
    }

}