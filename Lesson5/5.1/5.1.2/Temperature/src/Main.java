import java.util.Random;

public class Main {
    public static void main(String args[])
    {
        double[] temperature = new double[30];
        double a=32;
        double b=42;
        double result=b-a;
        int count=0;
        double avg = 0;

        Random random = new Random();

        for(int i=0; i<30;i++)
        {
            temperature[i] = (Math.round(((Math.random()*result)+a)*10.0))/10.0;
            if (temperature[i]>=36.2 && temperature[i]<=36.9)
            {
                count++;
            }
            avg=avg+temperature[i];
            System.out.println(temperature[i]);
        }
        System.out.println("Средняя температура по больнице: "+Math.floor(avg/30)+"\n"+"Количество здоровых пациентов: "+count);
    }
}
