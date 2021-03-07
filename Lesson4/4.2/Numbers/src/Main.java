public class Main
{
    public static void main(String args[])
    {
       double a1= Double.MAX_VALUE;
       double a2=Double.MIN_VALUE;

       float b1=Float.MAX_VALUE;
       float b2=Float.MIN_VALUE;

       byte c1=Byte.MAX_VALUE;
       byte c2=Byte.MIN_VALUE;

       int d1= Integer.MAX_VALUE;
       int d2=Integer.MIN_VALUE;

       short e1=Short.MAX_VALUE;
       short e2=Short.MIN_VALUE;

       long f1=Long.MAX_VALUE;
       long f2=Long.MIN_VALUE;

       System.out.println("double_max= " +a1+ "," + "   double_min= " +a2);
       System.out.println("float_max= " +b1+ "," + "   float_min= " +b2);
       System.out.println("byte_max= " +c1+ "," + "   byte_min= " +c2);
       System.out.println("int_max= " +d1+ "," + "   int_min= " +d2);
       System.out.println("short_max= " +e1+ "," + "   short_min= " +e2);
       System.out.println("long_max= " +f1+ "," + "   long_min= " +f2);
    }
}
