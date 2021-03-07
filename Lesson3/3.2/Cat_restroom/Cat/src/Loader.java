
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();

        System.out.println(cat.getStatus());
        System.out.println(cat.getWeight());
        cat.feed(50.4);
        System.out.println(cat.getMeals());

        cat.feed(300.0);
        System.out.println(cat.getMeals());

        cat.Restroom();
        System.out.println(cat.getWeight());
    }
}