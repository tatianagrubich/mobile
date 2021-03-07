
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat("Мурка",2300.0);
        Cat vasya = new Cat();

        vasya.setName(murka.getName());
        vasya.setWeight(murka.getWeight());
        System.out.println(vasya.getName());
        System.out.println(vasya.getWeight());
    }
}