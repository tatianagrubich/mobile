
public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat();
        Cat masha = new Cat();
        Cat anya = new Cat();

        System.out.println(Cat.count);

        vasya.feed(5000000.0);

        vasya.getStatus();
        System.out.println(Cat.count);

        System.out.println(Cat.getCount());
    }
}