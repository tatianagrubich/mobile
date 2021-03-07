import java.io.IOException;
import java.net.Inet4Address;

public class Main
{
    public static void main(String[] args) throws IOException {
        Container container = new Container();
        container.count += 7843;

        Integer sss=123;
        sumDigits(sss.toString());
    }

    public static String sumDigits(String number)
    {

        int sum=0;
        for(int i=0;i<number.length();i++)
        {
            sum=sum+Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        System.out.println(sum);
        return number;
    }


}