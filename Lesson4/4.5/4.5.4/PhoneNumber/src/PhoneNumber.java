import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PhoneNumber {
    public static void main(String args[]) throws IOException {
        System.out.println("Введите номер телефона в любом формате");
        String phoneNumer= new String((new BufferedReader(new InputStreamReader(System.in))).readLine());

        String repl = phoneNumer.replaceAll("[^0-9]","");
        System.out.println(repl);

        if (repl.length()==11 && repl.charAt(0)==7)
        {
            System.out.println("+"+Integer.parseInt(String.valueOf(repl.charAt(0)))+" "+Integer.parseInt(String.valueOf(repl.charAt(1)))+Integer.parseInt(String.valueOf(repl.charAt(2)))+Integer.parseInt(String.valueOf(repl.charAt(3)))+" "+Integer.parseInt(String.valueOf(repl.charAt(4)))+Integer.parseInt(String.valueOf(repl.charAt(5)))+Integer.parseInt(String.valueOf(repl.charAt(6)))+"-"+Integer.parseInt(String.valueOf(repl.charAt(7)))+Integer.parseInt(String.valueOf(repl.charAt(8)))+"-"+Integer.parseInt(String.valueOf(repl.charAt(9)))+Integer.parseInt(String.valueOf(repl.charAt(10))));
        }
        else
        {
            if(repl.length()==11 && Integer.parseInt(String.valueOf(repl.charAt(0)))==8)
            {
                System.out.println("+7"+" "+Integer.parseInt(String.valueOf(repl.charAt(1)))+Integer.parseInt(String.valueOf(repl.charAt(2)))+Integer.parseInt(String.valueOf(repl.charAt(3)))+" "+Integer.parseInt(String.valueOf(repl.charAt(4)))+Integer.parseInt(String.valueOf(repl.charAt(5)))+Integer.parseInt(String.valueOf(repl.charAt(6)))+"-"+Integer.parseInt(String.valueOf(repl.charAt(7)))+Integer.parseInt(String.valueOf(repl.charAt(8)))+"-"+Integer.parseInt(String.valueOf(repl.charAt(9)))+Integer.parseInt(String.valueOf(repl.charAt(10))));
            }
            else
            {
              if(repl.length()==10)
              {
                  System.out.println("+7"+" "+Integer.parseInt(String.valueOf(repl.charAt(0)))+Integer.parseInt(String.valueOf(repl.charAt(1)))+Integer.parseInt(String.valueOf(repl.charAt(2)))+" "+Integer.parseInt(String.valueOf(repl.charAt(3)))+Integer.parseInt(String.valueOf(repl.charAt(3)))+Integer.parseInt(String.valueOf(repl.charAt(5)))+"-"+Integer.parseInt(String.valueOf(repl.charAt(6)))+Integer.parseInt(String.valueOf(repl.charAt(7)))+"-"+Integer.parseInt(String.valueOf(repl.charAt(8)))+Integer.parseInt(String.valueOf(repl.charAt(9))));
              }
              else
              {
                  System.out.println("Номер телефона введен не корректно. Номер телефона должен содерать 10 или 11 цифр");
              }
            }
        }



    }
}
