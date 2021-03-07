public class Main {
    public static void main (String arg[])
    {
        //малые символы латинского алфавита
        for (char i='a';i<='z';i++)
        {
            int code=(int) i;
            System.out.println(i+": "+code);
        }
        //большие символы латинского алфавита
        for (char i='A';i<='Z';i++)
        {
            int code=(int) i;
            System.out.println(i+": "+code);
        }
        //малые символы русского алфавита
        for (char i='а';i<='я';i++)
        {
            int code=(int) i;
            System.out.println(i+": "+code);
        }
        //большие символы русского алфавита
        for (char i='А';i<='Я';i++)
        {
            int code=(int) i;
            System.out.println(i+": "+code);
        }
    }
}
