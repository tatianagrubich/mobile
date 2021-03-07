
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);

        String first=text.substring(15, text.length()-49);
        System.out.println(first);

        //String second=text.substring(35, text.length()-29);
        //System.out.println(second);

        String third=text.substring(56, text.length()-7);
        System.out.println(third);

        int a=Integer.parseInt(first);
        //int b=Integer.parseInt(second);
        int c=Integer.parseInt(third);

        int sum=a+c;

        System.out.println("Сумма заработка Васи и Маши =  "+ sum +" руб");

    }
}