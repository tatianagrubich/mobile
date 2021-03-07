public class Main
{
   public static void main(String[] args)
   {
       for (int i = 200000; i <= 235000; i++)
       {
           if (i>=200000 && i<=210000 || i>=220000 && i<=235000)
           {
               System.out.println("TicketNumber = " +i);
           }
       }
   }
}
