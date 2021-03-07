import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.StrictMath.*;

public class Main {


    public static void main(String arg[]) throws IOException {
        int box = 0; //ящики
        int t = 0; //счетчик
        int k = 1;//счетчик
        int i = 0;
        int j = 1;
        int x = 1;
        double gruz;
        double cont = 0;

        System.out.println("Введите количество ящиков");
        box = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        // в одном контейнере 27 ящиков
        // в одном грузовике 12 контейнеров
        //сколько нужно контейнеров
        cont = (double) (ceil(box / 27));
        if (box % 27 > 0) {
            cont++;
        }
        System.out.println(cont);
        //сколько нужно грузовиков
        gruz = (double) ceil(cont / 12);
        System.out.println(gruz);

        //результат
        for (i = 1; i <= gruz; i++) {
            System.out.println("Грузовик №" + i);

            while (j <= 12 && x <= cont)
            //for(int j=1;j<=cont;j++)
            {
                System.out.println("Контейнер №" + j);

                while (t < 27 && k <= box) {
                    System.out.println("Ящик №" + k);
                    t++;
                    k++;

                }
                t = 0;
                j++;
                x++;
            }
            j = 1;

        }


    }
}
