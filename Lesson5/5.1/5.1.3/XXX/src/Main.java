import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String args[]) throws IOException {
        int hight = 0;
        String a;
       /* String[][] XXX={
                {"X"," "," "," "," "," ","X"},
                {" ","X"," "," "," ","X"," "},
                {" "," ","X"," ","X"," "," "},
                {" "," "," ","X"," "," "," "},
                {" "," ","X"," ","X"," "," "},
                {" ","X"," "," "," ","X"," "},
                {"X"," "," "," "," "," ","X"}
        };

        for(int i=0; i<XXX.length;i++) {
            for (int j = 0; j < XXX[i].length; j++) {
                System.out.print(XXX[i][j]);
            }
            System.out.println();
        }*/
       String[][] XXX={{}};
        System.out.println("Введите высоту креста");
        hight = Integer.parseInt((new BufferedReader(new InputStreamReader (System.in))).readLine());

        if (hight%2!=0)
        {
            a = "  ";
        }
        else
        {
            a=" ";
        }
        for(int i=0;i<=hight;i++)
        {
            for(int j=0;j<=hight;j++)
            {
                if(i==j|| i==hight-j)
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print(a);
                }
            }
            System.out.println();
        }



    }
}
